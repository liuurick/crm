package com.liuurick.crm.workbench.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liubin ON 2020/11/23 11:55
 * @param:
 * @return
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityRemark {

    private String id;

    /**
     * 备注信息
     */
    private String noteContent;
    private String createTime;
    private String createBy;
    private String editTime;
    private String editBy;

    /**
     * 是否修改过的标记
     */
    private String editFlag;
    private String activityId;

}
