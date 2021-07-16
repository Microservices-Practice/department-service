package com.mymicroservices.department.controller;

/*
 * @created 1/2/2021 - 12:26 PM
 * @author Swapnil Kharche
 */

import com.mymicroservices.department.entity.Department;
import com.mymicroservices.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/" )
    public Department saveDepartment(@RequestBody Department department){
//        log.info("In saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id){
//        log.info("In getDepartment method of DepartmentController");
        return departmentService.getDepartment(id);
    }

}
