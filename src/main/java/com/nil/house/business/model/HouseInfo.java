package com.nil.house.business.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *  房屋信息 数据实体类
 * </p>
 *
 * @author NIL
 * @since 2020-12-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class HouseInfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 主标题
     */
    private String title;

    /**
     * 省份标签
     */
    private String tabProvince;


    public static final String ID = "id";

    public static final String TITLE = "title";

    public static final String TAB_PROVINCE = "tab_province";

}
