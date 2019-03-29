package com.ck.admin_fiction.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@Getter
@Setter
public class BlogsUserInfo {
    private String uuit;
    private String name;
    private int age;
    private String address;
    private String phone;
    private String company;
}