/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.metier;

import blog.com.entity.Role;
import blog.com.entity.UserDao;
import java.util.List;

/**
 *
 * @author Java
 */
public interface RoleInterfaceMetier {
   public void addRole(Role role) ;
   public void deleteRole(Long idRole);
   public void updateRole(Long idRole);
   public Role getRoleById(Long idRole);
   public List<Role> getAllRole();
   public void addUsersToRole(UserDao users,Role role);
   public List<UserDao> getAllUserOfRole(Long idRole);
   
}
