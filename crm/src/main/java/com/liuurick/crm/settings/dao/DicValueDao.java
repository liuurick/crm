package com.liuurick.crm.settings.dao;

import com.liuurick.crm.settings.domain.DicValue;

import java.util.List;

/**
 * @Author: liubin ON 2020/11/20 19:50
 * @param:
 * @return
 * @Description:
 */

public interface DicValueDao {
    List<DicValue> getListByCode(String code);
}
