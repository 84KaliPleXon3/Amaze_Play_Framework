
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
object issue extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Paper],play.api.templates.HtmlFormat.Appendable] {

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
				      <li><a class="color1" href="#">店铺管理</a></li>
				    <li class="grid"><a class="color2" href="#">后台管理</a></li>
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

				"""),_display_(Seq[Any](/*84.6*/for(line <- lines) yield /*84.24*/{_display_(Seq[Any](format.raw/*84.25*/("""
					<div class="blog-top">
				  <div class="col-md-6 grid_3">
						<h3><a href="blog_single.html">"""),_display_(Seq[Any](/*87.39*/line/*87.43*/.title)),format.raw/*87.49*/("""</a></h3>
						<!-- <a href="blog_single.html"><img src="images/b1.jpg" class="img-responsive" alt=""/></a> -->

						<div class="blog-poast-info">
							<ul>
								<li><a class="admin" href="#"><i> </i> """),_display_(Seq[Any](/*92.49*/line/*92.53*/.author)),format.raw/*92.60*/(""" </a></li>
								<li><span><i class="date"> </i>"""),_display_(Seq[Any](/*93.41*/line/*93.45*/.time)),format.raw/*93.50*/("""</span></li>
							</ul>
					    </div>
						<p>"""),_display_(Seq[Any](/*96.11*/line/*96.15*/.content)),format.raw/*96.23*/("""</p>
						<!-- <div class="button"><a href="#">查看全文</a></div> -->
					</div>

					<!-- <div class="clearfix"> </div> -->
				  </div>
				""")))})),format.raw/*102.6*/("""
</div>
</div>

<script type="text/javascript">
		$(document).ready(function () """),format.raw/*107.33*/("""{"""),format.raw/*107.34*/("""
			console.log("haha");
			// $.ajax("""),format.raw/*109.14*/("""{"""),format.raw/*109.15*/("""
			// 		url:"/issue",
			// 		success:function (data) """),format.raw/*111.33*/("""{"""),format.raw/*111.34*/("""
			// 			console.log(data);
			// 		"""),format.raw/*113.9*/("""}"""),format.raw/*113.10*/("""
			// """),format.raw/*114.7*/("""}"""),format.raw/*114.8*/(""")
		"""),format.raw/*115.3*/("""}"""),format.raw/*115.4*/(""")
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
                    DATE: Thu May 25 15:35:42 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/issue.scala.html
                    HASH: 40df6bf9cbd28deed95274cc211daff5bd04dae8
                    MATRIX: 779->1|893->21|995->88|1009->94|1069->133|1233->262|1247->268|1307->307|1418->382|1433->388|1490->423|2070->975|2099->976|2156->1004|2186->1005|2246->1036|2276->1037|2328->1060|2358->1061|2454->1121|2469->1127|2527->1163|2651->1251|2666->1257|2723->1292|2800->1341|2829->1342|2879->1364|2908->1365|2971->1392|2986->1398|3051->1441|3339->1701|3369->1702|3420->1724|3450->1725|3861->2100|3876->2106|3927->2135|4301->2473|4316->2479|4367->2508|5068->3174|5102->3192|5141->3193|5283->3299|5296->3303|5324->3309|5575->3524|5588->3528|5617->3535|5705->3587|5718->3591|5745->3596|5836->3651|5849->3655|5879->3663|6059->3811|6173->3896|6203->3897|6272->3937|6302->3938|6388->3995|6418->3996|6485->4035|6515->4036|6551->4044|6580->4045|6613->4050|6642->4051
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|61->33|61->33|61->33|61->33|76->48|76->48|76->48|89->61|89->61|89->61|112->84|112->84|112->84|115->87|115->87|115->87|120->92|120->92|120->92|121->93|121->93|121->93|124->96|124->96|124->96|130->102|135->107|135->107|137->109|137->109|139->111|139->111|141->113|141->113|142->114|142->114|143->115|143->115
                    -- GENERATED --
                */
            