package com.liuurick.crm.workbench.service.impl;

import com.liuurick.crm.utils.SqlSessionUtil;
import com.liuurick.crm.workbench.dao.ActivityDao;
import com.liuurick.crm.workbench.domain.Activity;
import com.liuurick.crm.workbench.service.ActivityService;

/**
 * Created by liubin on 2020/11/23
 */
public class ActivityServiceImpl implements ActivityService {
    private ActivityDao activityDao = SqlSessionUtil.getSqlSession().getMapper(ActivityDao.class);

    @Override
    public boolean save(Activity activity) {
        boolean flag = true;

        int count = activityDao.save(activity);
        if (count != 1){
            flag = false;
        }
        return flag;
    }
}
