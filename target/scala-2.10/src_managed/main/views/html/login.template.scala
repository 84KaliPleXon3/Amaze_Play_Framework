
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Login</title>
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
<!-- start menu -->
<link href=""""),_display_(Seq[Any](/*18.14*/routes/*18.20*/.Assets.at("stylesheets/memenu.css"))),format.raw/*18.56*/("""" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src=""""),_display_(Seq[Any](/*19.38*/routes/*19.44*/.Assets.at("javascripts/memenu.js"))),format.raw/*19.79*/(""""></script>
<script>$(document).ready(function()"""),format.raw/*20.37*/("""{"""),format.raw/*20.38*/("""$(".memenu").memenu();"""),format.raw/*20.60*/("""}"""),format.raw/*20.61*/(""");</script>
<script src=""""),_display_(Seq[Any](/*21.15*/routes/*21.21*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*21.64*/(""""> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*30.99*/("""{"""),format.raw/*30.100*/("""this.value = 'Search';"""),format.raw/*30.122*/("""}"""),format.raw/*30.123*/("""">
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
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*43.19*/routes/*43.25*/.Assets.at("images/cart.png"))),format.raw/*43.54*/("""" alt=""/></h3>
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
					<a href="/"><img src=""""),_display_(Seq[Any](/*56.29*/routes/*56.35*/.Assets.at("images/logo.png"))),format.raw/*56.64*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
					<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="/">首页</a></li>
				      <li><a class="color1" href="#">店铺管理</a></li>
				    <li class="grid"><a class="color2" href="#">	后台管理</a> </li>
				<li><a class="color4" href="/blog">发帖</a></li>
				<!-- <li><a class="color6" href="/contact">个人中心</a></li> -->
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>


<!--content-->
<div class="container">
		<div class="account">
		<h1>账号</h1>
		<div class="account-pass">
		<div class="col-md-8 account-top">
			<form>
			<div>
				<span>账号</span>
				<input type="text" name="username" id="username">
			</div>
			<div>
				<span >密码</span>
				<input type="password" name="password" id="password">
			</div>
			</form>
			<div><input type="submit" onsubmit="return false;" id="login" value="登录"></div>
		</div>
		<div class="col-md-4 left-account">
			<!-- <a href="single.html"><img class="img-responsive " src=""""),_display_(Seq[Any](/*94.66*/routes/*94.72*/.Assets.at("images/s1.jpg"))),format.raw/*94.99*/("""" alt=""></a> -->
			<div class="five">
				<span><a href="/register" class="create">注册</a></span>
			</div>

<div class="clearfix"> </div>
		</div>
	<div class="clearfix"> </div>
	</div>
	</div>

</div>
<script>
		$(document).ready(function() """),format.raw/*107.32*/("""{"""),format.raw/*107.33*/("""
				$("#login").click(function() """),format.raw/*108.34*/("""{"""),format.raw/*108.35*/("""
						var username = $("#username").val();
						var password = $("#password").val();
						console.log(username);
						console.log(password);
						var data = """),format.raw/*113.18*/("""{"""),format.raw/*113.19*/("""
								"username":username,
								"password":password
						"""),format.raw/*116.7*/("""}"""),format.raw/*116.8*/(""";
						$.ajax("""),format.raw/*117.14*/("""{"""),format.raw/*117.15*/("""
								url:"/login",
								type:"post",
								data:data,
								success:function (data) """),format.raw/*121.33*/("""{"""),format.raw/*121.34*/("""
										console.log(data);
										if(data=="success")
										    window.location.href="/";
										else
										    alert("账号或密码错误");
								"""),format.raw/*127.9*/("""}"""),format.raw/*127.10*/("""
						"""),format.raw/*128.7*/("""}"""),format.raw/*128.8*/(""")
				"""),format.raw/*129.5*/("""}"""),format.raw/*129.6*/(""")
		"""),format.raw/*130.3*/("""}"""),format.raw/*130.4*/(""")
</script>
<!--//content-->
<div class="footer">
		<div class="footer-class">
		<p >Copyright &copy;2017</p>
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
                    DATE: Fri May 26 12:40:32 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/login.scala.html
                    HASH: 76844231714d7d4bc4b4bedd4ea3f767eff9a93e
                    MATRIX: 855->0|958->68|972->74|1032->113|1196->242|1210->248|1270->287|1381->362|1396->368|1453->403|2033->955|2062->956|2119->984|2149->985|2209->1016|2239->1017|2291->1040|2321->1041|2403->1087|2418->1093|2476->1129|2600->1217|2615->1223|2672->1258|2749->1307|2778->1308|2828->1330|2857->1331|2920->1358|2935->1364|3000->1407|3286->1665|3316->1666|3367->1688|3397->1689|3790->2046|3805->2052|3856->2081|4230->2419|4245->2425|4296->2454|5399->3521|5414->3527|5463->3554|5749->3811|5779->3812|5843->3847|5873->3848|6069->4015|6099->4016|6194->4083|6223->4084|6268->4100|6298->4101|6426->4200|6456->4201|6645->4362|6675->4363|6711->4371|6740->4372|6775->4379|6804->4380|6837->4385|6866->4386
                    LINES: 29->1|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|48->20|49->21|49->21|49->21|58->30|58->30|58->30|58->30|71->43|71->43|71->43|84->56|84->56|84->56|122->94|122->94|122->94|135->107|135->107|136->108|136->108|141->113|141->113|144->116|144->116|145->117|145->117|149->121|149->121|155->127|155->127|156->128|156->128|157->129|157->129|158->130|158->130
                    -- GENERATED --
                */
            