package com.liuurick.crm.vo;

import lombok.Data;

import java.util.List;

/**
 * @author liubin
 */
@Data
public class PaginationVO<T> {

    private int total;
    private List<T> dataList;

}
