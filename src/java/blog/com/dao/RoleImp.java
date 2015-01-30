/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.dao;

import blog.com.entity.Role;
import blog.com.entity.UserDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Java
 */
public class RoleImp implements RoleInterfaceDao{
private final Session session=HibernateUtil.getSessionFactory().openSession();
    @Override
    public void addRole(Role role) {
        try {
            session.beginTransaction();
            session.save(role);
            session.getTransaction().commit();
           } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void deleteRole(Long idRole) {
         try {
            session.beginTransaction();
           Role role= (Role) session.load(Role.class, idRole);
           session.delete(role);
            session.getTransaction().commit();
           } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void updateRole(Long idRole) {
         try {
            session.beginTransaction();
          Role role=(Role) session.load(Role.class, idRole);
          session.update(role);
            session.getTransaction().commit();
           } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public Role getRoleById(Long idRole) {
         Role role=null;
        try {
            session.beginTransaction();
           role=(Role) session.load(Role.class, idRole);
            session.getTransaction().commit();
           } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    return role;
    }

    @Override
    public List<Role> getAllRole() {
        List<Role> listOfRole=null;
        try {
            session.beginTransaction();
           listOfRole= session.createQuery("from Role").list();
            session.getTransaction().commit();
           } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    return listOfRole;
    }

    @Override
    public void addUsersToRole(UserDao users, Role role) {
      try {
          
             session.beginTransaction();
             role.getUsers().add(users);
             session.save(role);
             session.save(users);
             session.getTransaction().commit();
            
           } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public List<UserDao> getAllUserOfRole(Long idRole) {
        List<UserDao>listOfUsers=null;
        try {
           session.beginTransaction();
           Role role=(Role) session.load(Role.class, idRole);
           listOfUsers=role.getUsers();
            session.getTransaction().commit();
           } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    return listOfUsers;
    }
    public void init(){
        
        
       
    }
}
