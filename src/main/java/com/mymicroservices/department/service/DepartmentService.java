package com.mymicroservices.department.service;

/*
 * @created 1/2/2021 - 12:25 PM
 * @author Swapnil Kharche
 */

import com.mymicroservices.department.entity.Department;
import com.mymicroservices.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
    	
//        log.info("In saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long id) {
//        log.info("In getDepartment method of DepartmentService");
        return departmentRepository.findByDepartmentId(id);
    }
}
