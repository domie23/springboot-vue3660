package com.project.demo.controller;

import com.project.demo.entity.ManagerUser;
import com.project.demo.service.ManagerUserService;
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
 * 经理用户：(ManagerUser)表控制层
 *
 */
@RestController
@RequestMapping("/manager_user")
public class ManagerUserController extends BaseController<ManagerUser, ManagerUserService> {

    /**
     * 经理用户对象
     */
    @Autowired
    public ManagerUserController(ManagerUserService service) {
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
