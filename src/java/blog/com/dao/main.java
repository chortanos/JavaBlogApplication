/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.dao;

import blog.com.entity.UserDao;
import blog.com.entity.Role;
import blog.com.entity.Blog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Java
 */
public class main {
    public static void main(String[] args){
        UserImp test=new UserImp();
        UserDao users=new UserDao();
        users.setNameUser("Ammar");
        Role role =new Role();
        role.setNameRole("zebi");
        test.addRolesToUser(role, users);
        
        
   
}
}