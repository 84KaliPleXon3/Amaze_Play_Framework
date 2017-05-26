
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
object editissue extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<!DOCTYPE html>
<html>
<head>
<title>Blog_Single</title>
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
						<li>
</li>

					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*47.19*/routes/*47.25*/.Assets.at("images/cart.png"))),format.raw/*47.54*/("""" alt=""/></h3>
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
					<a href="/"><img src=""""),_display_(Seq[Any](/*60.29*/routes/*60.35*/.Assets.at("images/logo.png"))),format.raw/*60.64*/("""" alt=""></a>
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

						<input type="text" id="title" name="title" value="标题" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*88.116*/("""{"""),format.raw/*88.117*/("""this.value ='Name';"""),format.raw/*88.136*/("""}"""),format.raw/*88.137*/("""">

						<textarea cols="77" rows="6" value=" " id="content" name="content" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*90.129*/("""{"""),format.raw/*90.130*/("""this.value = 'Message';"""),format.raw/*90.153*/("""}"""),format.raw/*90.154*/("""">内容</textarea>



				</form>
				<input type="submit" id="issue" value="发表">
			</div>
			  </div>
      </div>
</div>
<script>
	$(document).ready(function () """),format.raw/*101.32*/("""{"""),format.raw/*101.33*/("""
		$("#issue").click(function () """),format.raw/*102.33*/("""{"""),format.raw/*102.34*/("""
			var title = $("#title").val();
			var content = $("#content").val();
			var data = """),format.raw/*105.15*/("""{"""),format.raw/*105.16*/("""
				"title":title,
				"content":content
			"""),format.raw/*108.4*/("""}"""),format.raw/*108.5*/("""
			$.ajax("""),format.raw/*109.11*/("""{"""),format.raw/*109.12*/("""
					url:"/issue",
					type:"post",
					data:data,
					success:function (data) """),format.raw/*113.30*/("""{"""),format.raw/*113.31*/("""
						alert(data);
						window.location.href="http://localhost:9000/blog";
					"""),format.raw/*116.6*/("""}"""),format.raw/*116.7*/("""
			"""),format.raw/*117.4*/("""}"""),format.raw/*117.5*/(""")
		"""),format.raw/*118.3*/("""}"""),format.raw/*118.4*/(""")

	"""),format.raw/*120.2*/("""}"""),format.raw/*120.3*/(""")
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
    
    def render(current_user:String): play.api.templates.HtmlFormat.Appendable = apply(current_user)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (current_user) => apply(current_user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 26 15:57:25 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/editissue.scala.html
                    HASH: d978ba95c716538ba6e97ee5f636b34e207d8525
                    MATRIX: 778->1|893->22|1004->98|1018->104|1078->143|1242->272|1256->278|1316->317|1427->392|1442->398|1499->433|2079->985|2108->986|2165->1014|2195->1015|2255->1046|2285->1047|2337->1070|2367->1071|2463->1131|2478->1137|2536->1173|2660->1261|2675->1267|2732->1302|2809->1351|2838->1352|2888->1374|2917->1375|2980->1402|2995->1408|3060->1451|3346->1709|3376->1710|3427->1732|3457->1733|3648->1888|3682->1900|3938->2120|3953->2126|4004->2155|4378->2493|4393->2499|4444->2528|5260->3315|5290->3316|5338->3335|5368->3336|5531->3470|5561->3471|5613->3494|5643->3495|5844->3667|5874->3668|5937->3702|5967->3703|6086->3793|6116->3794|6192->3842|6221->3843|6262->3855|6292->3856|6408->3943|6438->3944|6551->4029|6580->4030|6613->4035|6642->4036|6675->4041|6704->4042|6738->4048|6767->4049
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|60->32|60->32|60->32|60->32|66->38|66->38|75->47|75->47|75->47|88->60|88->60|88->60|116->88|116->88|116->88|116->88|118->90|118->90|118->90|118->90|129->101|129->101|130->102|130->102|133->105|133->105|136->108|136->108|137->109|137->109|141->113|141->113|144->116|144->116|145->117|145->117|146->118|146->118|148->120|148->120
                    -- GENERATED --
                */
            