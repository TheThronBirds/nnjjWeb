/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月31日/下午6:02:59
 * 项目名称：  prototype-project
 * 文件名称: TableFieldInfoController.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;
import com.netflix.discovery.converters.jackson.builder.StringInterningAmazonInfoBuilder;
import com.yhfin.risk.prototypeproject.service.TableFieldInfoService;
import com.yhfin.ycmp.api.vo.YhResponseData;

/**   

 * 包名称： com.yhfin.risk.prototypeproject.controller 
 * 类名称：TableFieldInfoController 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月31日/下午6:02:59
 *     
 */
@RestController
@RequestMapping(value = "/risk")
public class TableFieldInfoController {
    private static final Logger logger = LoggerFactory.getLogger(TableFieldInfoController.class);
    
    @Autowired
    public TableFieldInfoService tableFieldInfoService;
    
    @RequestMapping(value="TableFieldInfo",method=RequestMethod.GET,produces="application/json;charset=utf-8")
    public YhResponseData getTableFieldInfo(String tableName,String name) {
        YhResponseData responseData = null;
        
        
        System.out.println(tableName + "||" + name);
        try {
            responseData = YhResponseData.handleSuccess(tableFieldInfoService.selectFieldInfo(tableName, name));
        }catch(Exception e) {
            logger.error("fundtypelist error{}",e.getMessage(),e);
            responseData =YhResponseData.handleError("获取字段数据出错:" + e.getMessage());
        }
        
        
        
        return responseData;
    }
}
