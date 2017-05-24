package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import org.mindrot.jbcrypt.BCrypt;

@Entity
public class User extends Model {
    public String username;
    public String password;
    public int powerid;

    // Query
    
    public User(String username, String password,int powerid) {
        String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
        this.username = username;
        this.password = passwordHash;
        this.powerid = powerid;
    }
    
    public static Finder<Integer,User> find =  new Finder<Integer,User>(Integer.class, User.class);
    
    public static List<User> findAll() {
        return find.all();
    }
    
    public static User findByName (String username) {
        return find.where().eq("username", username).findUnique();
    }
    
    public static User authenticate(String username, String password) {
        User user =  find.where()
                .eq("username", username)
                .findUnique();
        if (user == null) {
            return user;
        } else if (BCrypt.checkpw(password, user.password)) {
            return user;
        } else {
            return null;
        }
    }
    
    public static boolean iscustomer(String username) {
        User user = findByName(username);
        return username!=null && user.powerid == 1;
    }
    
    public static boolean isseller(String username) {
        User user = findByName(username);
        return username!=null && user.powerid == 2;
    }
    
    public static boolean isadmin(String username) {
        User user = findByName(username);
        return username!=null && user.powerid == 3;
    }
}
