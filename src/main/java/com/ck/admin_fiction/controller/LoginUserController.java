package com.ck.admin_fiction.controller;

import com.ck.admin_fiction.bean.BlogsLoginInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("login")
public class LoginUserController {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "login",method = {RequestMethod.POST})
    public Object login(@RequestParam String username, @RequestParam String password, Model model) {
        String sql = "select * from blogs_login_info WHERE username =? and password=?";
        RowMapper<BlogsLoginInfo> rowMapper = new BeanPropertyRowMapper<BlogsLoginInfo>(BlogsLoginInfo.class);
        List<BlogsLoginInfo> blogsLoginInfo = jdbcTemplate.query(sql, new Object[]{username, password}, rowMapper);
        if (blogsLoginInfo.size() > 0) {
            model.addAttribute("userInfo", blogsLoginInfo);
            System.out.println(blogsLoginInfo);
            System.out.println("账户：" + blogsLoginInfo.get(0).getUsername() + "密码：" + blogsLoginInfo.get(0).getUsername());
            return "success";
        } else {
            return "error";
        }
    }
}
