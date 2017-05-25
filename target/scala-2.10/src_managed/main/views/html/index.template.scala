
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Commodity],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(lines: List[Commodity]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""

<!DOCTYPE html>
<html>
<head>
<title>首页</title>
<link href=""""),_display_(Seq[Any](/*7.14*/routes/*7.20*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.59*/("""" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src=""""),_display_(Seq[Any](/*9.15*/routes/*9.21*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*9.60*/(""""></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href=""""),_display_(Seq[Any](/*12.14*/routes/*12.20*/.Assets.at("stylesheets/style.css"))),format.raw/*12.55*/("""" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*18.78*/("""{"""),format.raw/*18.79*/(""" setTimeout(hideURLbar, 0); """),format.raw/*18.107*/("""}"""),format.raw/*18.108*/(""", false); function hideURLbar()"""),format.raw/*18.139*/("""{"""),format.raw/*18.140*/(""" window.scrollTo(0,1); """),format.raw/*18.163*/("""}"""),format.raw/*18.164*/(""" </script>
<!--fonts-->
<!-- start menu -->
<link href=""""),_display_(Seq[Any](/*21.14*/routes/*21.20*/.Assets.at("stylesheets/memenu.css"))),format.raw/*21.56*/("""" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src=""""),_display_(Seq[Any](/*22.38*/routes/*22.44*/.Assets.at("javascripts/memenu.js"))),format.raw/*22.79*/(""""></script>
<script>$(document).ready(function()"""),format.raw/*23.37*/("""{"""),format.raw/*23.38*/("""$(".memenu").memenu();"""),format.raw/*23.60*/("""}"""),format.raw/*23.61*/(""");</script>
<script src=""""),_display_(Seq[Any](/*24.15*/routes/*24.21*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*24.64*/(""""> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onFocus="this.value = '';" onBlur="if (this.value == '') """),format.raw/*33.99*/("""{"""),format.raw/*33.100*/("""this.value = 'Search';"""),format.raw/*33.122*/("""}"""),format.raw/*33.123*/("""">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">
					<ul>
						<li ><a href="/login"  >登录</a></li>
						<li><a  href="/register"  >注册</a></li>

					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*46.19*/routes/*46.25*/.Assets.at("images/cart.png"))),format.raw/*46.54*/("""" alt=""/></h3>
						</a>
						<!-- <p><a href="javascript:;" class="simpleCart_empty">清空购物车</a></p> -->

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
					<li class="active grid"><a class="color8" href="/">主页</a></li>

				  <li><a class="color4" href="/blog">帖子</a></li>
				  <li><a class="color6" href="/contact">个人中心</a></li>
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>

	<div class="banner">
		<div class="container">
			  <script src=""""),_display_(Seq[Any](/*78.20*/routes/*78.26*/.Assets.at("javascripts/responsiveslides.min.js"))),format.raw/*78.75*/(""""></script>
  <script>
    $(function () """),format.raw/*80.19*/("""{"""),format.raw/*80.20*/("""
      $("#slider").responsiveSlides("""),format.raw/*81.37*/("""{"""),format.raw/*81.38*/("""
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      """),format.raw/*87.7*/("""}"""),format.raw/*87.8*/(""");
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/(""");
  </script>
			<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
			    <li>

						<div class="banner-text">
							<h3>华伦天奴西服 </h3>
						<p>时间成就经典，岁月铸造永恒</p>

						</div>

				</li>
				<li>

						<div class="banner-text">
							<h3>爱登堡服装 </h3>
						<p>男人简单就好！</p>


						</div>

				</li>
				<li>
						<div class="banner-text">
							<h3>雪梦莱牌服装</h3>
						<p>潇潇洒洒雪梦莱，“一年半载”有风采！</p>
						</div>

				</li>
			</ul>
		</div>

	</div>
	</div>
<!--content-->
<div class="content">
	<div class="container">
	<div class="content-top">
		<h1>新品发布</h1>
		<div class="grid-in">
		    """),_display_(Seq[Any](/*129.8*/for(line <- lines) yield /*129.26*/{_display_(Seq[Any](format.raw/*129.27*/("""
			<div class="col-md-4 grid-top">
				<a href="/item?id="""),_display_(Seq[Any](/*131.24*/line/*131.28*/.commodityId)),format.raw/*131.40*/("""" class="b-link-stripe b-animate-go  thickbox"><img style="height:250px" class="img-responsive" src=""""),_display_(Seq[Any](/*131.142*/line/*131.146*/.picture)),format.raw/*131.154*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>"""),_display_(Seq[Any](/*134.18*/line/*134.22*/.commodityName)),format.raw/*134.36*/("""</span>
									</h3>
								</div>
				</a>


			<p><a href="/item?id="""),_display_(Seq[Any](/*140.26*/line/*140.30*/.commodityId)),format.raw/*140.42*/("""">"""),_display_(Seq[Any](/*140.45*/line/*140.49*/.commodityName)),format.raw/*140.63*/("""</a></p>
			</div>
			""")))})),format.raw/*142.5*/("""


					<div class="clearfix"> </div>
		</div>
	</div>
	<!----->

	<div class="content-top-bottom">
		<h2>特色商品</h2>
		<div class="col-md-6 men">
			<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*153.105*/routes/*153.111*/.Assets.at("images/t1.jpg"))),format.raw/*153.138*/("""" alt="">
				<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in   b-delay03 ">
										<span>女鞋</span>
									</h3>
								</div>
			</a>


		</div>
		<div class="col-md-6">
			<div class="col-md1 ">
				<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*165.106*/routes/*165.112*/.Assets.at("images/t2.jpg"))),format.raw/*165.139*/("""" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in1   b-delay03 ">
										<span>行李箱</span>
									</h3>
								</div>
				</a>

			</div>
			<div class="col-md2">
				<div class="col-md-6 men1">
					<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*176.107*/routes/*176.113*/.Assets.at("images/t3.jpg"))),format.raw/*176.140*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>领带</span>
									</h3>
								</div>
					</a>

				</div>
				<div class="col-md-6 men2">
					<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*186.107*/routes/*186.113*/.Assets.at("images/t4.jpg"))),format.raw/*186.140*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>男鞋</span>
									</h3>
								</div>
					</a>

				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div>
	</div>
</div>
<div class="footer" style="margin-top:40px;">
		<div class="footer-class">
		<p >Copyright &copy; 2017</p>
		</div>
</div>
</body>
</html>
"""))}
    }
    
    def render(lines:List[Commodity]): play.api.templates.HtmlFormat.Appendable = apply(lines)
    
    def f:((List[Commodity]) => play.api.templates.HtmlFormat.Appendable) = (lines) => apply(lines)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 25 16:57:06 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/index.scala.html
                    HASH: 0c44d3000a34fd94d6d6732fdfe2f375b578397a
                    MATRIX: 783->1|901->25|999->88|1013->94|1073->133|1235->260|1249->266|1309->305|1417->377|1432->383|1489->418|2063->964|2092->965|2149->993|2179->994|2239->1025|2269->1026|2321->1049|2351->1050|2444->1107|2459->1113|2517->1149|2640->1236|2655->1242|2712->1277|2788->1325|2817->1326|2867->1348|2896->1349|2958->1375|2973->1381|3038->1424|3315->1673|3345->1674|3396->1696|3426->1697|3780->2015|3795->2021|3846->2050|4202->2370|4217->2376|4268->2405|4719->2820|4734->2826|4805->2875|4874->2916|4903->2917|4968->2954|4997->2955|5140->3071|5168->3072|5202->3079|5230->3080|5888->3702|5923->3720|5963->3721|6059->3780|6073->3784|6108->3796|6248->3898|6263->3902|6295->3910|6448->4026|6462->4030|6499->4044|6610->4118|6624->4122|6659->4134|6699->4137|6713->4141|6750->4155|6805->4178|7092->4427|7109->4433|7160->4460|7530->4792|7547->4798|7598->4825|7979->5168|7996->5174|8047->5201|8406->5522|8423->5528|8474->5555
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|61->33|61->33|61->33|61->33|74->46|74->46|74->46|87->59|87->59|87->59|106->78|106->78|106->78|108->80|108->80|109->81|109->81|115->87|115->87|116->88|116->88|157->129|157->129|157->129|159->131|159->131|159->131|159->131|159->131|159->131|162->134|162->134|162->134|168->140|168->140|168->140|168->140|168->140|168->140|170->142|181->153|181->153|181->153|193->165|193->165|193->165|204->176|204->176|204->176|214->186|214->186|214->186
                    -- GENERATED --
                */
            