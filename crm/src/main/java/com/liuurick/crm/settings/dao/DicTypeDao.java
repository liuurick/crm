package com.liuurick.crm.settings.dao;

import com.liuurick.crm.settings.domain.DicType;

import java.util.List;

/**
 * @Author: liubin ON 2020/11/20 19:49
 * @param:
 * @return
 * @Description:
 */

public interface DicTypeDao {
    List<DicType> getTypeList();
}
