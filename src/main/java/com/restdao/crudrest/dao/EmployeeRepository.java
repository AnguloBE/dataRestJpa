package com.restdao.crudrest.dao;

import com.restdao.crudrest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
