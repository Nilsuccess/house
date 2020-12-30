package com.nil.house.business.service.impl;

import com.nil.house.business.model.UserInfo;
import com.nil.house.business.dao.UserInfoMapper;
import com.nil.house.business.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  用户信息服务实现类
 * </p>
 *
 * @author NIL
 * @since 2020-12-29
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
