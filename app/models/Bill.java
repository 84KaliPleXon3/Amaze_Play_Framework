package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import java.util.Date;

@Entity
public class Bill extends Model {
    @Id
    public int billId;
    public int commodityId;
    public int number;
    public double money;
    public String user;
    public Date time;
    
    public Bill(int commodityId,int number,double money,String user){
        this.commodityId = commodityId;
        this.number = number;
        this.money = money;
        this.user = user;
        this.time = new Date();
    }
    
    public static Finder<Integer,Bill> find =  new Finder<Integer,Bill>(Integer.class, Bill.class);
    
    public static List<Bill> findByUser (String username) {                //返回某个买家买过的所有商品
        return find.where().eq("user", username).findList();
    }

    public static List<Bill> findBycommodity (int commodityId) {                //返回某个买家买过的所有商品
        return find.where().eq("commodityId", commodityId).findList();
    }

    public static List<Bill> findBySeller (String username) {                //返回某个卖家卖出的所有商品
        List<Commodity> Commoditys_belong_Seller = Commodity.findByUser(username);
        List<Bill> result = findBycommodity(Commoditys_belong_Seller.get(0).commodityId);
        for (int i=1; i<Commoditys_belong_Seller.size(); i++) {
            result.addAll(findBycommodity(Commoditys_belong_Seller.get(i).commodityId));
        }
        return result;
    }

    public static boolean hasBuy(int commodityId,String username) {
        boolean hasbuy = false;
        List<Bill> bill = findByUser(username);
        for (int i=0; i<bill.size(); i++) {
            Bill item = bill.get(i);
            if(item.commodityId == commodityId){
                hasbuy = true;
                break;
            }
        }
        return hasbuy;
    }
    
    public static List<Bill> findAll() {
        return find.all();
    }
 
}
