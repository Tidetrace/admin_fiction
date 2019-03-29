package com.ck.admin_fiction.service.serviceimpl;

import com.ck.admin_fiction.bean.BlogsUserInfo;
import com.ck.admin_fiction.mapper.UserInfoMapper;
import com.ck.admin_fiction.service.UserInfoService;

import javax.annotation.Resource;
import java.util.List;

public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<BlogsUserInfo> queryUserInfoList() {

        return userInfoMapper.queryUserInfoList();
    }
}
