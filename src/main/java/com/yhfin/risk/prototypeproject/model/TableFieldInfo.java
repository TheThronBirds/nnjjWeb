/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月31日/下午9:48:06
 * 项目名称：  prototype-project
 * 文件名称: TableFieldInfo.java
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
 * 类名称：TableFieldInfo 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月31日/下午9:48:06
 *     
 */

@Data
public class TableFieldInfo {
    
    
    //表名
    private String tableName;
    
   //字段名
    private String name;
    
    //枚举
    
    private String enumRemark;
    
    //备注
    private String remark;
    //业务说明
    private String business;
}
