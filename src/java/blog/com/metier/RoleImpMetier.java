/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.metier;

import blog.com.dao.RoleInterfaceDao;
import blog.com.entity.Role;
import blog.com.entity.UserDao;
import java.util.List;

/**
 *
 * @author Java
 */
public class RoleImpMetier implements RoleInterfaceMetier{
  private RoleInterfaceDao roleDao;

    public void setRoleDao(RoleInterfaceDao roleDao) {
        this.roleDao = roleDao;
    }
  
    @Override
    public void addRole(Role role) {
      roleDao.addRole(role);
    }

    @Override
    public void deleteRole(Long idRole) {
     roleDao.deleteRole(idRole);
    }

    @Override
    public void updateRole(Long idRole) {
     roleDao.updateRole(idRole);
            }

    @Override
    public Role getRoleById(Long idRole) {

    return roleDao.getRoleById(idRole);
            }

    @Override
    public List<Role> getAllRole() {
   return roleDao.getAllRole();
    }

    @Override
    public void addUsersToRole(UserDao users, Role role) {
 roleDao.addUsersToRole(users, role);
    }

    @Override
    public List<UserDao> getAllUserOfRole(Long idRole) {
      return roleDao.getAllUserOfRole(idRole);
    }
    
}
