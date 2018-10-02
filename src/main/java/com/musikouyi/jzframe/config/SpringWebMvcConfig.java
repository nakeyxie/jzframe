package com.musikouyi.jzframe.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.MultipartConfigElement;

@Configuration
public class SpringWebMvcConfig implements WebMvcConfigurer {

    /**
     * 解决跨域访问
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:9528")
                .allowedMethods("*")
                .allowCredentials(false).maxAge(3600);
    }

    /**
     * 增加对rest api鉴权的spring mvc拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new RestApiInteceptor()).addPathPatterns(ControllerMapping.ADMIN_BASE + "/**");
    }
}
