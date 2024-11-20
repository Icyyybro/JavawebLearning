package org.wyc.springbootreqresp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.wyc.springbootreqresp.pojo.Emp;
import org.wyc.springbootreqresp.pojo.Result;
import org.wyc.springbootreqresp.service.EmpService;
import org.wyc.springbootreqresp.service.impl.EmpServiceA;
import org.wyc.springbootreqresp.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list(){
        List<Emp> empList = empService.listEmp();
        return Result.success(empList);
    }

}
