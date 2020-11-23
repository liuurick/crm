package com.liuurick.crm.settings.service.impl;

import com.liuurick.crm.settings.dao.UserDao;
import com.liuurick.crm.settings.domain.User;
import com.liuurick.crm.settings.service.UserService;
import com.liuurick.crm.utils.DateTimeUtil;
import com.liuurick.crm.utils.MD5Util;
import com.liuurick.crm.utils.SqlSessionUtil;

import javax.security.auth.login.LoginException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liubin on 2020/11/20
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);

    @Override
    public User login(String loginAct, String loginPwd, String ip) throws LoginException {

        Map<String,String> userMap = new HashMap<String,String>();
        userMap.put("loginAct",loginAct);
        userMap.put("loginPwd",loginPwd);

        User user = userDao.login(userMap);
        if (user == null){
            throw new LoginException("用户名或密码不正确");
        }
        //继续验证其他信息
        //验证失效时间
        String expireTime = user.getExpireTime();
        String currentTime = DateTimeUtil.getSysTime();
        if(expireTime.compareTo(currentTime)<0){
            throw new LoginException("账号已失效");
        }

        //判断锁定状态
        String lockState = user.getLockState();
        if("0".equals(lockState)){
            throw new LoginException("账号已锁定");
        }

        //判断ip地址
        String allowIps = user.getAllowIps();
        if(!allowIps.contains(ip)){
            throw new LoginException("ip地址受限");
        }
        return user;
    }


    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
