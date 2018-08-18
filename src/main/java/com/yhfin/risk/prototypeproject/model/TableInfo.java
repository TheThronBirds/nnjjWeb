/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年8月1日/上午10:01:18
 * 项目名称：  prototype-project
 * 文件名称: TableInfo.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.model;


import lombok.Data;

/**   
 * 包名称： com.yhfin.risk.prototypeproject.model 
 * 类名称：TableInfo 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年8月1日/上午10:01:18
 *     
 */
@Data
public class TableInfo {
    
    //表名
    private String tableName;
    //中文名称
    private String chName;
    //中文简称
    private String chShortName;
    //主键
    private String PrimaryKey;
    //唯一索引
    private String UniqueIndex;
    //表类型 暂定1 为基础表
    private Integer Table_type;
    //表说明
    private String details;
}
