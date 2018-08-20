/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月31日/下午9:54:48
 * 项目名称：  prototype-project
 * 文件名称: TableFieldInfoServiceImpl.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhfin.risk.prototypeproject.dao.TableFieldInfoMapper;
import com.yhfin.risk.prototypeproject.model.TableFieldInfo;
import com.yhfin.risk.prototypeproject.service.TableFieldInfoService;

/**   

 * 包名称： com.yhfin.risk.prototypeproject.service.impl 
 * 类名称：TableFieldInfoServiceImpl 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月31日/下午9:54:48
 *     
 */
@Service
public class TableFieldInfoServiceImpl implements TableFieldInfoService {

    @Autowired
    public TableFieldInfoMapper TableFieldInfoDao;
    /* (non-Javadoc)

     * @see com.yhfin.risk.prototypeproject.service.TableFieldInfoService#selectFieldInfo(java.util.HashMap)
     */
    @Override
    public TableFieldInfo selectFieldInfo(String tableName,String name) {
        // TODO Auto-generated method stub
        HashMap map = new HashMap();
        map.put("tableName", tableName);
        map.put("name", name);
        System.out.println("666" + tableName);
        TableFieldInfo tableFieldInfo = TableFieldInfoDao.selectFieldInfo(map);
        System.out.println(tableFieldInfo);
        return tableFieldInfo;
    }

}
