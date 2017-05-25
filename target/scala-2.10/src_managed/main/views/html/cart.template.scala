
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
object cart extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<title>购物车</title>
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
						<li>
</li>

					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*46.19*/routes/*46.25*/.Assets.at("images/cart.png"))),format.raw/*46.54*/("""" alt=""/></h3>
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
					<a href="/"><img src=""""),_display_(Seq[Any](/*59.29*/routes/*59.35*/.Assets.at("images/logo.png"))),format.raw/*59.64*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
					<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="/">首页</a></li>
				      <li><a class="color1" href="#">店铺管理</a></li>
				    <li class="grid"><a class="color2" href="#">后台管理</a></li>
				<li><a class="color4" href="/blog">所有帖子</a></li>
				<!-- <li><a class="color6" href="/contact">Conact</a></li> -->
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>


<div class="container">
	<div class="check">
			 <h1>我的购物车</h1>
		 <div class="col-md-9 cart-items">

				<script>$(document).ready(function(c) """),format.raw/*83.43*/("""{"""),format.raw/*83.44*/("""
					$('.close1').on('click', function(c)"""),format.raw/*84.42*/("""{"""),format.raw/*84.43*/("""
						$('.cart-header').fadeOut('slow', function(c)"""),format.raw/*85.52*/("""{"""),format.raw/*85.53*/("""
							$('.cart-header').remove();
						"""),format.raw/*87.7*/("""}"""),format.raw/*87.8*/(""");
						"""),format.raw/*88.7*/("""}"""),format.raw/*88.8*/(""");
					"""),format.raw/*89.6*/("""}"""),format.raw/*89.7*/(""");
			   </script>
			 <div class="cart-header">
				 <div class="close1"> </div>
				 <div class="cart-sec simpleCart_shelfItem">
						<div class="cart-item cyc">
							 <img src=""""),_display_(Seq[Any](/*95.20*/routes/*95.26*/.Assets.at("images/pic1.jpg"))),format.raw/*95.55*/("""" class="img-responsive" alt=""/>
						</div>
					   <div class="cart-item-info">
						<h3><a href="#">衣服一</a></h3>
					   </div>
					   <div class="clearfix"></div>
				  </div>
			 </div>
			 <script>
			 	$(document).ready(function(c) """),format.raw/*104.36*/("""{"""),format.raw/*104.37*/("""
					$('.close2').on('click', function(c)"""),format.raw/*105.42*/("""{"""),format.raw/*105.43*/("""
							$('.cart-header2').fadeOut('slow', function(c)"""),format.raw/*106.54*/("""{"""),format.raw/*106.55*/("""
						$('.cart-header2').remove();
					"""),format.raw/*108.6*/("""}"""),format.raw/*108.7*/(""");
					"""),format.raw/*109.6*/("""}"""),format.raw/*109.7*/(""");
					"""),format.raw/*110.6*/("""}"""),format.raw/*110.7*/(""");
			 </script>
			 <div class="cart-header2">
				 <div class="close2"> </div>
				  <div class="cart-sec simpleCart_shelfItem">
						<div class="cart-item cyc">
							 <img src=""""),_display_(Seq[Any](/*116.20*/routes/*116.26*/.Assets.at("images/pic2.jpg"))),format.raw/*116.55*/("""" class="img-responsive" alt=""/>
						</div>
					   <div class="cart-item-info">
						<h3><a href="#">衣服二</a></h3>
					   </div>
					   <div class="clearfix"></div>

				  </div>
			  </div>
		 </div>
		  <div class="col-md-3 cart-total">
			 <a class="continue" href="#">支付</a>
			 <div class="price-details">
				 <h3>价格细节</h3>
				 <span>单价</span>
				 <span class="total1">200.00</span>
				 <span>折扣</span>
				 <span class="total1">---</span>
				 <span>数量</span>
				 <span class="total1">3</span>
				 <div class="clearfix"></div>
			 </div>
			 <ul class="total_price">
			   <li class="last_price"> <h4>总计</h4></li>
			   <li class="last_price"><span>600.00</span></li>
			   <div class="clearfix"> </div>
			 </ul>
			 <div class="clearfix"></div>
			 <a class="order" href="#">支付</a>
			 <div class="price-details">
				 <h3>价格细节</h3>
				 <span>单价</span>
				 <span class="total1">200.00</span>
				 <span>折扣</span>
				 <span class="total1">---</span>
				 <span>数量</span>
				 <span class="total1">3</span>
				 <div class="clearfix"></div>
			 </div>
			 <ul class="total_price">
			   <li class="last_price"> <h4>总计</h4></li>
			   <li class="last_price"><span>600.00</span></li>
			   <div class="clearfix"> </div>
			 </ul>
			</div>
			<div class="clearfix"> </div>
	 </div>
	 </div>
<!--//content-->
<div class="footer">
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
                    DATE: Thu May 25 15:14:03 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/cart.scala.html
                    HASH: 393fbe15e24470b2902974256d63d39add8810df
                    MATRIX: 854->0|955->66|969->72|1029->111|1193->240|1207->246|1267->285|1378->360|1393->366|1450->401|2030->953|2059->954|2116->982|2146->983|2206->1014|2236->1015|2288->1038|2318->1039|2414->1099|2429->1105|2487->1141|2611->1229|2626->1235|2683->1270|2760->1319|2789->1320|2839->1342|2868->1343|2931->1370|2946->1376|3011->1419|3297->1677|3327->1678|3378->1700|3408->1701|3820->2077|3835->2083|3886->2112|4266->2456|4281->2462|4332->2491|5009->3140|5038->3141|5109->3184|5138->3185|5219->3238|5248->3239|5319->3283|5347->3284|5384->3294|5412->3295|5448->3304|5476->3305|5702->3495|5717->3501|5768->3530|6049->3782|6079->3783|6151->3826|6181->3827|6265->3882|6295->3883|6366->3926|6395->3927|6432->3936|6461->3937|6498->3946|6527->3947|6754->4137|6770->4143|6822->4172
                    LINES: 29->1|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|59->31|59->31|59->31|59->31|74->46|74->46|74->46|87->59|87->59|87->59|111->83|111->83|112->84|112->84|113->85|113->85|115->87|115->87|116->88|116->88|117->89|117->89|123->95|123->95|123->95|132->104|132->104|133->105|133->105|134->106|134->106|136->108|136->108|137->109|137->109|138->110|138->110|144->116|144->116|144->116
                    -- GENERATED --
                */
            