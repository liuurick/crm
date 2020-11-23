package com.liuurick.crm.workbench.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liubin ON 2020/11/23 11:52
 * @param:
 * @return
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

    private String id;

    /**
     * 所有者 外键 关联tbl_user
     */
    private String owner;

    /**
     * 市场活动名称
     */
    private String name;

    private String startDate;

    private String endDate;

    /**
     * 市场活动的成本
     */
    private String cost;

    /**
     * 市场活动的成本
     */
    private String description;

    /**
     *  创建时间 年月日时分秒
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间 年月日时分秒
     */
    private String editTime;

    /**
     * 修改人
     */
    private String editBy;

}
