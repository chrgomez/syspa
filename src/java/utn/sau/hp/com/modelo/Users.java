package utn.sau.hp.com.modelo;
// Generated 04/12/2014 23:31:51 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private String id;
     private String username;
     private String slug;
     private String password;
     private String passwordToken;
     private String email;
     private Boolean emailVerified;
     private String emailToken;
     private Date emailTokenExpires;
     private Boolean tos;
     private Boolean active;
     private Date lastLogin;
     private Date lastAction;
     private Boolean isAdmin;
     private String role;
     private Date created;
     private Date modified;
     private Set userDetailses = new HashSet(0);

    public Users() {
    }

	
    public Users(String id, String username, String slug) {
        this.id = id;
        this.username = username;
        this.slug = slug;
    }
    public Users(String id, String username, String slug, String password, String passwordToken, String email, Boolean emailVerified, String emailToken, Date emailTokenExpires, Boolean tos, Boolean active, Date lastLogin, Date lastAction, Boolean isAdmin, String role, Date created, Date modified, Set userDetailses) {
       this.id = id;
       this.username = username;
       this.slug = slug;
       this.password = password;
       this.passwordToken = passwordToken;
       this.email = email;
       this.emailVerified = emailVerified;
       this.emailToken = emailToken;
       this.emailTokenExpires = emailTokenExpires;
       this.tos = tos;
       this.active = active;
       this.lastLogin = lastLogin;
       this.lastAction = lastAction;
       this.isAdmin = isAdmin;
       this.role = role;
       this.created = created;
       this.modified = modified;
       this.userDetailses = userDetailses;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSlug() {
        return this.slug;
    }
    
    public void setSlug(String slug) {
        this.slug = slug;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPasswordToken() {
        return this.passwordToken;
    }
    
    public void setPasswordToken(String passwordToken) {
        this.passwordToken = passwordToken;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }
    
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }
    public String getEmailToken() {
        return this.emailToken;
    }
    
    public void setEmailToken(String emailToken) {
        this.emailToken = emailToken;
    }
    public Date getEmailTokenExpires() {
        return this.emailTokenExpires;
    }
    
    public void setEmailTokenExpires(Date emailTokenExpires) {
        this.emailTokenExpires = emailTokenExpires;
    }
    public Boolean getTos() {
        return this.tos;
    }
    
    public void setTos(Boolean tos) {
        this.tos = tos;
    }
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }
    public Date getLastLogin() {
        return this.lastLogin;
    }
    
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
    public Date getLastAction() {
        return this.lastAction;
    }
    
    public void setLastAction(Date lastAction) {
        this.lastAction = lastAction;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }
    
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }
    public Set getUserDetailses() {
        return this.userDetailses;
    }
    
    public void setUserDetailses(Set userDetailses) {
        this.userDetailses = userDetailses;
    }




}


