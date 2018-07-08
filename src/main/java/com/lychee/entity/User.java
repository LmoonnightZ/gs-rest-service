package com.lychee.entity;


/**
 * Author:ChenLizhen
 * CreateDate:2018/6/23
 * Description:
 */
public class User {
    private String userId;//用户ID
    private String userName;//用户名
    private String userSeq;//用户序列号
    private String password;//密码
    private String userLevel;//用户层级
    private String userType;//用户类型
    private String status;//状态

    public User() { }

    public User(String userId, String userName, String userSeq, String password, String userLevel, String userType, String status) {
        this.userId = userId;
        this.userName = userName;
        this.userSeq = userSeq;
        this.password = password;
        this.userLevel = userLevel;
        this.userType = userType;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(String userSeq) {
        this.userSeq = userSeq;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
