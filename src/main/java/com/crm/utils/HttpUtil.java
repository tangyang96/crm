package com.crm.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/9/12.
 */
public class HttpUtil {
    /**
     * 发送http请求
     *
     * @param url
     *            请求地址
     * @param method
     *            请求方法
     * @param param
     *            请求参数
     * @param charset
     *            字符集
     * @return 返回请求结果
     */
    public static String sendHttpReq(String url, String method, String param, String charset) throws Exception {
        URL urlobj = new URL(url);
        HttpURLConnection conn = null;
        BufferedOutputStream bos = null;
        BufferedReader br = null;
        try {
            conn = (HttpURLConnection) urlobj.openConnection();
            conn.setDoInput(true);// 读取指定url服务器的资源
            conn.setUseCaches(false);// 是否需要缓存
            conn.setConnectTimeout(1000 * 60);// 一分钟连接超时
            conn.setReadTimeout(1000 * 60);// 读取数据超时
            conn.setRequestMethod(method);
            if (param != null) {
                conn.setDoOutput(true);// 写入数据到指定url服务器
                bos = new BufferedOutputStream(conn.getOutputStream());
                bos.write(param.getBytes(charset));
                bos.flush();
            }
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();

        } finally {
            closeAll(br, null, bos, conn);
        }
    }

    public static void closeAll(Reader reader, InputStream is, OutputStream out, HttpURLConnection conn) {
        try {
            if (reader != null) reader.close();
            if (is != null) is.close();
            if (out != null) out.close();
            if (conn != null) conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String upload(
            String url,
            String filepath,
            String charset) throws Exception {
        HttpURLConnection conn =null;
        BufferedOutputStream bufout=null;
        BufferedReader bufrd=null;
        BufferedInputStream fileinput=null;
        try {
            URL urlobj = new URL(url);
            conn = (HttpURLConnection) urlobj
                    .openConnection();
            conn.setDoInput(true);// 读取指定url服务器的资源
            conn.setDoOutput(true);// 写入数据到指定url服务器
            conn.setUseCaches(false);
            conn.setConnectTimeout(1000 * 60);// 1分钟超时
            conn.setReadTimeout(1000 * 60);// 1分钟超时
            conn.setRequestMethod("POST");//设置请求方法
            String boundary=String.valueOf(System.currentTimeMillis());
            //设置请求头
            conn.addRequestProperty("Content-Type","multipart/form-data; boundary="+boundary);
            //设置附件表单信息
            StringBuilder headstr=new StringBuilder("--");
            headstr.append(boundary).append("\r\n")
                    .append("Content-Disposition: form-data; name=\"file\"; filename=\"")
                    .append(filepath).append("\"").append("\r\n")
                    .append("Content-Type: application/octet-stream\r\n\r\n");

            bufout = new BufferedOutputStream(
                    conn.getOutputStream());
            //写入表单信息
            bufout.write(headstr.toString().getBytes(charset));
            //bufout.flush();
            //写入附件
            fileinput = new BufferedInputStream(new FileInputStream(filepath));
            byte[] bytebuf=new byte[1024];
            int len=0;
            while((len=fileinput.read(bytebuf))!=-1){
                bufout.write(bytebuf,0,len);
            }
            bufout.write(("\r\n--"+boundary+"--\r\n").getBytes(charset));
            bufout.flush();//因为使用了缓冲流，必须执行
            //bufout.close();
            //fileinput.close();

            bufrd = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), charset));

            String line = null;
            StringBuilder strbui = new StringBuilder();
            while ((line = bufrd.readLine()) != null) {
                strbui.append(line).append("\n");
            }
            bufrd.close();
            conn.disconnect();
            return strbui.toString();
        } finally {
            closeAll(bufrd,fileinput,bufout,conn);
        }
    }

    public static String mapToParam(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String, String>> entries = map.entrySet();

        boolean hasParam = false;

        for (Map.Entry<String, String> entry : entries) {
            String name = entry.getKey();
            String value = entry.getValue();
            if (hasParam) {
                sb.append("&");
            } else {
                hasParam = true;
            }

            sb.append(name).append("=").append(value);
        }

        return sb.toString();
    }

}
