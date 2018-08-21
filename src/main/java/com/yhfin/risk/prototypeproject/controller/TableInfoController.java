/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年8月1日/上午10:20:42
 * 项目名称：  prototype-project
 * 文件名称: TableInfoController.java
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.yhfin.risk.prototypeproject.model.TableInfo;
import com.yhfin.risk.prototypeproject.service.TableInfoService;
import com.yhfin.ycmp.api.vo.YhResponseData;

/**   

 * 包名称： com.yhfin.risk.prototypeproject.controller 
 * 类名称：TableInfoController 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年8月1日/上午10:20:42
 *     
 */
@RestController
@RequestMapping(value = "/risk")
public class TableInfoController {
    private static final Logger logger = LoggerFactory.getLogger(TableDetailsController.class);
    @Autowired
    public TableInfoService tableInfoService;
    @RequestMapping(value="tableInfo",method=RequestMethod.GET,produces="application/json;charset=utf-8")
    @ResponseBody
    public YhResponseData selectByTableName(String tableName) {
        YhResponseData responseData = null;
        
        try {
            responseData = YhResponseData.handleSuccess(tableInfoService.selectByTableName(tableName));
        }catch (Exception e) {
            logger.error("selectByTableName",e.getMessage(),e);
            responseData =YhResponseData.handleError("获取基金类型出错:" + e.getMessage());
        }
        
        return responseData;
    }
    
    @RequestMapping(value = "/tableName", method = RequestMethod.GET,produces="application/json;charset=utf-8")
    @ResponseBody
    public YhResponseData getAllTableName() {
        YhResponseData responseData = null;
        try {
                responseData = YhResponseData.handleSuccess(tableInfoService.selectTableByModule());
            
        } catch (Exception e) {
            logger.error("getAllTableName error{}",e.getMessage(),e);
            responseData =YhResponseData.handleError("获取表名出错:" + e.getMessage());
        }
        return responseData;         
    }
    
    @RequestMapping(value="searchTable",method=RequestMethod.GET,produces="application/json;charset=utf-8")
    @ResponseBody
    public YhResponseData selectByTableName1(String tableName) {
        YhResponseData responseData = null;
        tableName = tableName.trim();
        try {
            responseData = YhResponseData.handleSuccess(tableInfoService.selectByTableName1(tableName));
        }catch (Exception e) {
            logger.error("selectByTableName",e.getMessage(),e);
            responseData =YhResponseData.handleError("查询表出错:" + e.getMessage());
        }
        
        return responseData;
    }
    
}
