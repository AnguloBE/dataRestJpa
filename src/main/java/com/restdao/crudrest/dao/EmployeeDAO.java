package com.restdao.crudrest.dao;

import com.restdao.crudrest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
