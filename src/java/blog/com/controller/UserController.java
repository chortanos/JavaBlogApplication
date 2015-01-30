/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.controller;

import blog.com.metier.UserInterfaceMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Java
 */
@Controller
public class UserController {
    @Autowired
     UserInterfaceMetier service;
    @RequestMapping(value = "/users")
    public String Users(Model model){
      model.addAttribute("listUser", service.getAllUser());
      return "users" ;
    }
    
}
