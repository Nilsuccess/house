package com.nil.house.business.dao;

import com.nil.house.business.model.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  用户信息 Mapper 接口
 * </p>
 *
 * @author NIL
 * @since 2020-12-29
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
