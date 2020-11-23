package com.liuurick.crm.settings.service;

import com.liuurick.crm.settings.domain.User;

import javax.security.auth.login.LoginException;
import java.util.List;

/**
 * Created by liubin on 2020/11/20
 */
public interface UserService {

    User login(String loginAct, String loginPwd, String ip) throws LoginException;

    List<User> getUserList();
}
