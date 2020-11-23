package com.liuurick.crm.workbench.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: liubin ON 2020/11/23 11:59
 * @param: 
 * @return
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clue {

	//主键
	private String id;

	//全名（人的名字）
	private String fullname;

	//称呼
	private String appellation;

	//所有者
	private String owner;

	//公司名称
	private String company;

	//职业
	private String job;

	//邮箱
	private String email;

	//公司电话
	private String phone;

	//公司网站
	private String website;

	//手机
	private String mphone;

	//状态
	private String state;

	//来源
	private String source;

	//创建人
	private String createBy;

	//创建时间
	private String createTime;

	//修改人
	private String editBy;

	//修改时间
	private String editTime;

	//描述
	private String description;

	//联系纪要
	private String contactSummary;

	//下次联系时间
	private String nextContactTime;

	//地址
	private String address;
	
}
