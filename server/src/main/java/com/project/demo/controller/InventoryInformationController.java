package com.project.demo.controller;

import com.project.demo.entity.InventoryInformation;
import com.project.demo.service.InventoryInformationService;
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
 * 库存信息：(InventoryInformation)表控制层
 *
 */
@RestController
@RequestMapping("/inventory_information")
public class InventoryInformationController extends BaseController<InventoryInformation, InventoryInformationService> {

    /**
     * 库存信息对象
     */
    @Autowired
    public InventoryInformationController(InventoryInformationService service) {
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
