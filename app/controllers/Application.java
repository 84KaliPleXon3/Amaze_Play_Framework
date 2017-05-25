package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;
import util.*;

import play.data.Form;
import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result register() {
        Form<Registration> userForm = Form.form(Registration.class);
        return ok(views.html.register.render(userForm));
    }

    public static Result postregister() {
        Form<Registration> userForm = Form.form(Registration.class).bindFromRequest();
        Registration registration = userForm.get();
        if(User.findByName(registration.username) != null)
            return ok("already registered"); 
        int powerid=1;
        if(registration.sellers)
            powerid = 2;
        User user = new User(registration.username, registration.password, powerid);
        user.save(); 
        return ok("registered"); 
    }
    
    public static Result login() {
        Form<Login> userForm = Form.form(Login.class);
        return ok(views.html.login.render(userForm));
    }
    
    public static Result postlogin() {
        Form<Login> userForm = Form.form(Login.class).bindFromRequest();
        if (userForm.hasErrors()) {
            return badRequest("Wrong user/password");
        } else {
            session().clear();
            session("user",userForm.get().username);
            return ok("欢迎回来");
        }
    }
    
    public static Result item(int id) {
        if(id <1)
            return redirect("/");
        Commodity commodity = Commodity.findById(id);
        return ok("商品id"+id);
    }
    
    public static Result delitem(int id) {
        if(id >0 && User.isseller(session("user")) && Store.hasStore(session("user")) && Commodity.isbelong(session("user"),id)){
            Commodity.delById(id);
            return ok("删除成功");
        }
        return redirect("/login");
    }
    
    public static Result edititem(int id) {
        if(User.isseller(session("user")) && Store.hasStore(session("user"))){
            if(id < 1){
                Form<Shelves> userForm = Form.form(Shelves.class);
                return ok(views.html.additem.render(userForm));     
            }
            if(Commodity.isbelong(session("user"),id)){
                Commodity commodity = Commodity.findById(id);
                Form<Commodity> userForm = Form.form(Commodity.class).fill(commodity);
                return ok(views.html.edititem.render(userForm));
            }
        }
        return redirect("/login");
    }
    
    public static Result postitem() {                 //添加商品
        
        Form<Shelves> userForm = Form.form(Shelves.class).bindFromRequest();
        Shelves shelve =  userForm.get();
        Commodity commodity = new Commodity(shelve.commodityName,shelve.price,shelve.agio,shelve.picture,shelve.cType,session("user"));
        return ok("添加成功");
    }
    
    public static Result postedititem() {                    //修改商品
        Form<Shelves> userForm = Form.form(Shelves.class).bindFromRequest();
        Shelves shelve =  userForm.get();
        if(User.isseller(session("user")) && Commodity.isbelong(session("user"),shelve.commodityId)){ 
            Commodity commodity = Commodity.findById(shelve.commodityId);
            commodity.commodityName = shelve.commodityName;
            commodity.price = shelve.price;
            commodity.agio = shelve.agio;
            commodity.picture = shelve.picture;
            commodity.cType = shelve.cType;
            commodity.save();
            //return ok(views.html.additem.render(userForm));
            return ok("修改成功");
        }
        return redirect("/login");
    }
    
    public static Result issue() {                           //获取全部帖子
        List<Paper> papers = Paper.findAll();
        return ok("获取全部文章");
    }
  
    public static Result postissue() {                        //发表帖子
        Form<Issue> userForm = Form.form(Issue.class).bindFromRequest();
        Issue issue = userForm.get();
        Paper paper= new Paper(issue.title,session("user"),issue.content);
        paper.save();
        return ok("发表文章成功");
    }
    
    public static Result business() {               //如果没有商店，则返回开店请求，有商店返回商店
        if(User.isseller(session("user"))){ 
            if (Store.hasStore(session("user"))){
                List<Commodity> = Commodity.findByUser(session("user"));
                return ok("进入你的商店");
            }
            else{
                Form<Request> userForm = Form.form(Request.class);
                return ok(views.html.addstore.render(userForm));
            }
        }
        return ok("你不是商家");
    }
    
    public static Result postbusiness() {               //提交开店请求
        if(!User.isseller(session("user")) || Store.hasStore(session("user")))     //不是商家或者开了店 重定向
            redirect("/login");
        Form<Request> userForm = Form.form(Request.class).bindFromRequest();
        Request request = userForm.get();
        Checkstore checkstore  = new Checkstore(request.storename, session("user"),request.description);
        checkstore.save();
        return ok("开店请求代审核");
    }
    
    public static Result pass(int id) {                //管理员方法 商家审核通过
        if(User.isadmin(session("user"))){
            Checkstore.pass(id);
            return ok("开店审核通过");
        }
        return redirect("/login");
    }
    
    public static Result postdiscuss() {                  //发表评论
        Form<Discuss> userForm = Form.form(Discuss.class).bindFromRequest();
        Discuss discuss = userForm.get();
        if(User.iscustomer(session("user")) && Bill.hasBuy(discuss.commodityId,session("user"))){          //判断是不是买家和买过商品 用实体Bill实体类     
            Comment comment  = new Comment(discuss.commodityId, session("user"),discuss.content);
            comment.save();
            return ok("评论发表成功");
        }
        return redirect("/login");
    }
    
    public static Result addcart(int id,int num) {
        if(!User.iscustomer(session("user")))              //不是顾客或没登录
            return redirect("/login");
        Cart.addCart(id, num, session("user"));
        return ok("添加到购物车成功");
    }
    
    public static Result cart() {                           //获取购物车里的商品
        if(!User.iscustomer(session("user")))              //不是顾客或没登录
            return redirect("/login");
        List<Cart> cart = Cart.findByUser(session("user"));
        return ok("返回所有购物车");
    }
    
    public static Result delcart(int id) {                           //删除购物车特定商品
        if(!User.iscustomer(session("user")))              //不是顾客或没登录
            return redirect("/login");
        Cart.delById(id,session("user"));
        return ok("删除商品成功");
    }
    
    public static Result admin() {                           //管理员界面
        if(!User.isadmin(session("user")))        
            return redirect("/login");
        List<User> = User.findAll();                          //所有用户
        List<Checkstore> = Checkstore.findAll();               //所有开店请求
        List<Store> = Store.findAll();                        //所有商店
        return ok("进入管理员界面");
    }
    
}
