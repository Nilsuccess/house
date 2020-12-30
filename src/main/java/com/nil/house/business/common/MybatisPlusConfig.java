package com.nil.house.business.common;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author NIL
 * @date 2020/12/29 16:37
 * @description MybatisPlusConfig
 */
@Configuration
@ConditionalOnClass(value = {PaginationInterceptor.class})
public class MybatisPlusConfig {

    /**
     * 分页设置
     *
     * @return paginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
