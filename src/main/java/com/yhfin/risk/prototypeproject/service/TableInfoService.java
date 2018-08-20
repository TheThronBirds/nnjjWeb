/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年8月1日/上午10:05:47
 * 项目名称：  prototype-project
 * 文件名称: TableInfoService.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.service;

import java.util.List;

import com.yhfin.risk.prototypeproject.model.TableInfo;
import com.yhfin.risk.prototypeproject.model.TableModule;
import com.yhfin.risk.prototypeproject.model.TableName;

/**   
 * 包名称： com.yhfin.risk.prototypeproject.service 
 * 类名称：TableInfoService 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年8月1日/上午10:05:47
 *     
 */
public interface TableInfoService {
    public TableInfo selectByTableName(String tableName);
    public List<TableName> selectTableName();
    
    
    public List<TableModule> selectTableByModule();
}
