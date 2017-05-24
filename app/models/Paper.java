package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Paper extends Model {
    @Id
    public int issueid;
    
    public String title;
    public String author;
    public String content;
    public String time;
    
    public Paper(String title,String author,String content){
        this.title = title;
        this.author = author;
        this.content = content;
        this.time = "2017";
    }
    
    public static Finder<Integer,Paper> find =  new Finder<Integer,Paper>(Integer.class, Paper.class);
    
    public static List<Paper> findAll() {
        return find.all();
    }
    
    public static Paper findById (int issueid) {
        return find.where().eq("issueid", issueid).findUnique();
    }
    
    public static Paper findByName (String author) {
        return find.where().eq("author", author).findUnique();
    }
    
    public static void delById (int issueid) {                //返回属于某个商家的所有商品
        Paper paper = findById(issueid);
        paper.delete();
    }
    
    public static boolean isbelong (String username,int issueid) {    //某个商品是否属于某个商家
        Paper paper = findById(issueid);
        return paper!=null && paper.author.equals(username);
    }

}
