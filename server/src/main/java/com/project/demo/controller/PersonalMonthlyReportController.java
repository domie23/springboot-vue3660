package com.project.demo.controller;

import com.project.demo.entity.PersonalMonthlyReport;
import com.project.demo.service.PersonalMonthlyReportService;
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
 * 个人月报：(PersonalMonthlyReport)表控制层
 *
 */
@RestController
@RequestMapping("/personal_monthly_report")
public class PersonalMonthlyReportController extends BaseController<PersonalMonthlyReport, PersonalMonthlyReportService> {

    /**
     * 个人月报对象
     */
    @Autowired
    public PersonalMonthlyReportController(PersonalMonthlyReportService service) {
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
