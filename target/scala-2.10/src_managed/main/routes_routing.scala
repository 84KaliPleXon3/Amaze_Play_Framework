// @SOURCE:/root/Downloads/Amaze_Play_Framework-master/conf/routes
// @HASH:3edfa60ea0607b380700fb979bb546287c81c5e9
// @DATE:Sun Sep 24 13:30:45 HKT 2017


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_logout1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:10
private[this] lazy val controllers_Application_usercenter2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user"))))
        

// @LINE:12
private[this] lazy val controllers_Application_register3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:14
private[this] lazy val controllers_Application_postregister4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:16
private[this] lazy val controllers_Application_login5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:18
private[this] lazy val controllers_Application_postlogin6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:20
private[this] lazy val controllers_Application_item7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("item"))))
        

// @LINE:22
private[this] lazy val controllers_Application_edititem8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edititem"))))
        

// @LINE:24
private[this] lazy val controllers_Application_postedititem9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("postedititem/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Application_delitem10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delitem"))))
        

// @LINE:28
private[this] lazy val controllers_Application_postitem11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("item"))))
        

// @LINE:30
private[this] lazy val controllers_Application_issue12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blog"))))
        

// @LINE:32
private[this] lazy val controllers_Application_postissue13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("issue"))))
        

// @LINE:34
private[this] lazy val controllers_Application_business14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("business"))))
        

// @LINE:36
private[this] lazy val controllers_Application_postbusiness15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("business"))))
        

// @LINE:38
private[this] lazy val controllers_Application_postdiscuss16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discuss"))))
        

// @LINE:40
private[this] lazy val controllers_Application_pass17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pass"))))
        

// @LINE:42
private[this] lazy val controllers_Application_addcart18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addcart"))))
        

// @LINE:44
private[this] lazy val controllers_Application_cart19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkout"))))
        

// @LINE:46
private[this] lazy val controllers_Application_delcart20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delcart"))))
        

// @LINE:48
private[this] lazy val controllers_Application_admin21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
        

// @LINE:50
private[this] lazy val controllers_Application_editissue22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("blog_single"))))
        

// @LINE:52
private[this] lazy val controllers_Application_buy23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buy"))))
        

// @LINE:54
private[this] lazy val controllers_Application_deluser24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deluser"))))
        

// @LINE:56
private[this] lazy val controllers_Application_delapply25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delapply"))))
        

// @LINE:61
private[this] lazy val controllers_Assets_at26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""","""controllers.Application.usercenter()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.postregister()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.postlogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """item""","""controllers.Application.item(id:Int ?= 0)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edititem""","""controllers.Application.edititem(id:Int ?= 0)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """postedititem/$id<[^/]+>""","""controllers.Application.postedititem(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delitem""","""controllers.Application.delitem(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """item""","""controllers.Application.postitem()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog""","""controllers.Application.issue()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """issue""","""controllers.Application.postissue()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """business""","""controllers.Application.business()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """business""","""controllers.Application.postbusiness()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discuss""","""controllers.Application.postdiscuss()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pass""","""controllers.Application.pass(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addcart""","""controllers.Application.addcart(id:Int, num:Int ?= 1)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkout""","""controllers.Application.cart()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delcart""","""controllers.Application.delcart(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Application.admin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """blog_single""","""controllers.Application.editissue()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buy""","""controllers.Application.buy()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deluser""","""controllers.Application.deluser(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delapply""","""controllers.Application.delapply(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_logout1(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:10
case controllers_Application_usercenter2(params) => {
   call { 
        invokeHandler(controllers.Application.usercenter(), HandlerDef(this, "controllers.Application", "usercenter", Nil,"GET", """""", Routes.prefix + """user"""))
   }
}
        

// @LINE:12
case controllers_Application_register3(params) => {
   call { 
        invokeHandler(controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Nil,"GET", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:14
case controllers_Application_postregister4(params) => {
   call { 
        invokeHandler(controllers.Application.postregister(), HandlerDef(this, "controllers.Application", "postregister", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:16
case controllers_Application_login5(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:18
case controllers_Application_postlogin6(params) => {
   call { 
        invokeHandler(controllers.Application.postlogin(), HandlerDef(this, "controllers.Application", "postlogin", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:20
case controllers_Application_item7(params) => {
   call(params.fromQuery[Int]("id", Some(0))) { (id) =>
        invokeHandler(controllers.Application.item(id), HandlerDef(this, "controllers.Application", "item", Seq(classOf[Int]),"GET", """""", Routes.prefix + """item"""))
   }
}
        

// @LINE:22
case controllers_Application_edititem8(params) => {
   call(params.fromQuery[Int]("id", Some(0))) { (id) =>
        invokeHandler(controllers.Application.edititem(id), HandlerDef(this, "controllers.Application", "edititem", Seq(classOf[Int]),"GET", """""", Routes.prefix + """edititem"""))
   }
}
        

// @LINE:24
case controllers_Application_postedititem9(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Application.postedititem(id), HandlerDef(this, "controllers.Application", "postedititem", Seq(classOf[Int]),"POST", """""", Routes.prefix + """postedititem/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Application_delitem10(params) => {
   call(params.fromQuery[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Application.delitem(id), HandlerDef(this, "controllers.Application", "delitem", Seq(classOf[Int]),"GET", """""", Routes.prefix + """delitem"""))
   }
}
        

// @LINE:28
case controllers_Application_postitem11(params) => {
   call { 
        invokeHandler(controllers.Application.postitem(), HandlerDef(this, "controllers.Application", "postitem", Nil,"POST", """""", Routes.prefix + """item"""))
   }
}
        

// @LINE:30
case controllers_Application_issue12(params) => {
   call { 
        invokeHandler(controllers.Application.issue(), HandlerDef(this, "controllers.Application", "issue", Nil,"GET", """""", Routes.prefix + """blog"""))
   }
}
        

// @LINE:32
case controllers_Application_postissue13(params) => {
   call { 
        invokeHandler(controllers.Application.postissue(), HandlerDef(this, "controllers.Application", "postissue", Nil,"POST", """""", Routes.prefix + """issue"""))
   }
}
        

// @LINE:34
case controllers_Application_business14(params) => {
   call { 
        invokeHandler(controllers.Application.business(), HandlerDef(this, "controllers.Application", "business", Nil,"GET", """""", Routes.prefix + """business"""))
   }
}
        

// @LINE:36
case controllers_Application_postbusiness15(params) => {
   call { 
        invokeHandler(controllers.Application.postbusiness(), HandlerDef(this, "controllers.Application", "postbusiness", Nil,"POST", """""", Routes.prefix + """business"""))
   }
}
        

// @LINE:38
case controllers_Application_postdiscuss16(params) => {
   call { 
        invokeHandler(controllers.Application.postdiscuss(), HandlerDef(this, "controllers.Application", "postdiscuss", Nil,"POST", """""", Routes.prefix + """discuss"""))
   }
}
        

// @LINE:40
case controllers_Application_pass17(params) => {
   call(params.fromQuery[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Application.pass(id), HandlerDef(this, "controllers.Application", "pass", Seq(classOf[Int]),"GET", """""", Routes.prefix + """pass"""))
   }
}
        

// @LINE:42
case controllers_Application_addcart18(params) => {
   call(params.fromQuery[Int]("id", None), params.fromQuery[Int]("num", Some(1))) { (id, num) =>
        invokeHandler(controllers.Application.addcart(id, num), HandlerDef(this, "controllers.Application", "addcart", Seq(classOf[Int], classOf[Int]),"GET", """""", Routes.prefix + """addcart"""))
   }
}
        

// @LINE:44
case controllers_Application_cart19(params) => {
   call { 
        invokeHandler(controllers.Application.cart(), HandlerDef(this, "controllers.Application", "cart", Nil,"GET", """""", Routes.prefix + """checkout"""))
   }
}
        

// @LINE:46
case controllers_Application_delcart20(params) => {
   call(params.fromQuery[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Application.delcart(id), HandlerDef(this, "controllers.Application", "delcart", Seq(classOf[Int]),"GET", """""", Routes.prefix + """delcart"""))
   }
}
        

// @LINE:48
case controllers_Application_admin21(params) => {
   call { 
        invokeHandler(controllers.Application.admin(), HandlerDef(this, "controllers.Application", "admin", Nil,"GET", """""", Routes.prefix + """admin"""))
   }
}
        

// @LINE:50
case controllers_Application_editissue22(params) => {
   call { 
        invokeHandler(controllers.Application.editissue(), HandlerDef(this, "controllers.Application", "editissue", Nil,"GET", """""", Routes.prefix + """blog_single"""))
   }
}
        

// @LINE:52
case controllers_Application_buy23(params) => {
   call { 
        invokeHandler(controllers.Application.buy(), HandlerDef(this, "controllers.Application", "buy", Nil,"GET", """""", Routes.prefix + """buy"""))
   }
}
        

// @LINE:54
case controllers_Application_deluser24(params) => {
   call(params.fromQuery[String]("username", None)) { (username) =>
        invokeHandler(controllers.Application.deluser(username), HandlerDef(this, "controllers.Application", "deluser", Seq(classOf[String]),"GET", """""", Routes.prefix + """deluser"""))
   }
}
        

// @LINE:56
case controllers_Application_delapply25(params) => {
   call(params.fromQuery[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Application.delapply(id), HandlerDef(this, "controllers.Application", "delapply", Seq(classOf[Int]),"GET", """""", Routes.prefix + """delapply"""))
   }
}
        

// @LINE:61
case controllers_Assets_at26(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     