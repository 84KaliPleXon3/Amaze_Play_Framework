
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<link href=""""),_display_(Seq[Any](/*5.14*/routes/*5.20*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*5.59*/("""" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src=""""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*7.60*/(""""></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href=""""),_display_(Seq[Any](/*10.14*/routes/*10.20*/.Assets.at("stylesheets/style.css"))),format.raw/*10.55*/("""" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*16.78*/("""{"""),format.raw/*16.79*/(""" setTimeout(hideURLbar, 0); """),format.raw/*16.107*/("""}"""),format.raw/*16.108*/(""", false); function hideURLbar()"""),format.raw/*16.139*/("""{"""),format.raw/*16.140*/(""" window.scrollTo(0,1); """),format.raw/*16.163*/("""}"""),format.raw/*16.164*/(""" </script>
<!--fonts-->
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
						<li ><a class="lock"  href="/login"  >登录</a></li>
						<li><a class="lock" href="/register"  >注册</a></li>
					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">
							购物车</div>
							<img src=""""),_display_(Seq[Any](/*44.19*/routes/*44.25*/.Assets.at("images/cart.png"))),format.raw/*44.54*/("""" alt=""/></h3>
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
					<a href="/"><img src=""""),_display_(Seq[Any](/*57.29*/routes/*57.35*/.Assets.at("images/logo.png"))),format.raw/*57.64*/("""" alt=""></a>
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
	$(document).ready(function () """),format.raw/*231.32*/("""{"""),format.raw/*231.33*/("""
			$(".tijiao").click(function () """),format.raw/*232.35*/("""{"""),format.raw/*232.36*/("""
					var username = $("#username").val();
					var idtentify  = $('#supple option:selected').val();
					var password = $("#password").val();
					var repassword = $("#repassword").val();
					var sellers = false;
					if(password!=repassword)"""),format.raw/*238.30*/("""{"""),format.raw/*238.31*/("""
						 alert("两次密码不一致！");
						 window.location.href="http://localhost:9000/register";
					"""),format.raw/*241.6*/("""}"""),format.raw/*241.7*/("""else"""),format.raw/*241.11*/("""{"""),format.raw/*241.12*/("""
						if(idtentify==1)"""),format.raw/*242.23*/("""{"""),format.raw/*242.24*/("""
							 sellers = false;
						"""),format.raw/*244.7*/("""}"""),format.raw/*244.8*/("""else"""),format.raw/*244.12*/("""{"""),format.raw/*244.13*/("""
							 sellers = true;
						"""),format.raw/*246.7*/("""}"""),format.raw/*246.8*/("""
						var data = """),format.raw/*247.18*/("""{"""),format.raw/*247.19*/("""
							"username":username,
							"password":password,
							"sellers":sellers
						"""),format.raw/*251.7*/("""}"""),format.raw/*251.8*/("""
						$.ajax("""),format.raw/*252.14*/("""{"""),format.raw/*252.15*/("""
								url:"/register",
								type:"post",
								data:data,
								success:function (data) """),format.raw/*256.33*/("""{"""),format.raw/*256.34*/("""
									if(data=="success")"""),format.raw/*257.29*/("""{"""),format.raw/*257.30*/("""
										 alert("注册成功！");
										 window.location.href="/login";
									"""),format.raw/*260.10*/("""}"""),format.raw/*260.11*/("""
								"""),format.raw/*261.9*/("""}"""),format.raw/*261.10*/("""
						"""),format.raw/*262.7*/("""}"""),format.raw/*262.8*/(""")
					"""),format.raw/*263.6*/("""}"""),format.raw/*263.7*/("""

			"""),format.raw/*265.4*/("""}"""),format.raw/*265.5*/(""")
	"""),format.raw/*266.2*/("""}"""),format.raw/*266.3*/(""")
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
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 26 14:34:21 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/register.scala.html
                    HASH: ac922ba3f8b47eb1d4f6b15714487a74f05c205b
                    MATRIX: 858->0|964->71|978->77|1038->116|1202->245|1216->251|1276->290|1387->365|1402->371|1459->406|2039->958|2068->959|2125->987|2155->988|2215->1019|2245->1020|2297->1043|2327->1044|2423->1104|2438->1110|2496->1146|2620->1234|2635->1240|2692->1275|2769->1324|2798->1325|2848->1347|2877->1348|2940->1375|2955->1381|3020->1424|3306->1682|3336->1683|3387->1705|3417->1706|3817->2070|3832->2076|3883->2105|4263->2449|4278->2455|4329->2484|10865->8991|10895->8992|10960->9028|10990->9029|11269->9279|11299->9280|11424->9377|11453->9378|11486->9382|11516->9383|11569->9407|11599->9408|11661->9442|11690->9443|11723->9447|11753->9448|11814->9481|11843->9482|11891->9501|11921->9502|12041->9594|12070->9595|12114->9610|12144->9611|12275->9713|12305->9714|12364->9744|12394->9745|12505->9827|12535->9828|12573->9838|12603->9839|12639->9847|12668->9848|12704->9856|12733->9857|12768->9864|12797->9865|12829->9869|12858->9870
                    LINES: 29->1|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|59->31|59->31|59->31|59->31|72->44|72->44|72->44|85->57|85->57|85->57|259->231|259->231|260->232|260->232|266->238|266->238|269->241|269->241|269->241|269->241|270->242|270->242|272->244|272->244|272->244|272->244|274->246|274->246|275->247|275->247|279->251|279->251|280->252|280->252|284->256|284->256|285->257|285->257|288->260|288->260|289->261|289->261|290->262|290->262|291->263|291->263|293->265|293->265|294->266|294->266
                    -- GENERATED --
                */
            