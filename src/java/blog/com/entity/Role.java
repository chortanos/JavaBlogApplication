/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Java
 */
@Entity
@Table(name = "Role")
public class Role {
     @Id
@GenericGenerator(name="kaugen" , strategy="increment")
@GeneratedValue(generator="kaugen")
    private Long idRole;
    private String nameRole;
   @ManyToMany(cascade = CascadeType.ALL)
   @ElementCollection
   private List<UserDao> users=new ArrayList<UserDao>();
    

    public List<UserDao> getUsers() {
        return users;
    }

    public void setUsers(List<UserDao> users) {
        this.users = users;
    }
   
    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }
    
}
