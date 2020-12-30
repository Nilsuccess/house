package com.nil.house.business.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nil.house.business.common.RestResponse;
import com.nil.house.business.model.UserInfo;
import com.nil.house.business.service.UserInfoService;
import com.nil.house.business.vo.UserInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 用户信息前端控制器
 * </p>
 *
 * @author NIL
 * @since 2020-12-29
 */
@Slf4j
@RestController
@RequestMapping("userInfo")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    /**
     * 用户信息添加
     *
     * @param userInfo 用户信息
     * @return 添加结果
     */
    @PostMapping("add")
    public RestResponse addUser(@RequestBody UserInfo userInfo) {
        log.info(userInfo.toString());
        return userInfoService.save(userInfo) == Boolean.TRUE ?
                RestResponse.createResult(200, "添加成功") : RestResponse.createDefaultFailResult();

    }

    /**
     * 列表获取
     *
     * @return 用户列表
     */
    @GetMapping("list")
    public RestResponse getList() {
        return RestResponse.createSuccessResult(userInfoService.list());
    }


    /**
     * 用户分页列表
     *
     * @param userInfoVo 参数封装
     * @return 用户分页列表
     */
    @PostMapping("page")
    public RestResponse getPage(@RequestBody UserInfoVo userInfoVo) {
        Page<UserInfo> userInfoPage = new Page<>(userInfoVo.getPageIndex(), userInfoVo.getPageSize());
        IPage<UserInfo> page = userInfoService.page(userInfoPage);
        return RestResponse.createSuccessResult(page);
    }
}

