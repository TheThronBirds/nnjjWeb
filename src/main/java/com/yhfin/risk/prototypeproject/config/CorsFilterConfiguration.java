package com.yhfin.risk.prototypeproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 
 * 包名称： com.yhfin.risk.basic.config 
 * 类名称：CorsFilterConfiguration 
 * 类描述：TODO
 * 创建人：@author wangkai 
 * 创建时间：2018年2月23日/下午5:28:20
 *
 */
@Configuration
public class CorsFilterConfiguration {
	
	/**
     * 
     * @Title: buildConfig
     * @Description: 处理 跨域问题:例如远程swagger-ui 访问http://localhost/v2/api-docs时,则会报cors跨域问题
     * @return   
     * @return: CorsConfiguration   
     * @throws
     * @author: wangkai 
     * @Date:  2017年11月25日/上午11:33:57
     */
	private CorsConfiguration buildConfig() {  
        CorsConfiguration corsConfiguration = new CorsConfiguration();  
        /** 允许cookies跨域*/
        corsConfiguration.setAllowCredentials(true);
        /** 允许向该服务器提交请求的URI，*表示全部允许，在SpringMVC中，如果设成*，会自动转成当前请求头中的Origin*/
        corsConfiguration.addAllowedOrigin("*");  
        /** 允许访问的头信息,*表示全部*/
        corsConfiguration.addAllowedHeader("*"); 
        /** 允许提交请求的方法，*表示全部允许*/
        corsConfiguration.addAllowedMethod("*"); 
        return corsConfiguration;  
    }  
	
	 /**
     * 
     * @Title: corsFilter
     * @Description: 跨域过滤器 
     * @return   
     * @return: CorsFilter   
     * @throws
     * @author: wangkai 
     * @Date:  2017年11月25日/上午11:34:16
     */
	@Bean  
    public CorsFilter corsFilter() {  
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
        source.registerCorsConfiguration("/**", buildConfig()); 
        return new CorsFilter(source);  
    }
}
