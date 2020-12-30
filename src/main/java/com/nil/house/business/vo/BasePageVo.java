package com.nil.house.business.vo;

import lombok.Data;

/**
 * @author NIL
 * @date 2020/12/30 9:31
 * @description PageBaes
 */
@Data
abstract class BasePageVo {

    private Integer pageIndex;

    private Integer pageSize;
}
