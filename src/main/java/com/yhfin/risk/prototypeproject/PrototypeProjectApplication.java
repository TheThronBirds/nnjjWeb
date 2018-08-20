package com.yhfin.risk.prototypeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 包名称： com.yhfin.risk.webclientdamo 
 * 类名称：WebClientDamoApplication 
 * 类描述：damo入口类
 * 创建人：@author luke 
 * 创建时间：2018年6月26日/上午9:38:20
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.yhfin")
@EnableFeignClients(basePackages = "com.yhfin")
public class PrototypeProjectApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(PrototypeProjectApplication.class, args);
    }
}
