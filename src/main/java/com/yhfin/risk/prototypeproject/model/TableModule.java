/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年8月13日/下午11:38:32
 * 项目名称：  prototype-project
 * 文件名称: tableModule.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.model;

import java.util.List;

import lombok.Data;

/**   
 * 包名称： com.yhfin.risk.prototypeproject.model 
 * 类名称：tableModule 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年8月13日/下午11:38:32
 *     
 */
@Data
public class TableModule {
    
    private Integer id;
    
    private String Name;
    
    private String chName;
    
    private List<TableName> tableNames;
}
