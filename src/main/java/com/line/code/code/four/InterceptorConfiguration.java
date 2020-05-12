package com.line.code.code.four;

import com.line.code.code.four.DingDLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class InterceptorConfiguration extends WebMvcConfigurationSupport {

    @Autowired
    private DingDLoginInterceptor loginInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则，/**表示拦截所有请求
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(loginInterceptor).addPathPatterns("/login/**")
                .excludePathPatterns("/send/**");
        super.addInterceptors(registry);
    }
}
