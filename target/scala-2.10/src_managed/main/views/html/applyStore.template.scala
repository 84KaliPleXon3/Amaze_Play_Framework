
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
object applyStore extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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

						<input type="text" id="storename" name="storename" value="店名" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*87.124*/("""{"""),format.raw/*87.125*/("""this.value ='Name';"""),format.raw/*87.144*/("""}"""),format.raw/*87.145*/("""">

						<textarea cols="77" rows="6" value=" " id="description" name="description" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*89.137*/("""{"""),format.raw/*89.138*/("""this.value = 'Message';"""),format.raw/*89.161*/("""}"""),format.raw/*89.162*/("""">描述</textarea>



				</form>
				<input type="submit" id="apply" value="申请">
			</div>
			  </div>
      </div>
</div>
<script>
	$(document).ready(function () """),format.raw/*100.32*/("""{"""),format.raw/*100.33*/("""
		$("#apply").click(function () """),format.raw/*101.33*/("""{"""),format.raw/*101.34*/("""
			var storename = $("#storename").val();
			var description = $("#description").val();
			var data = """),format.raw/*104.15*/("""{"""),format.raw/*104.16*/("""
				"storename":storename,
				"description":description
			"""),format.raw/*107.4*/("""}"""),format.raw/*107.5*/("""
      console.log(data);
			$.ajax("""),format.raw/*109.11*/("""{"""),format.raw/*109.12*/("""
					url:"/business",
					type:"post",
					data:data,
					success:function (data) """),format.raw/*113.30*/("""{"""),format.raw/*113.31*/("""
						alert(data);
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
                    DATE: Fri May 26 13:59:26 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/applyStore.scala.html
                    HASH: 0ac2dfa69ad3c661cb86c4529755ce2ae9d7ec6e
                    MATRIX: 860->0|965->70|979->76|1039->115|1201->242|1215->248|1275->287|1383->359|1398->365|1455->400|2029->946|2058->947|2115->975|2145->976|2205->1007|2235->1008|2287->1031|2317->1032|2410->1089|2425->1095|2483->1131|2606->1218|2621->1224|2678->1259|2754->1307|2783->1308|2833->1330|2862->1331|2924->1357|2939->1363|3004->1406|3281->1655|3311->1656|3362->1678|3392->1679|3789->2040|3804->2046|3855->2075|4216->2400|4231->2406|4282->2435|5076->3200|5106->3201|5154->3220|5184->3221|5353->3361|5383->3362|5435->3385|5465->3386|5655->3547|5685->3548|5747->3581|5777->3582|5909->3685|5939->3686|6028->3747|6057->3748|6122->3784|6152->3785|6267->3871|6297->3872|6350->3897|6379->3898|6411->3902|6440->3903|6472->3907|6501->3908|6533->3912|6562->3913
                    LINES: 29->1|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|49->21|50->22|50->22|50->22|59->31|59->31|59->31|59->31|74->46|74->46|74->46|87->59|87->59|87->59|115->87|115->87|115->87|115->87|117->89|117->89|117->89|117->89|128->100|128->100|129->101|129->101|132->104|132->104|135->107|135->107|137->109|137->109|141->113|141->113|143->115|143->115|144->116|144->116|145->117|145->117|147->119|147->119
                    -- GENERATED --
                */
            