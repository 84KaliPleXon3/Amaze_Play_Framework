
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
object editissue extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Blog_Single</title>
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
				      <li><a class="color1" href="/business">店铺管理</a></li>
				    <!-- <li class="grid"><a class="color2" href="#">后台管理</a></li> -->
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
	       <div class="blog-top">
				<div class="single-bottom">

			<h3>发帖</h3>
				<form>

						<input type="text" id="title" name="title" value="标题" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*87.116*/("""{"""),format.raw/*87.117*/("""this.value ='Name';"""),format.raw/*87.136*/("""}"""),format.raw/*87.137*/("""">

						<textarea cols="77" rows="6" value=" " id="content" name="content" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*89.129*/("""{"""),format.raw/*89.130*/("""this.value = 'Message';"""),format.raw/*89.153*/("""}"""),format.raw/*89.154*/("""">内容</textarea>



				</form>
				<input type="submit" id="issue" value="发表">
			</div>
			  </div>
      </div>
</div>
<script>
	$(document).ready(function () """),format.raw/*100.32*/("""{"""),format.raw/*100.33*/("""
		$("#issue").click(function () """),format.raw/*101.33*/("""{"""),format.raw/*101.34*/("""
			var title = $("#title").val();
			var content = $("#content").val();
			var data = """),format.raw/*104.15*/("""{"""),format.raw/*104.16*/("""
				"title":title,
				"content":content
			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/("""
			$.ajax("""),format.raw/*108.11*/("""{"""),format.raw/*108.12*/("""
					url:"/issue",
					type:"post",
					data:data,
					success:function (data) """),format.raw/*112.30*/("""{"""),format.raw/*112.31*/("""
						alert(data);
						window.location.href="http://localhost:9000/blog";
					"""),format.raw/*115.6*/("""}"""),format.raw/*115.7*/("""
			"""),format.raw/*116.4*/("""}"""),format.raw/*116.5*/(""")
		"""),format.raw/*117.3*/("""}"""),format.raw/*117.4*/(""")

	"""),format.raw/*119.2*/("""}"""),format.raw/*119.3*/(""")
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
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 26 13:58:11 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/editissue.scala.html
                    HASH: e85793ed031a93b3ed15cc7c81b07c4b675bec66
                    MATRIX: 859->0|968->74|982->80|1042->119|1206->248|1220->254|1280->293|1391->368|1406->374|1463->409|2043->961|2072->962|2129->990|2159->991|2219->1022|2249->1023|2301->1046|2331->1047|2427->1107|2442->1113|2500->1149|2624->1237|2639->1243|2696->1278|2773->1327|2802->1328|2852->1350|2881->1351|2944->1378|2959->1384|3024->1427|3310->1685|3340->1686|3391->1708|3421->1709|3833->2085|3848->2091|3899->2120|4273->2458|4288->2464|4339->2493|5155->3280|5185->3281|5233->3300|5263->3301|5426->3435|5456->3436|5508->3459|5538->3460|5739->3632|5769->3633|5832->3667|5862->3668|5981->3758|6011->3759|6087->3807|6116->3808|6157->3820|6187->3821|6303->3908|6333->3909|6446->3994|6475->3995|6508->4000|6537->4001|6570->4006|6599->4007|6633->4013|6662->4014
                    LINES: 29->1|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|59->31|59->31|59->31|59->31|74->46|74->46|74->46|87->59|87->59|87->59|115->87|115->87|115->87|115->87|117->89|117->89|117->89|117->89|128->100|128->100|129->101|129->101|132->104|132->104|135->107|135->107|136->108|136->108|140->112|140->112|143->115|143->115|144->116|144->116|145->117|145->117|147->119|147->119
                    -- GENERATED --
                */
            