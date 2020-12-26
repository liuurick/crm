package com.liuurick.crm.workbench.service;

import com.liuurick.crm.vo.PaginationVO;
import com.liuurick.crm.workbench.domain.Activity;

import java.util.Map;

/**
 * Created by liubin on 2020/11/23
 */
public interface ActivityService {
    /**
     *  保存活动
      * @param activity
     * @return
     */
    boolean save(Activity activity);

    PaginationVO<Activity> pageList(Map<String, Object> map);

    boolean delete(String[] ids);

    Map<String, Object> getUserListAndActivity(String id);

    boolean update(Activity activity);
}
