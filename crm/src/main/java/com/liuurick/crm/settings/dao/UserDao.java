package com.liuurick.crm.settings.dao;

import com.liuurick.crm.settings.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @Author: liubin ON 2020/11/20 19:50
 * @param:
 * @return
 * @Description:
 */

public interface UserDao {

    User login(Map<String, String> map);

    List<User> getUserList();
}
