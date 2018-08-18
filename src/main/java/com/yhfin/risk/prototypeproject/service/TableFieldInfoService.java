/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月31日/下午9:53:09
 * 项目名称：  prototype-project
 * 文件名称: TableFieldInfoService.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.service;

import java.util.HashMap;
import java.util.List;

import com.netflix.discovery.converters.jackson.builder.StringInterningAmazonInfoBuilder;
import com.yhfin.risk.prototypeproject.model.TableFieldInfo;

/**   
 * 包名称： com.yhfin.risk.prototypeproject.service 
 * 类名称：TableFieldInfoService 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月31日/下午9:53:09
 *     
 */
public interface TableFieldInfoService {
    public TableFieldInfo selectFieldInfo(String tableName,String name);
}
