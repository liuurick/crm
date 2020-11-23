package com.liuurick.crm.workbench.service;

import com.liuurick.crm.workbench.domain.Activity;

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

}
