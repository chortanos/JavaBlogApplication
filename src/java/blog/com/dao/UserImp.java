/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.dao;

import blog.com.dao.HibernateUtil;
import blog.com.dao.UserInterfaceDao;
import blog.com.entity.UserDao;
import blog.com.entity.Role;
import blog.com.entity.Blog;
import blog.com.entity.Blog;
import blog.com.entity.Role;
import blog.com.entity.UserDao;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Java
 */
public class UserImp implements UserInterfaceDao{
private Session session=HibernateUtil.getSessionFactory().openSession();
    @Override
    public List<UserDao> getAllUser() {
        Session session=HibernateUtil.getSessionFactory().openSession();
          List<UserDao> listOfUser =null;
        try{
          session.beginTransaction();
           listOfUser =  session.createQuery("from UserDao").list();
             session.getTransaction().commit();
           }catch(HibernateException e){
           session.getTransaction().rollback();
           e.printStackTrace();
                                      }
         
        return listOfUser;
   }
     
  
     
    


    @Override
    public UserDao getUserById(Long idUser) {
     UserDao user=null;
        try{
          session.beginTransaction();
          user= (UserDao) session.load(UserDao.class, idUser);
      }catch(HibernateException e){
          e.printStackTrace();
          session.getTransaction().rollback();
      }finally{
          session.close();
      }
    return user;
    }

    @Override
    public void addUser(UserDao user) {
       
        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            
        } catch (HibernateException e) {
       e.printStackTrace();
       session.getTransaction().rollback();
        }
    }

    @Override
    public void deleteUser(Long idUser) {
       
        try{
          session.beginTransaction();
        UserDao  user= (UserDao) session.load(UserDao.class, idUser);
          session.delete(user);
      }catch(HibernateException e){
          e.printStackTrace();
          session.getTransaction().rollback();
      }finally{
          session.close();
      }
    }

    @Override
    public void updateUser(UserDao user) {
           try{
          session.beginTransaction();
          session.update(user);
          session.getTransaction().commit();
          
      }catch(HibernateException e){
          e.printStackTrace();
          session.getTransaction().rollback();
      }finally{
          session.close();
      }
    }

    @Override
    public List<Role> getRolesOfUser(Long idUser) {
       List<Role> listOfRolles=null;
        try {
     
      session.getTransaction().begin();
      UserDao user=(UserDao)session.load(UserDao.class,idUser);
      listOfRolles=user.getRoles();
    for(Role roles:listOfRolles){
       
         System.out.println("the user --->"+user.getNameUser()+"->"+"have the roles-->"+roles.getNameRole());
     }
      
            
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    return listOfRolles;
    }
    

    @Override
    public List<Blog> getBlogsOfUser(Long idUser) {
      List<Blog> listblogs=null;
        try {
          session.beginTransaction();
      User user= (User) session.load(User.class, idUser);
      listblogs=user.getBlogs();
      
      
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    return listblogs;
    }

    @Override
    public void addRolesToUser(Role roles,UserDao user) {
     
     try{ 
       session.beginTransaction();
          //roles=new Role();//inta methode deja te9bel deux objet laken inta 3awedt 3malt deux objet o5rin alors que enta 3amelhom deja fi elmain donc enta fi methode ta5dem b les objet tel quilq sont min ghir ma t3awed ta3mel new  
//rani kounet 3amel haka ama haw wine el mochkel
          //user=new UserDao();donc en suprimit les objet li 3awedt creeethom inta w5allit ken 
          user.getRoles().add(roles);//ya bachta 
         
          session.save(user);
          session.getTransaction().commit();
        
          
        
     }catch(HibernateException e){
         session.getTransaction().rollback();
         e.printStackTrace();
     }
    }

    @Override
    public void addBlogsToUser(Blog blogs,UserDao user) {
        try{
            session.beginTransaction();
            blogs.setUser(user);
            session.save(user);
            session.save(blogs);
            session.getTransaction().commit();
        }catch(HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
     public void init(){
    UserDao user=new UserDao();
    user.setNameUser("jiji");
    user.setEmailUser("black3eyes@gmail.com");
    user.setPasswordUser("06178687");
        addUser(user);
       
//    Role roles =new Role();
//    roles.setNameRole("aymen");
//   
//     
//     Blog blogs=new Blog();
//     blogs.setNameBlog("Java urbain");
//     blogs.setUrlBlog("http://www.facebook.com");
//     blogs.setUser(user);
//       Item iteams=new Item();
//       iteams.setTitleItem("hello word");
//       iteams.setDescreption("new of java spring");
//       iteams.setLink("facebook.com");
//       iteams.setPublishedDate(new Date());
//       blogs.getItems().add(iteams);
//     
    }

    @Override
    public Blog findBlogByUser(UserDao user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
