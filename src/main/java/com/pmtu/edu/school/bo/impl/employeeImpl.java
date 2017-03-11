package com.pmtu.edu.school.bo.impl;

import com.pmtu.edu.school.bo.employeeBo;
import com.pmtu.edu.school.dao.employeeDao;
import com.pmtu.edu.school.dao.impl.employeeDaoImpl;
import com.pmtu.edu.school.model.employee;

/**
 * Created by pmtu on 11/3/2017.
 */
public class employeeImpl implements employeeBo {


    private employeeDaoImpl daoEmpl;


    public void save(employee em) {

        daoEmpl.save(em);
    }

    public void update(employee em) {
        daoEmpl.update(em);
    }

    public void delete(employee em) {
        daoEmpl.delete(em);
    }

    public employee findEmployeeCode(int id) {
        return daoEmpl.findEmployeeCode(id);
    }


    public void setDaoEmpl(employeeDaoImpl daoEmpl) {
        this.daoEmpl = daoEmpl;
    }

    public employeeDaoImpl getDaoEmpl() {
        return daoEmpl;
    }
}
