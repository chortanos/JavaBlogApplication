/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.dao;

import blog.com.entity.UserDao;
import blog.com.entity.Role;
import blog.com.entity.Blog;
import java.util.List;

/**
 *
 * @author Java
 */
public interface UserInterfaceDao {
    public List<UserDao> getAllUser();
    public UserDao getUserById(Long idUser);
    public void addUser(UserDao user);
    public void deleteUser(Long idUser);
    public void updateUser(UserDao user);
    public void addRolesToUser( Role role,UserDao user);
    public void addBlogsToUser(Blog blog,UserDao user);
    public Blog findBlogByUser(UserDao user);
    public List<Role> getRolesOfUser(Long idUser);
    public List<Blog> getBlogsOfUser(Long idUser);
  
    
     
}
