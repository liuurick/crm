package com.liuurick.crm.settings.service.impl;

import com.liuurick.crm.settings.dao.UserDao;
import com.liuurick.crm.settings.domain.User;
import com.liuurick.crm.utils.MD5Util;
import com.liuurick.crm.utils.SqlSessionUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by liubin on 2020/11/21
 */
public class UserServiceImplTest {

    private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
    @Test
    public void login() {
        Map<String,String> userMap = new HashMap();
        String loginAct = "ls";
        String loginPwd = "123";
        loginPwd = MD5Util.getMD5(loginPwd);
        userMap.put("loginAct",loginAct);
        userMap.put("loginPwd",loginPwd);
        User user = userDao.login(userMap);
        System.out.println(user);

    }
}