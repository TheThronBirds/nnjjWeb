/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月27日/下午3:46:31
 * 项目名称：  prototype-project
 * 文件名称: Table_details.java
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
 * 类名称：Table_details 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月27日/下午3:46:31
 *     
 */
@Data
public class TableDetails {

    //字段名称
    private String name;
    //字段中文名称
    private String chName;
    //字段类型
    private String type;
    //字段单位
    private String unit;
    //字段状态
    private Integer state;
    //枚举
    private Integer enumRemark;
    //备注
    private Integer remark;
    //表名
    private String tableName;
    //外部来源表名
    private String SourceTableName;
    //外部数据来源
    private String outDataSource;
    //存储过程
    private String procedure;
    //业务信息
    private Integer business;
   
}
