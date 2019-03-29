package com.ck.admin_fiction.service;

import com.ck.admin_fiction.bean.BlogsUserInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserInfoService {
    List<BlogsUserInfo> queryUserInfoList();
}
