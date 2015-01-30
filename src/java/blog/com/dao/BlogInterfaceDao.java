/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.dao;

import blog.com.entity.UserDao;
import blog.com.entity.Item;
import blog.com.entity.Blog;
import java.util.List;

/**
 *
 * @author Java
 */
public interface BlogInterfaceDao {
   public void addBlog(Blog blog); 
   public void deleteBlog(Long idBlog);
   public void updateBlog(Long idBlog);
   public Blog getBlogById(Long idBlog);
   public List<Blog> getAllBlog();
   public List<Blog> getAllBlogOfUser(UserDao user);//select all blog and all item of this blog assiociated with the user 
   public void addUserToBlog(UserDao user,Blog blog);
   public UserDao getUserOfBlog(Long idBlog);
   public List<Item> getAllItemByBlog(Long idBlog);
   
}
