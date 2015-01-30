/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.dao;

import blog.com.entity.Item;
import blog.com.entity.Blog;
import java.util.List;

/**
 *
 * @author Java
 */
public interface ItemInterfaceDao {
   public void addItem(Item item) ;
   public void updateItem(Long idItem);
   public void deleteItem(Long idItem);
   public Item getItemById(Long idItem);
   public List<Item> getAllItem();
   public Blog getBlogOfItem(Long idItem);
   public List<Item> getAllItemOfBlog(Blog blog);
}
