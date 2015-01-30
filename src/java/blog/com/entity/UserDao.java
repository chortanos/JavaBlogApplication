/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.entity;

import blog.com.entity.Role;
import blog.com.entity.Blog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Java
 */

@Entity
@Table(name="UserDao")
public class UserDao implements Serializable {
     @Id
     @GenericGenerator(name="kaugen" , strategy="increment")
     @GeneratedValue(generator="kaugen")
    private Long idUser;
     @Column(name="nameUser")
    private String nameUser;
    private String emailUser;
    private String passwordUser;
     @ManyToMany(cascade = CascadeType.ALL)
     @JoinTable(name = "Role_User")
    private List<Role> roles=new ArrayList<Role>();
     @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Blog> blogs=new ArrayList<>();
    
    

   
   

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
    

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
    
    
    
}
 

