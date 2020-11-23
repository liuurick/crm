package com.liuurick.crm.workbench.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contacts {
	
	private String id;
	private String owner;
	private String source;
	private String customerId;
	private String fullname;
	private String appellation;
	private String email;
	private String mphone;
	private String job;
	private String birth;
	private String createBy;
	private String createTime;
	private String editBy;
	private String editTime;
	private String description;
	private String contactSummary;
	private String nextContactTime;
	private String address;

	
}
