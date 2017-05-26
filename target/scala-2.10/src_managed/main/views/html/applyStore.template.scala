
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
object applyStore extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
				    <li class="grid"><a class="color2" href="/admin">后台管理</a></li>
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

			<h3>申请开店</h3>
				<form>

						<input type="text" id="storename" name="storename" value="店名" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*88.124*/("""{"""),format.raw/*88.125*/("""this.value ='Name';"""),format.raw/*88.144*/("""}"""),format.raw/*88.145*/("""">

						<textarea cols="77" rows="6" value=" " id="description" name="description" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*90.137*/("""{"""),format.raw/*90.138*/("""this.value = 'Message';"""),format.raw/*90.161*/("""}"""),format.raw/*90.162*/("""">描述</textarea>



				</form>
				<input type="submit" id="apply" value="申请">
			</div>
			  </div>
      </div>
</div>
<script>
	$(document).ready(function () """),format.raw/*101.32*/("""{"""),format.raw/*101.33*/("""
		$("#apply").click(function () """),format.raw/*102.33*/("""{"""),format.raw/*102.34*/("""
			var storename = $("#storename").val();
			var description = $("#description").val();
			var data = """),format.raw/*105.15*/("""{"""),format.raw/*105.16*/("""
				"storename":storename,
				"description":description
			"""),format.raw/*108.4*/("""}"""),format.raw/*108.5*/("""
      console.log(data);
			$.ajax("""),format.raw/*110.11*/("""{"""),format.raw/*110.12*/("""
					url:"/business",
					type:"post",
					data:data,
					success:function (data) """),format.raw/*114.30*/("""{"""),format.raw/*114.31*/("""
						alert(data);
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
                    DATE: Fri May 26 15:57:24 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/applyStore.scala.html
                    HASH: 0cf47c7e9c3c201bf209ce86fe886c0fc186d681
                    MATRIX: 779->1|894->22|1000->93|1014->99|1074->138|1236->265|1250->271|1310->310|1418->382|1433->388|1490->423|2064->969|2093->970|2150->998|2180->999|2240->1030|2270->1031|2322->1054|2352->1055|2445->1112|2460->1118|2518->1154|2641->1241|2656->1247|2713->1282|2789->1330|2818->1331|2868->1353|2897->1354|2959->1380|2974->1386|3039->1429|3316->1678|3346->1679|3397->1701|3427->1702|3612->1851|3646->1863|3893->2074|3908->2080|3959->2109|4320->2434|4335->2440|4386->2469|5180->3234|5210->3235|5258->3254|5288->3255|5457->3395|5487->3396|5539->3419|5569->3420|5759->3581|5789->3582|5851->3615|5881->3616|6013->3719|6043->3720|6132->3781|6161->3782|6226->3818|6256->3819|6371->3905|6401->3906|6454->3931|6483->3932|6515->3936|6544->3937|6576->3941|6605->3942|6637->3946|6666->3947
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|60->32|60->32|60->32|60->32|66->38|66->38|75->47|75->47|75->47|88->60|88->60|88->60|116->88|116->88|116->88|116->88|118->90|118->90|118->90|118->90|129->101|129->101|130->102|130->102|133->105|133->105|136->108|136->108|138->110|138->110|142->114|142->114|144->116|144->116|145->117|145->117|146->118|146->118|148->120|148->120
                    -- GENERATED --
                */
            