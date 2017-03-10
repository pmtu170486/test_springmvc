package com.pmtu.edu.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pmtu on 11/3/2017.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home()
    {
        return "test";
    }
}
