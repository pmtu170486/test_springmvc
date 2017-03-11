package com.pmtu.edu.school.dao;

import com.pmtu.edu.school.model.employee;

/**
 * Created by pmtu on 11/3/2017.
 */
public interface employeeDao {
    void save(employee em);
    void update(employee em);
    void delete(employee em);
    employee findEmployeeCode(Integer id);

}
