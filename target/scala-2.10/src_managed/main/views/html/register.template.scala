
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<!DOCTYPE html>
<html>
<head>
<title>Register</title>
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
<!--fonts-->
<!-- start menu -->
<link href=""""),_display_(Seq[Any](/*20.14*/routes/*20.20*/.Assets.at("stylesheets/memenu.css"))),format.raw/*20.56*/("""" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src=""""),_display_(Seq[Any](/*21.38*/routes/*21.44*/.Assets.at("javascripts/memenu.js"))),format.raw/*21.79*/(""""></script>
<script>$(document).ready(function()"""),format.raw/*22.37*/("""{"""),format.raw/*22.38*/("""$(".memenu").memenu();"""),format.raw/*22.60*/("""}"""),format.raw/*22.61*/(""");</script>
<script src=""""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*23.64*/(""""> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*32.99*/("""{"""),format.raw/*32.100*/("""this.value = 'Search';"""),format.raw/*32.122*/("""}"""),format.raw/*32.123*/("""">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">
					<ul>
						<li ><a class="lock"  href="/login"  >"""),_display_(Seq[Any](/*38.46*/current_user)),format.raw/*38.58*/("""</a></li>
						<li><a class="lock" href="/register"  >注册</a></li>
					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">
							购物车</div>
							<img src=""""),_display_(Seq[Any](/*45.19*/routes/*45.25*/.Assets.at("images/cart.png"))),format.raw/*45.54*/("""" alt=""/></h3>
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
					<a href="/"><img src=""""),_display_(Seq[Any](/*58.29*/routes/*58.35*/.Assets.at("images/logo.png"))),format.raw/*58.64*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
					<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="/">首页</a></li>
				      <li><a class="color1" href="#">店铺管理</a>
				      	<!-- <div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.html">Accessories</a></li>
										<li><a href="products.html">Bags</a></li>
										<li><a href="products.html">Caps & Hats</a></li>
										<li><a href="products.html">Hoodies & Sweatshirts</a></li>
										<li><a href="products.html">Jackets & Coats</a></li>
										<li><a href="products.html">Jeans</a></li>
										<li><a href="products.html">Jewellery</a></li>
										<li><a href="products.html">Jumpers & Cardigans</a></li>
										<li><a href="products.html">Leather Jackets</a></li>
										<li><a href="products.html">Long Sleeve T-Shirts</a></li>
										<li><a href="products.html">Loungewear</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.html">Shirts</a></li>
										<li><a href="products.html">Shoes, Boots & Trainers</a></li>
										<li><a href="products.html">Shorts</a></li>
										<li><a href="products.html">Suits & Blazers</a></li>
										<li><a href="products.html">Sunglasses</a></li>
										<li><a href="products.html">Sweatpants</a></li>
										<li><a href="products.html">Swimwear</a></li>
										<li><a href="products.html">Trousers & Chinos</a></li>
										<li><a href="products.html">T-Shirts</a></li>
										<li><a href="products.html">Underwear & Socks</a></li>
										<li><a href="products.html">Vests</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="products.html">Levis</a></li>
										<li><a href="products.html">Persol</a></li>
										<li><a href="products.html">Nike</a></li>
										<li><a href="products.html">Edwin</a></li>
										<li><a href="products.html">New Balance</a></li>
										<li><a href="products.html">Jack & Jones</a></li>
										<li><a href="products.html">Paul Smith</a></li>
										<li><a href="products.html">Ray-Ban</a></li>
										<li><a href="products.html">Wood Wood</a></li>
									</ul>
								</div>
							</div>
						  </div>
						</div> -->
					</li>
				    <li class="grid"><a class="color2" href="#">	后台管理</a>
					  	<!-- <div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.html">Accessories</a></li>
										<li><a href="products.html">Bags</a></li>
										<li><a href="products.html">Caps & Hats</a></li>
										<li><a href="products.html">Hoodies & Sweatshirts</a></li>
										<li><a href="products.html">Jackets & Coats</a></li>
										<li><a href="products.html">Jeans</a></li>
										<li><a href="products.html">Jewellery</a></li>
										<li><a href="products.html">Jumpers & Cardigans</a></li>
										<li><a href="products.html">Leather Jackets</a></li>
										<li><a href="products.html">Long Sleeve T-Shirts</a></li>
										<li><a href="products.html">Loungewear</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.html">Shirts</a></li>
										<li><a href="products.html">Shoes, Boots & Trainers</a></li>
										<li><a href="products.html">Shorts</a></li>
										<li><a href="products.html">Suits & Blazers</a></li>
										<li><a href="products.html">Sunglasses</a></li>
										<li><a href="products.html">Sweatpants</a></li>
										<li><a href="products.html">Swimwear</a></li>
										<li><a href="products.html">Trousers & Chinos</a></li>
										<li><a href="products.html">T-Shirts</a></li>
										<li><a href="products.html">Underwear & Socks</a></li>
										<li><a href="products.html">Vests</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="products.html">Levis</a></li>
										<li><a href="products.html">Persol</a></li>
										<li><a href="products.html">Nike</a></li>
										<li><a href="products.html">Edwin</a></li>
										<li><a href="products.html">New Balance</a></li>
										<li><a href="products.html">Jack & Jones</a></li>
										<li><a href="products.html">Paul Smith</a></li>
										<li><a href="products.html">Ray-Ban</a></li>
										<li><a href="products.html">Wood Wood</a></li>
									</ul>
								</div>
							</div>
						  </div>
						</div> -->
			    </li>
				<li><a class="color4" href="/blog">所有帖子</a></li>
				<!-- <li><a class="color6" href="/contact">个人中心</a></li> -->
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>


<!--content-->
<div class=" container">
<div class=" register">
	<h1>注册</h1>
		  	  <form>
				 <div class="col-md-6 register-top-grid">
					<h3>个人信息</h3>
					 <div>
						<span>账号</span>
						<input type="text" name="username" id="username">
					 </div>
					 <div>
						<span>申请认证</span>
						<!-- <input type="text"> -->
						<select class="" name="" id="supple" style="width:540px;height:50px;background-color:#fff;margin-top:15px;">
							<option value="1">会员</option>
							<option value="2">商家</option>
						</select>
					 </div>
					 <!-- <div>
						 <span>邮箱地址</span>
						 <input type="text">
					 </div> -->
					 </div>
				     <div class="col-md-6 register-bottom-grid">
						    <h3>登录信息</h3>
							 <div>
								<span>密码</span>
								<input type="password" name="password" id="password">
							 </div>
							 <div>
								<span>确认密码</span>
								<input type="password" name="repassword" id="repassword">
							 </div>


					 </div>
					 <div class="clearfix"> </div>
				</form>
				<div style="text-align:center;margin-top:50px;">
					<button class="btn tijiao" style="border:0;margin-left:20px;width:100px;height:50px;background-color:#EF5F21;">提交</button>
				</div>
			</div>
</div>
<script>
	$(document).ready(function () """),format.raw/*232.32*/("""{"""),format.raw/*232.33*/("""
			$(".tijiao").click(function () """),format.raw/*233.35*/("""{"""),format.raw/*233.36*/("""
					var username = $("#username").val();
					var idtentify  = $('#supple option:selected').val();
					var password = $("#password").val();
					var repassword = $("#repassword").val();
					var sellers = false;
					if(password!=repassword)"""),format.raw/*239.30*/("""{"""),format.raw/*239.31*/("""
						 alert("两次密码不一致！");
						 window.location.href="http://localhost:9000/register";
					"""),format.raw/*242.6*/("""}"""),format.raw/*242.7*/("""else"""),format.raw/*242.11*/("""{"""),format.raw/*242.12*/("""
						if(idtentify==1)"""),format.raw/*243.23*/("""{"""),format.raw/*243.24*/("""
							 sellers = false;
						"""),format.raw/*245.7*/("""}"""),format.raw/*245.8*/("""else"""),format.raw/*245.12*/("""{"""),format.raw/*245.13*/("""
							 sellers = true;
						"""),format.raw/*247.7*/("""}"""),format.raw/*247.8*/("""
						var data = """),format.raw/*248.18*/("""{"""),format.raw/*248.19*/("""
							"username":username,
							"password":password,
							"sellers":sellers
						"""),format.raw/*252.7*/("""}"""),format.raw/*252.8*/("""
						$.ajax("""),format.raw/*253.14*/("""{"""),format.raw/*253.15*/("""
								url:"/register",
								type:"post",
								data:data,
								success:function (data) """),format.raw/*257.33*/("""{"""),format.raw/*257.34*/("""
									if(data=="success")"""),format.raw/*258.29*/("""{"""),format.raw/*258.30*/("""
										 alert("注册成功！");
										 window.location.href="/login";
									"""),format.raw/*261.10*/("""}"""),format.raw/*261.11*/("""
								"""),format.raw/*262.9*/("""}"""),format.raw/*262.10*/("""
						"""),format.raw/*263.7*/("""}"""),format.raw/*263.8*/(""")
					"""),format.raw/*264.6*/("""}"""),format.raw/*264.7*/("""

			"""),format.raw/*266.4*/("""}"""),format.raw/*266.5*/(""")
	"""),format.raw/*267.2*/("""}"""),format.raw/*267.3*/(""")
</script>

<!--//content-->
<div class="footer" style="position:fixed;bottom:0px;width:100%;">
		<div class="footer-class">
		<p >Copyright &copy; 2017</p>
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
                    DATE: Fri May 26 15:57:24 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/register.scala.html
                    HASH: d4b4d42146ace44c2a4718d3b83abf01ec291c22
                    MATRIX: 777->1|892->22|1000->95|1014->101|1074->140|1238->269|1252->275|1312->314|1423->389|1438->395|1495->430|2075->982|2104->983|2161->1011|2191->1012|2251->1043|2281->1044|2333->1067|2363->1068|2459->1128|2474->1134|2532->1170|2656->1258|2671->1264|2728->1299|2805->1348|2834->1349|2884->1371|2913->1372|2976->1399|2991->1405|3056->1448|3342->1706|3372->1707|3423->1729|3453->1730|3644->1885|3678->1897|3922->2105|3937->2111|3988->2140|4368->2484|4383->2490|4434->2519|10970->9026|11000->9027|11065->9063|11095->9064|11374->9314|11404->9315|11529->9412|11558->9413|11591->9417|11621->9418|11674->9442|11704->9443|11766->9477|11795->9478|11828->9482|11858->9483|11919->9516|11948->9517|11996->9536|12026->9537|12146->9629|12175->9630|12219->9645|12249->9646|12380->9748|12410->9749|12469->9779|12499->9780|12610->9862|12640->9863|12678->9873|12708->9874|12744->9882|12773->9883|12809->9891|12838->9892|12873->9899|12902->9900|12934->9904|12963->9905
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|60->32|60->32|60->32|60->32|66->38|66->38|73->45|73->45|73->45|86->58|86->58|86->58|260->232|260->232|261->233|261->233|267->239|267->239|270->242|270->242|270->242|270->242|271->243|271->243|273->245|273->245|273->245|273->245|275->247|275->247|276->248|276->248|280->252|280->252|281->253|281->253|285->257|285->257|286->258|286->258|289->261|289->261|290->262|290->262|291->263|291->263|292->264|292->264|294->266|294->266|295->267|295->267
                    -- GENERATED --
                */
            