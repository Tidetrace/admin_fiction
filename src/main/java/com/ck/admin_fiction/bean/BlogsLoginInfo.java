package com.ck.admin_fiction.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
@Getter
@Setter
public class BlogsLoginInfo {
    private String uuit;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;
    private int roleId;
}
