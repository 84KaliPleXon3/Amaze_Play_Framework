
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link href=""""),_display_(Seq[Any](/*6.14*/routes/*6.20*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*6.59*/("""" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src=""""),_display_(Seq[Any](/*8.15*/routes/*8.21*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*8.60*/(""""></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href=""""),_display_(Seq[Any](/*11.14*/routes/*11.20*/.Assets.at("stylesheets/style.css"))),format.raw/*11.55*/("""" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*17.78*/("""{"""),format.raw/*17.79*/(""" setTimeout(hideURLbar, 0); """),format.raw/*17.107*/("""}"""),format.raw/*17.108*/(""", false); function hideURLbar()"""),format.raw/*17.139*/("""{"""),format.raw/*17.140*/(""" window.scrollTo(0,1); """),format.raw/*17.163*/("""}"""),format.raw/*17.164*/(""" </script>
<!-- start menu -->
<link href=""""),_display_(Seq[Any](/*19.14*/routes/*19.20*/.Assets.at("stylesheets/memenu.css"))),format.raw/*19.56*/("""" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src=""""),_display_(Seq[Any](/*20.38*/routes/*20.44*/.Assets.at("javascripts/memenu.js"))),format.raw/*20.79*/(""""></script>
<script>$(document).ready(function()"""),format.raw/*21.37*/("""{"""),format.raw/*21.38*/("""$(".memenu").memenu();"""),format.raw/*21.60*/("""}"""),format.raw/*21.61*/(""");</script>
<script src=""""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*22.64*/(""""> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*31.99*/("""{"""),format.raw/*31.100*/("""this.value = 'Search';"""),format.raw/*31.122*/("""}"""),format.raw/*31.123*/("""">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">
					<ul>
"""),_display_(Seq[Any](/*37.2*/if(current_user=="登录")/*37.24*/{_display_(Seq[Any](format.raw/*37.25*/("""<li ><a href="/login"  >登录</a></li><li><a  href="/register"  >注册</a></li>""")))}/*37.99*/else/*37.103*/{_display_(Seq[Any](format.raw/*37.104*/("""<li ><a href="#"  >"""),_display_(Seq[Any](/*37.124*/current_user)),format.raw/*37.136*/("""</a></li>""")))})),format.raw/*37.146*/("""

					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*43.19*/routes/*43.25*/.Assets.at("images/cart.png"))),format.raw/*43.54*/("""" alt=""/></h3>
						</a>
						<!-- <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p> -->

					</div>
					<div class="clearfix"> </div>
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<a href="/"><img src=""""),_display_(Seq[Any](/*56.29*/routes/*56.35*/.Assets.at("images/logo.png"))),format.raw/*56.64*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
					<ul class="memenu skyblue">
<!--
					  <li class="active grid"><a class="color8" href="/">首页</a></li>
				      <li><a class="color1" href="#">店铺管理</a></li>
				    <li class="grid"><a class="color2" href="#">	后台管理</a> </li>
				<li><a class="color4" href="/blog">发帖</a></li>-->
				<!-- <li><a class="color6" href="/contact">个人中心</a></li> -->
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>


<!--content-->
<div class="container">
		<div class="account">
		<h1>账号</h1>
		<div class="account-pass">
		<div class="col-md-8 account-top">
			<form>
			<div>
				<span>账号</span>
				<input type="text" name="username" id="username">
			</div>
			<div>
				<span >密码</span>
				<input type="password" name="password" id="password">
			</div>
			</form>
			<div><input type="submit" onsubmit="return false;" id="login" value="登录"></div>
		</div>
		<div class="col-md-4 left-account">
			<!-- <a href="single.html"><img class="img-responsive " src=""""),_display_(Seq[Any](/*95.66*/routes/*95.72*/.Assets.at("images/s1.jpg"))),format.raw/*95.99*/("""" alt=""></a> -->
			<div class="five">
				<span><a href="/register" class="create">注册</a></span>
			</div>

<div class="clearfix"> </div>
		</div>
	<div class="clearfix"> </div>
	</div>
	</div>

</div>
<script>
		$(document).ready(function() """),format.raw/*108.32*/("""{"""),format.raw/*108.33*/("""
				$("#login").click(function() """),format.raw/*109.34*/("""{"""),format.raw/*109.35*/("""
						var username = $("#username").val();
						var password = $("#password").val();
						console.log(username);
						console.log(password);
						var data = """),format.raw/*114.18*/("""{"""),format.raw/*114.19*/("""
								"username":username,
								"password":password
						"""),format.raw/*117.7*/("""}"""),format.raw/*117.8*/(""";
						$.ajax("""),format.raw/*118.14*/("""{"""),format.raw/*118.15*/("""
								url:"/login",
								type:"post",
								data:data,
								success:function (data) """),format.raw/*122.33*/("""{"""),format.raw/*122.34*/("""
										console.log(data);
										if(data=="success")
										    window.location.href="/";
										else
										    alert("账号或密码错误");
								"""),format.raw/*128.9*/("""}"""),format.raw/*128.10*/("""
						"""),format.raw/*129.7*/("""}"""),format.raw/*129.8*/(""")
				"""),format.raw/*130.5*/("""}"""),format.raw/*130.6*/(""")
		"""),format.raw/*131.3*/("""}"""),format.raw/*131.4*/(""")
</script>
<!--//content-->
<div class="footer">
		<div class="footer-class">
		<p >Copyright &copy;2017</p>
		</div>
		</div>
</body>
</html>
"""))}
    }
    
    def render(current_user:String): play.api.templates.HtmlFormat.Appendable = apply(current_user)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (current_user) => apply(current_user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Sep 24 11:39:13 HKT 2017
                    SOURCE: /root/Downloads/Amaze_Play_Framework-master/app/views/login.scala.html
                    HASH: c43c589adf56ed9982d4d915baae441ac2bf5c7b
                    MATRIX: 774->1|889->22|994->92|1008->98|1068->137|1232->266|1246->272|1306->311|1417->386|1432->392|1489->427|2069->979|2098->980|2155->1008|2185->1009|2245->1040|2275->1041|2327->1064|2357->1065|2439->1111|2454->1117|2512->1153|2636->1241|2651->1247|2708->1282|2785->1331|2814->1332|2864->1354|2893->1355|2956->1382|2971->1388|3036->1431|3322->1689|3352->1690|3403->1712|3433->1713|3579->1824|3610->1846|3649->1847|3742->1921|3756->1925|3796->1926|3853->1946|3888->1958|3931->1968|4101->2102|4116->2108|4167->2137|4541->2475|4556->2481|4607->2510|5719->3586|5734->3592|5783->3619|6069->3876|6099->3877|6163->3912|6193->3913|6389->4080|6419->4081|6514->4148|6543->4149|6588->4165|6618->4166|6746->4265|6776->4266|6965->4427|6995->4428|7031->4436|7060->4437|7095->4444|7124->4445|7157->4450|7186->4451
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|59->31|59->31|59->31|59->31|65->37|65->37|65->37|65->37|65->37|65->37|65->37|65->37|65->37|71->43|71->43|71->43|84->56|84->56|84->56|123->95|123->95|123->95|136->108|136->108|137->109|137->109|142->114|142->114|145->117|145->117|146->118|146->118|150->122|150->122|156->128|156->128|157->129|157->129|158->130|158->130|159->131|159->131
                    -- GENERATED --
                */
            