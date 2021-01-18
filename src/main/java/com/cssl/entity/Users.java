package com.cssl.entity;

import java.io.Serializable;

public class Users implements Serializable {
    private String uname;
    private String upwd;

    public String getUname() {
        return uname;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                '}';
    }

    public Users() {
    }

    public Users(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}
