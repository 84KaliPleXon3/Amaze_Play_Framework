package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Store extends Model {
    @Id
    public int StoreId;
    
    public String storename;
    public String user;
    public String description;
    public String time;
    
    public Store(String storename,String user,String description){
        this.storename = storename;
        this.user = user;
        this.description = description;
        this.time = "2017";
    }
    
    public static Finder<Integer,Store> find =  new Finder<Integer,Store>(Integer.class, Store.class);
    
    public static List<Store> findAll() {
        return find.all();
    }
    
    public static Store findByUser (String username) { 
        return find.where().eq("user", username).findUnique();
    }

    public static boolean hasStore (String username) { 
        return findByUser(username) != null;
    }
    
}
