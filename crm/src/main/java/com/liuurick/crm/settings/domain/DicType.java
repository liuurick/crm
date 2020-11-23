package com.liuurick.crm.settings.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liubin ON 2020/11/20 19:38
 * @param: 
 * @return 
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DicType {

    private String code;
    private String name;
    private String description;
}
