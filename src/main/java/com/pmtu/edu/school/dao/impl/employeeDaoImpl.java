package com.pmtu.edu.school.dao.impl;

import com.pmtu.edu.school.dao.employeeDao;
import com.pmtu.edu.school.model.employee;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by pmtu on 11/3/2017.
 */
public class employeeDaoImpl extends HibernateDaoSupport implements employeeDao {

    public void save(employee em) {
        getHibernateTemplate().save(em);
    }

    public void update(employee em) {
        getHibernateTemplate().update(em);
    }

    public void delete(employee em) {

        getHibernateTemplate().delete(em);
    }

    public employee findEmployeeCode(Integer id) {
        List list=getHibernateTemplate().find(
                "from employee where id=? ",id
        );
        return (employee) list.get(0);
    }
}
