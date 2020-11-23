package com.liuurick.crm.workbench.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClueRemark {
	
	private String id;
	private String noteContent;
	private String createBy;
	private String createTime;
	private String editBy;
	private String editTime;
	private String editFlag;
	private String clueId;

	
}
