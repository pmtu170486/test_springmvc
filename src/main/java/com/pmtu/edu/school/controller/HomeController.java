package com.pmtu.edu.school.controller;

import com.pmtu.edu.school.bo.employeeBo;
import com.pmtu.edu.school.model.employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pmtu on 11/3/2017.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(Model m)
    {
        ApplicationContext appContext=new ClassPathXmlApplicationContext("spring/config/BeanLocation.xml");
        employeeBo bo=(employeeBo) appContext.getBean("empbo");
        employee em=bo.findEmployeeCode(1);
        m.addAttribute("emp",em);

        return "test";
    }


}
