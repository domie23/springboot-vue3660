package com.project.demo.controller;

import com.project.demo.entity.CustomerInformation;
import com.project.demo.service.CustomerInformationService;
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
 * 客户信息：(CustomerInformation)表控制层
 *
 */
@RestController
@RequestMapping("/customer_information")
public class CustomerInformationController extends BaseController<CustomerInformation, CustomerInformationService> {

    /**
     * 客户信息对象
     */
    @Autowired
    public CustomerInformationController(CustomerInformationService service) {
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
