/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年8月1日/上午10:06:32
 * 项目名称：  prototype-project
 * 文件名称: TableInfoServiceImpl.java
 * 文件描述: @Description: TODO(用一句话描述该文件做什么)
 * 公司名称: 深圳市赢和信息技术有限公司
 *
 * All rights Reserved, Designed By 深圳市赢和信息技术有限公司
 * @Copyright:2016-2018
 * 
 */
package com.yhfin.risk.prototypeproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhfin.risk.prototypeproject.dao.TableInfoMapper;
import com.yhfin.risk.prototypeproject.model.TableInfo;
import com.yhfin.risk.prototypeproject.model.TableModule;
import com.yhfin.risk.prototypeproject.model.TableName;
import com.yhfin.risk.prototypeproject.service.TableInfoService;

/**   

 * 包名称： com.yhfin.risk.prototypeproject.service.impl 
 * 类名称：TableInfoServiceImpl 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年8月1日/上午10:06:32
 *     
 */

@Service
public class TableInfoServiceImpl implements TableInfoService{
    
    @Autowired
    public TableInfoMapper tableInfoDao;
    
    @Override
    public TableInfo selectByTableName(String TableName) {
        System.out.println();
        return tableInfoDao.selectByTableName(TableName);
        
    }
    
    @Override
    public List<TableName> selectTableName(){
        return tableInfoDao.selectTableName();
    }
    
    @Override
    public List<TableModule> selectTableByModule(){
        return tableInfoDao.selectTableByModule();
    }
}
