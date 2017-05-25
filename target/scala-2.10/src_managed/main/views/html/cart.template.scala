
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
object cart extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Cart],List[Commodity],Double,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(items: List[Cart],commoditys: List[Commodity],money: Double):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.63*/("""

<!DOCTYPE html>
<html>
	<head>
		<title>购物车</title>
		<link href=""""),_display_(Seq[Any](/*7.16*/routes/*7.22*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.61*/("""" rel="stylesheet" type="text/css" media="all" />
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src=""""),_display_(Seq[Any](/*9.17*/routes/*9.23*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*9.62*/(""""></script>
		<!-- Custom Theme files -->
		<!--theme-style-->
		<link href=""""),_display_(Seq[Any](/*12.16*/routes/*12.22*/.Assets.at("stylesheets/style.css"))),format.raw/*12.57*/("""" rel="stylesheet" type="text/css" media="all" />
		<!--//theme-style-->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
		Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
		<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*18.80*/("""{"""),format.raw/*18.81*/(""" setTimeout(hideURLbar, 0); """),format.raw/*18.109*/("""}"""),format.raw/*18.110*/(""", false); function hideURLbar()"""),format.raw/*18.141*/("""{"""),format.raw/*18.142*/(""" window.scrollTo(0,1); """),format.raw/*18.165*/("""}"""),format.raw/*18.166*/(""" </script>
		<!--fonts-->
		<!-- start menu -->
		<link href=""""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.Assets.at("stylesheets/memenu.css"))),format.raw/*21.58*/("""" rel="stylesheet" type="text/css" media="all" />
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*22.40*/routes/*22.46*/.Assets.at("javascripts/memenu.js"))),format.raw/*22.81*/(""""></script>
		<script>$(document).ready(function()"""),format.raw/*23.39*/("""{"""),format.raw/*23.40*/("""$(".memenu").memenu();"""),format.raw/*23.62*/("""}"""),format.raw/*23.63*/(""");</script>
		<script src=""""),_display_(Seq[Any](/*24.17*/routes/*24.23*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*24.66*/(""""> </script>
	</head>
	<body>
		<!--header-->
		<div class="header">
			<div class="header-top">
				<div class="container">
					<div class="search">
						<form>
							<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*33.100*/("""{"""),format.raw/*33.101*/("""this.value = 'Search';"""),format.raw/*33.123*/("""}"""),format.raw/*33.124*/("""">
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
									<img src=""""),_display_(Seq[Any](/*48.21*/routes/*48.27*/.Assets.at("images/cart.png"))),format.raw/*48.56*/("""" alt=""/></h3>
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
						<a href="/"><img src=""""),_display_(Seq[Any](/*61.30*/routes/*61.36*/.Assets.at("images/logo.png"))),format.raw/*61.65*/("""" alt=""></a>
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
					"""),_display_(Seq[Any](/*84.7*/for(item <- items) yield /*84.25*/{_display_(Seq[Any](format.raw/*84.26*/("""
					        <script>$(document).ready(function(c) """),format.raw/*85.52*/("""{"""),format.raw/*85.53*/("""
                            $('#del"""),_display_(Seq[Any](/*86.37*/item/*86.41*/.commodityId)),format.raw/*86.53*/("""').on('click', function(c)"""),format.raw/*86.79*/("""{"""),format.raw/*86.80*/("""
	                            $('#cart-header"""),_display_(Seq[Any](/*87.46*/item/*87.50*/.commodityId)),format.raw/*87.62*/("""').fadeOut('slow', function(c)"""),format.raw/*87.92*/("""{"""),format.raw/*87.93*/("""
		                            $('#cart-header"""),_display_(Seq[Any](/*88.47*/item/*88.51*/.commodityId)),format.raw/*88.63*/("""').remove();
	                            """),format.raw/*89.30*/("""}"""),format.raw/*89.31*/(""");
                            """),format.raw/*90.29*/("""}"""),format.raw/*90.30*/(""");
                            """),format.raw/*91.29*/("""}"""),format.raw/*91.30*/(""");
					</script>
					<div class="cart-header" id="cart-header"""),_display_(Seq[Any](/*93.47*/item/*93.51*/.commodityId)),format.raw/*93.63*/("""">
						<div id="del"""),_display_(Seq[Any](/*94.20*/item/*94.24*/.commodityId)),format.raw/*94.36*/("""" class="close1"> </div>
						<div class="cart-sec simpleCart_shelfItem">
							<div class="cart-item cyc">
								<img src=""""),_display_(Seq[Any](/*97.20*/routes/*97.26*/.Assets.at("images/pic1.jpg"))),format.raw/*97.55*/("""" class="img-responsive" alt=""/>
							</div>
							<div class="cart-item-info">
								<span>数量</span>
						        <span class="total1"> x """),_display_(Seq[Any](/*101.40*/item/*101.44*/.number)),format.raw/*101.51*/("""</span>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					""")))})),format.raw/*106.7*/("""
				</div>
				<div class="col-md-3 cart-total">

					"""),_display_(Seq[Any](/*110.7*/for(commodity<-commoditys) yield /*110.33*/{_display_(Seq[Any](format.raw/*110.34*/("""
					<div class="price-details">
						<h3>价格细节</h3>
						<span>单价</span>
						<span class="total1">"""),_display_(Seq[Any](/*114.29*/commodity/*114.38*/.price)),format.raw/*114.44*/("""</span>
						<span>折扣</span>
						<span class="total1">"""),_display_(Seq[Any](/*116.29*/commodity/*116.38*/.agio)),format.raw/*116.43*/("""</span>
						<span>名称</span>
						<span class="total1">"""),_display_(Seq[Any](/*118.29*/commodity/*118.38*/.commodityName)),format.raw/*118.52*/("""</span>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
					<br><br>
					""")))})),format.raw/*123.7*/("""
					
					<ul class="total_price">
						<li class="last_price"> <h4>总计</h4></li>
						<li class="last_price"><span>"""),_display_(Seq[Any](/*127.37*/money)),format.raw/*127.42*/("""</span></li>
						<div class="clearfix"> </div>
					</ul>
					<a class="order" id="buyall" href="#">支付</a>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		
		<script>
	$(document).ready(function () """),format.raw/*137.32*/("""{"""),format.raw/*137.33*/("""
		$("#buyall").click(function () """),format.raw/*138.34*/("""{"""),format.raw/*138.35*/("""
			$.ajax("""),format.raw/*139.11*/("""{"""),format.raw/*139.12*/("""
					url:"/buy",
					type:"get",
					success:function (data) """),format.raw/*142.30*/("""{"""),format.raw/*142.31*/("""
                        alert(data);
					"""),format.raw/*144.6*/("""}"""),format.raw/*144.7*/("""
			"""),format.raw/*145.4*/("""}"""),format.raw/*145.5*/(""")
		"""),format.raw/*146.3*/("""}"""),format.raw/*146.4*/(""")

	"""),format.raw/*148.2*/("""}"""),format.raw/*148.3*/(""")
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
    
    def render(items:List[Cart],commoditys:List[Commodity],money:Double): play.api.templates.HtmlFormat.Appendable = apply(items,commoditys,money)
    
    def f:((List[Cart],List[Commodity],Double) => play.api.templates.HtmlFormat.Appendable) = (items,commoditys,money) => apply(items,commoditys,money)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 25 20:04:42 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/cart.scala.html
                    HASH: d1c0baf93ad8f9e0899f58cf0a3837bea21d4741
                    MATRIX: 800->1|955->62|1065->137|1079->143|1139->182|1307->315|1321->321|1381->360|1498->441|1513->447|1570->482|2162->1046|2191->1047|2248->1075|2278->1076|2338->1107|2368->1108|2420->1131|2450->1132|2552->1198|2567->1204|2625->1240|2751->1330|2766->1336|2823->1371|2902->1422|2931->1423|2981->1445|3010->1446|3075->1475|3090->1481|3155->1524|3456->1796|3486->1797|3537->1819|3567->1820|4003->2220|4018->2226|4069->2255|4457->2607|4472->2613|4523->2642|5187->3271|5221->3289|5260->3290|5341->3343|5370->3344|5444->3382|5457->3386|5491->3398|5545->3424|5574->3425|5657->3472|5670->3476|5704->3488|5762->3518|5791->3519|5875->3567|5888->3571|5922->3583|5993->3626|6022->3627|6082->3659|6111->3660|6171->3692|6200->3693|6302->3759|6315->3763|6349->3775|6408->3798|6421->3802|6455->3814|6623->3946|6638->3952|6689->3981|6877->4132|6891->4136|6921->4143|7047->4237|7144->4298|7187->4324|7227->4325|7372->4433|7391->4442|7420->4448|7517->4508|7536->4517|7564->4522|7661->4582|7680->4591|7717->4605|7863->4719|8024->4843|8052->4848|8310->5077|8340->5078|8404->5113|8434->5114|8475->5126|8505->5127|8601->5194|8631->5195|8704->5240|8733->5241|8766->5246|8795->5247|8828->5252|8857->5253|8891->5259|8920->5260
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|61->33|61->33|61->33|61->33|76->48|76->48|76->48|89->61|89->61|89->61|112->84|112->84|112->84|113->85|113->85|114->86|114->86|114->86|114->86|114->86|115->87|115->87|115->87|115->87|115->87|116->88|116->88|116->88|117->89|117->89|118->90|118->90|119->91|119->91|121->93|121->93|121->93|122->94|122->94|122->94|125->97|125->97|125->97|129->101|129->101|129->101|134->106|138->110|138->110|138->110|142->114|142->114|142->114|144->116|144->116|144->116|146->118|146->118|146->118|151->123|155->127|155->127|165->137|165->137|166->138|166->138|167->139|167->139|170->142|170->142|172->144|172->144|173->145|173->145|174->146|174->146|176->148|176->148
                    -- GENERATED --
                */
            