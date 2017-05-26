
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
object blog extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Paper],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(lines: List[Paper]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.22*/("""
<!DOCTYPE html>
<html>
<head>
<title>帖子</title>
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
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*33.99*/("""{"""),format.raw/*33.100*/("""this.value = 'Search';"""),format.raw/*33.122*/("""}"""),format.raw/*33.123*/("""">
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
							<img src=""""),_display_(Seq[Any](/*48.19*/routes/*48.25*/.Assets.at("images/cart.png"))),format.raw/*48.54*/("""" alt=""/></h3>
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
					<a href="/"><img src=""""),_display_(Seq[Any](/*61.29*/routes/*61.35*/.Assets.at("images/logo.png"))),format.raw/*61.64*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="/">首页</a></li>
				      <li><a class="color1" href="/bussiness">店铺管理</a></li>
				<li><a class="color4" href="/blog">所有帖子</a></li>
				<!-- <li><a class="color6" href="/contact">个人中心</a></li> -->
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>
<!--content-->
<div class="blog">
<div class="container">
	<h1>所有帖子</h1>
				<div class="button" style="margin-bottom:20px;"><a href="/blog_single">发帖</a></div>

				"""),_display_(Seq[Any](/*83.6*/for(line <- lines) yield /*83.24*/{_display_(Seq[Any](format.raw/*83.25*/("""
					<div class="blog-top">
				  <div class="col-md-6 grid_3">
						<h3><a href="blog_single.html">"""),_display_(Seq[Any](/*86.39*/line/*86.43*/.title)),format.raw/*86.49*/("""</a></h3>
						<!-- <a href="blog_single.html"><img src="images/b1.jpg" class="img-responsive" alt=""/></a> -->

						<div class="blog-poast-info">
							<ul>
								<li><a class="admin" href="#"><i> </i> """),_display_(Seq[Any](/*91.49*/line/*91.53*/.author)),format.raw/*91.60*/(""" </a></li>
								<li><span><i class="date"> </i>"""),_display_(Seq[Any](/*92.41*/line/*92.45*/.time)),format.raw/*92.50*/("""</span></li>
							</ul>
					    </div>
						<p>"""),_display_(Seq[Any](/*95.11*/line/*95.15*/.content)),format.raw/*95.23*/("""</p>
						<!-- <div class="button"><a href="#">查看全文</a></div> -->
					</div>

					<!-- <div class="clearfix"> </div> -->
				  </div>
				""")))})),format.raw/*101.6*/("""
</div>
</div>

<script type="text/javascript">
		$(document).ready(function () """),format.raw/*106.33*/("""{"""),format.raw/*106.34*/("""
			console.log("haha");
			// $.ajax("""),format.raw/*108.14*/("""{"""),format.raw/*108.15*/("""
			// 		url:"/issue",
			// 		success:function (data) """),format.raw/*110.33*/("""{"""),format.raw/*110.34*/("""
			// 			console.log(data);
			// 		"""),format.raw/*112.9*/("""}"""),format.raw/*112.10*/("""
			// """),format.raw/*113.7*/("""}"""),format.raw/*113.8*/(""")
		"""),format.raw/*114.3*/("""}"""),format.raw/*114.4*/(""")
</script>
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
    
    def render(lines:List[Paper]): play.api.templates.HtmlFormat.Appendable = apply(lines)
    
    def f:((List[Paper]) => play.api.templates.HtmlFormat.Appendable) = (lines) => apply(lines)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 26 13:57:07 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/blog.scala.html
                    HASH: ae6b5d96fd03ea37abcddc8982bde0341ae8ee0f
                    MATRIX: 778->1|892->21|994->88|1008->94|1068->133|1232->262|1246->268|1306->307|1417->382|1432->388|1489->423|2069->975|2098->976|2155->1004|2185->1005|2245->1036|2275->1037|2327->1060|2357->1061|2453->1121|2468->1127|2526->1163|2650->1251|2665->1257|2722->1292|2799->1341|2828->1342|2878->1364|2907->1365|2970->1392|2985->1398|3050->1441|3338->1701|3368->1702|3419->1724|3449->1725|3860->2100|3875->2106|3926->2135|4300->2473|4315->2479|4366->2508|5009->3116|5043->3134|5082->3135|5224->3241|5237->3245|5265->3251|5516->3466|5529->3470|5558->3477|5646->3529|5659->3533|5686->3538|5777->3593|5790->3597|5820->3605|6000->3753|6114->3838|6144->3839|6213->3879|6243->3880|6329->3937|6359->3938|6426->3977|6456->3978|6492->3986|6521->3987|6554->3992|6583->3993
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|61->33|61->33|61->33|61->33|76->48|76->48|76->48|89->61|89->61|89->61|111->83|111->83|111->83|114->86|114->86|114->86|119->91|119->91|119->91|120->92|120->92|120->92|123->95|123->95|123->95|129->101|134->106|134->106|136->108|136->108|138->110|138->110|140->112|140->112|141->113|141->113|142->114|142->114
                    -- GENERATED --
                */
            