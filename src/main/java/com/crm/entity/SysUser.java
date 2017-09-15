package com.crm.entity;

/**
 * Created by Administrator on 2017/9/12.
 * 用户表
 */
public class SysUser {
  private  String userName;
  private String userAccounts;
  private String userPSassword;
  private Integer userStatus;
  private String userDepartment;
  private String userPosition;
  private String userEmail;
  private String userPhone;
  private String userWorkphone;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(String userAccounts) {
        this.userAccounts = userAccounts;
    }

    public String getUserPSassword() {
        return userPSassword;
    }

    public void setUserPSassword(String userPSassword) {
        this.userPSassword = userPSassword;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserWorkphone() {
        return userWorkphone;
    }

    public void setUserWorkphone(String userWorkphone) {
        this.userWorkphone = userWorkphone;
    }
}
