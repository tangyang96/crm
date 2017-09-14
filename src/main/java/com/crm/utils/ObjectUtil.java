package com.crm.utils;

import java.util.UUID;

/**
 * Created by ae on 2017/9/14.
 */
public class ObjectUtil {

    public static boolean isNotNull(Object object) {
        return null != object;
    }

    public static boolean isNull(Object object) {
        return null == object;
    }

    /**
     * 生成UUID
     *
     * @return
     */
    public static String genId() {
        //不能去掉-，因为mongo id要36位，去掉-就不足位数了
        return UUID.randomUUID().toString();
    }

//    public static ObjectId genMongoId() {
//        return new ObjectId();
//    }

    /**
     * 生成大写UUID并去年横杠
     *
     * @return
     */
    public static String genUpperCaseId() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    /**
     * 生成小写UUID并去年横杠
     *
     * @return
     */
    public static String genLowerCaseId() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }


}
