package com.mymicroservices.department.repository;

import com.mymicroservices.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @created 1/2/2021 - 12:23 PM
 * @author Swapnil Kharche
 */

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepartmentId(Long id);

}
