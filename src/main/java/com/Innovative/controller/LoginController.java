package com.Innovative.controller;

import com.Innovative.Entities.Records;
import com.Innovative.Entities.Registration;
import com.Innovative.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;
    ModelAndView modelAndView = new ModelAndView();
    ModelAndView modelAndView1 = new ModelAndView();
    @PostMapping("/validateLogin")
    public ModelAndView validateLogin(HttpServletRequest httpServletRequest){

        String username = httpServletRequest.getParameter("email");
        String password = httpServletRequest.getParameter("password");

        System.out.println("Name of user = "+username);
        System.out.println("Password of user = "+password);

        Optional<Registration> check = Optional.ofNullable(loginService.validates(username, password));


        System.out.println(check);

        System.out.println(check.isEmpty());

        if(check.isEmpty()){
            System.out.println("username and password does not exist");
            modelAndView.setViewName("index.html");
            return modelAndView;
        }
        else {

            System.out.println("Signing into Records Table");

            List<Records> list = loginService.getAllRecords();
            System.out.println(list);

            return new ModelAndView("records.html","records",list);
        }
    }

}
