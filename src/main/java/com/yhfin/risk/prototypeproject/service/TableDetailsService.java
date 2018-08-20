/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月27日/下午3:12:47
 * 项目名称：  prototype-project
 * 文件名称: UserService.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.service;

import java.util.List;


import com.yhfin.risk.prototypeproject.model.TableDetails;
import com.yhfin.risk.prototypeproject.model.TableName;
import com.yhfin.risk.prototypeproject.model.User;

/**   
 * 包名称： com.yhfin.risk.prototypeproject.service 
 * 类名称：UserService 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月27日/下午3:12:47
 *     
 */
public interface TableDetailsService {
    public List<TableDetails> SelectAll();
    
    //根据表名进行查询
    
    public List<TableDetails> SelectByTableName(String tableName);
    
    
    
}
