package com.liuurick.crm.workbench.dao;

import com.liuurick.crm.workbench.domain.ActivityRemark;

import java.util.List;

/**
 * Created by liubin on 2020/12/1
 */
public interface ActivityRemarkDao {

    int getCountByAids(String[] ids);

    int deleteByAids(String[] ids);

    List<ActivityRemark> getRemarkListByAid(String activityId);

    int deleteById(String id);

    int saveRemark(ActivityRemark ar);

    int updateRemark(ActivityRemark ar);
}
