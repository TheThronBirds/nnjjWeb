/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月27日/下午3:22:56
 * 项目名称：  prototype-project
 * 文件名称: Usermapper.java
 * 文件描述: @Description: TODO(查询用户)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.dao;

import java.util.List;


import com.yhfin.risk.prototypeproject.model.TableDetails;
import com.yhfin.risk.prototypeproject.model.TableModule;
import com.yhfin.risk.prototypeproject.model.TableName;
import com.yhfin.risk.prototypeproject.model.User;

/**   


 * 包名称： com.yhfin.risk.prototypeproject.dao 
 * 类名称：Usermapper 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月27日/下午3:22:56
 *     
 */
public interface TableDetailsMapper {
    public List<TableDetails> selectAll();
    
    public List<TableDetails> selectBytableName(String tableName);
    
    //查询所有表名
    public List<TableName> selectTableName();
    
    public List<TableModule> selectTableByModule();
}
