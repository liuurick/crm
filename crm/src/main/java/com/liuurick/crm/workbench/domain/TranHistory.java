package com.liuurick.crm.workbench.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TranHistory {
	
	private String id;
	private String stage;
	private String money;
	private String expectedDate;
	private String createTime;
	private String createBy;
	private String tranId;

	//扩充可能性 在交易详细信息页中取得历史列表需求时用到该扩充属性
	private String possibility;
	
}
