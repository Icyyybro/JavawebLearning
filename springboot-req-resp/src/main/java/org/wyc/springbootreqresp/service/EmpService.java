package org.wyc.springbootreqresp.service;

import org.wyc.springbootreqresp.dao.EmpDao;
import org.wyc.springbootreqresp.pojo.Emp;

import java.util.List;

public interface EmpService {
    // 获取员工列表数据
    public List<Emp> listEmp();
}
