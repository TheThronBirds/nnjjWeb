/**
 * 创建人：     @author luzejin    
 * 创建时间: 2018年7月27日/下午3:14:16
 * 项目名称：  prototype-project
 * 文件名称: UserServiceImpl.java
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

import com.yhfin.risk.prototypeproject.dao.TableDetailsMapper;
import com.yhfin.risk.prototypeproject.model.TableDetails;
import com.yhfin.risk.prototypeproject.model.TableName;
import com.yhfin.risk.prototypeproject.model.User;
import com.yhfin.risk.prototypeproject.service.TableDetailsService;

/**  

 
 * 包名称： com.yhfin.risk.prototypeproject.service.impl 
 * 类名称：UserServiceImpl 
 * 类描述：TODO
 * 创建人：@author luzejin 
 * 创建时间：2018年7月27日/下午3:14:16
 *     
 */
@Service
public class TableDetailsServiceImpl implements TableDetailsService {
    
    @Autowired
    public TableDetailsMapper TableDetailsDao;
    /* (non-Javadoc)
     * @see com.yhfin.risk.prototypeproject.service.UserService#SelectAll()
     */
    @Override
    public List<TableDetails> SelectAll() {
        // TODO Auto-generated method stub
        return TableDetailsDao.selectAll();
    }
    
    @Override
    public List<TableDetails> SelectByTableName(String TableName){
        return TableDetailsDao.selectBytableName(TableName);
    }
    

}
