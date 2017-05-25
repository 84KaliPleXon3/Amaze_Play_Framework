package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Cart extends Model {
    @Id
    public int cartId;
    public int commodityId;
    public int number;
    public String user;

    public Cart(int commodityId,int number,String user){
        this.commodityId = commodityId;
        this.number = number;
        this.user = user;
    }
    
    public static Finder<Integer,Cart> find =  new Finder<Integer,Cart>(Integer.class, Cart.class);
    
    public static List<Cart> findByUser (String username) { 
        return find.where().eq("user", username).findList();
    }

    public static void buyAll(String username) {
        List<Cart> cart = findByUser(username);
        for (int i=0; i<cart.size(); i++) {
            Cart item = cart.get(i);
            Commodity commodity = Commodity.findById(item.commodityId);
            double money = commodity.price * commodity.agio * item.number;
            Bill bill = new Bill(item.commodityId,item.number,money,item.user);
            bill.save();
        }
    }
    
    public static List<Cart> findAll() {
        return find.all();
    }
 
}
