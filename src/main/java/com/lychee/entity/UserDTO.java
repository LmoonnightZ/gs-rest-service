package com.lychee.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * Author:ChenLizhen
 * CreateDate:2018/7/8
 * Description:
 */
public class UserDTO  extends Model<UserDTO> {
    private Serializable id;
    private String userId;//用户ID
    private String userName;//用户名
    private String userSeq;//用户序列号
    private String password;//密码
    private String userLevel;//用户层级
    private String userType;//用户类型
    private String status;//状态

    private String orderByField;
    private boolean isAsc;

    public UserDTO() { }

    protected  Serializable getPrimaryKey(){
       return  this.id;
    }

    public UserDTO(Serializable id, String userId, String userName, String userSeq, String password, String userLevel, String userType, String status, String orderByField, boolean isAsc) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.userSeq = userSeq;
        this.password = password;
        this.userLevel = userLevel;
        this.userType = userType;
        this.status = status;
        this.orderByField = orderByField;
        this.isAsc = isAsc;
    }

    public Serializable getId() {
        return id;
    }


    public void setId(Serializable id) {
        this.id = id;
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

    public String getOrderByField() {
        return orderByField;
    }

    public void setOrderByField(String orderByField) {
        this.orderByField = orderByField;
    }

    public boolean isAsc() {
        return isAsc;
    }

    public void setAsc(boolean asc) {
        isAsc = asc;
    }
}

