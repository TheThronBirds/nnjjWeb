/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月31日/下午9:56:53
 * 项目名称：  prototype-project
 * 文件名称: TableFieldInfoMapper.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.dao;

import java.util.HashMap;
import java.util.List;

import com.yhfin.risk.prototypeproject.model.TableFieldInfo;

/**   

 * 包名称： com.yhfin.risk.prototypeproject.dao 
 * 类名称：TableFieldInfoMapper 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月31日/下午9:56:53
 *     
 */
public interface TableFieldInfoMapper {
    public TableFieldInfo selectFieldInfo(HashMap map);
}
