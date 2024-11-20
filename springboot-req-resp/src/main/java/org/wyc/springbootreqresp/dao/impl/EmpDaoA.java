package org.wyc.springbootreqresp.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.wyc.springbootreqresp.dao.EmpDao;
import org.wyc.springbootreqresp.pojo.Emp;
import org.wyc.springbootreqresp.utils.XmlParserUtils;

import java.util.List;

@Repository //将当前类交给容器进行管理（控制反转）
public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
