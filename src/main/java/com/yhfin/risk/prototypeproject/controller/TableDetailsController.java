/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月27日/下午3:07:37
 * 项目名称：  prototype-project
 * 文件名称: UserController.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.yhfin.risk.prototypeproject.model.TableDetails;
import com.yhfin.risk.prototypeproject.model.User;
import com.yhfin.risk.prototypeproject.service.TableDetailsService;
import com.yhfin.ycmp.api.vo.YhResponseData;


/**

   
 * 包名称： com.yhfin.risk.prototypeproject.controller 
 * 类名称：UserController 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月27日/下午3:07:37
 *     
 */
@RestController
@RequestMapping(value = "/risk")
public class TableDetailsController {
    private static final Logger logger = LoggerFactory.getLogger(TableDetailsController.class);
    @Autowired
    public TableDetailsService tableDetailsService;
    @RequestMapping(value = "/tableSearch", method = RequestMethod.GET,produces="application/json;charset=utf-8")
    @ResponseBody
    public YhResponseData getFundTypeList(String tableName) {
        YhResponseData responseData = null;
        System.out.println(tableName +"表名");
        try {
            if("".equals(tableName)||tableName == null) {
                responseData = YhResponseData.handleSuccess(tableDetailsService.SelectAll());
            }else {
                responseData = YhResponseData.handleSuccess(tableDetailsService.SelectByTableName(tableName));
            }
            
        } catch (Exception e) {
            logger.error("fundtypelist error{}",e.getMessage(),e);
            responseData =YhResponseData.handleError("获取基金类型出错:" + e.getMessage());
        }
        return responseData;        
    }
    
    
    
}
