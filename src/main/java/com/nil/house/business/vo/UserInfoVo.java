package com.nil.house.business.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author NIL
 * @date 2020/12/30 9:30
 * @description UserInfoVo
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserInfoVo extends BasePageVo implements Serializable {

    private static final long serialVersionUID = 4055457767401203679L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

}
