package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Employee;

public interface EmployeeDao {
    public Employee getEmployeeById(Integer id);
}
