/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.com.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Java
 */
@Entity
@Table(name = "Blog")
public class Blog {
    @Id
@GenericGenerator(name="kaugen" , strategy="increment")
@GeneratedValue(generator="kaugen")
    private Long idBlog; 
    private String urlBlog;
    private String nameBlog;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idUser")
    private UserDao user;
    @ElementCollection
    @OneToMany(mappedBy = "blog")
    private List<Item> items;
   

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
     
    public UserDao getUser() {
        return user;
    }

    public void setUser(UserDao user) {
        this.user = user;
    }
    

    public String getUrlBlog() {
        return urlBlog;
    }

    public void setUrlBlog(String urlBlog) {
        this.urlBlog = urlBlog;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }
    
}
