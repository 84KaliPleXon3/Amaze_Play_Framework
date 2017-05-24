package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Comment extends Model {
    @Id
    public int CommentId;
    
    public int commodityId;  
    public String user;
    public String content;
    public String time;

    public Comment(int commodityId, String user,String content){
        this.commodityId = commodityId;
        this.user = user;
        this.content = content;
        this.time = "2017";
    }

    public static Finder<Integer,Comment> find =  new Finder<Integer,Comment>(Integer.class, Comment.class);
    
    public static List<Comment> findAll() {
        return find.all();
    }
    
    public static Comment findById (int commodityId) {                //根据id返回商品
        return find.ref(commodityId);
    }
    
    public static List<Comment> findByUser (String username) {                //返回属于某个商家的所有商品
        return find.where().eq("user", username).findList();
    }
    
}
