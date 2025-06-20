package com.project.demo.controller;

import com.project.demo.entity.EmployeeManagement;
import com.project.demo.service.EmployeeManagementService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 员工管理：(EmployeeManagement)表控制层
 *
 */
@RestController
@RequestMapping("/employee_management")
public class EmployeeManagementController extends BaseController<EmployeeManagement, EmployeeManagementService> {

    /**
     * 员工管理对象
     */
    @Autowired
    public EmployeeManagementController(EmployeeManagementService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
