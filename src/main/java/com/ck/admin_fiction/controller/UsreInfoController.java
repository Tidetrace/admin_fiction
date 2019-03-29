package com.ck.admin_fiction.controller;

import com.ck.admin_fiction.bean.BlogsUserInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UsreInfoController {
    @Resource
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("/getusers")
    public Object getDbType() {
        String sql = "select * from blogs_user_info";
        RowMapper<BlogsUserInfo> rowMapper = new BeanPropertyRowMapper<BlogsUserInfo>(BlogsUserInfo.class);
        List<BlogsUserInfo> list = jdbcTemplate.query(sql, rowMapper);
        for (BlogsUserInfo blogsUserInfo : list) {
            System.out.println(blogsUserInfo.getName() + "\t" + blogsUserInfo.getAge());
        }
        return list;
    }
}
