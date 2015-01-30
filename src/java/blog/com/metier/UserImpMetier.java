/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.metier;

import blog.com.entity.Blog;
import blog.com.entity.Role;
import blog.com.dao.User;
import blog.com.entity.UserDao;
import blog.com.dao.UserInterfaceDao;
import java.util.List;

/**
 *
 * @author Java
 */
public class UserImpMetier implements UserInterfaceMetier{
private UserInterfaceDao userDao;

    public void setUserDao(UserInterfaceDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<UserDao> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public UserDao getUserById(Long idUser) {
        return userDao.getUserById(idUser);
    }

    @Override
    public void addUser(UserDao user) {
      userDao.addUser(user);
    }

    @Override
    public void deleteUser(Long idUser) {
   userDao.deleteUser(idUser);
    }

    @Override
    public void updateUser(UserDao user) {
       userDao.updateUser(user);
    }

    @Override
    public void addRolesToUser(Role role, UserDao user) {
        userDao.addRolesToUser(role, user);
    }

    @Override
    public void addBlogsToUser(Blog blog, UserDao user) {
     userDao.addBlogsToUser(blog, user);
    }

    @Override
    public List<Role> getRolesOfUser(Long idUser) {
        return userDao.getRolesOfUser(idUser);
    }

    @Override
    public List<Blog> getBlogsOfUser(Long idUser) {
        return userDao.getBlogsOfUser(idUser);
    }
    
}
