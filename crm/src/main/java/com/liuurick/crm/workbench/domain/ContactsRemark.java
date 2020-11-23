package com.liuurick.crm.workbench.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactsRemark {
	
	private String id;
	private String noteContent;
	private String createTime;
	private String createBy;
	private String editTime;
	private String editBy;
	private String editFlag;
	private String contactsId;
	
	
}
