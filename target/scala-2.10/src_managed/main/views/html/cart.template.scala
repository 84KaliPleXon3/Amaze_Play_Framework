
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
		                            $('#deldetails"""),_display_(Seq[Any](/*89.46*/item/*89.50*/.commodityId)),format.raw/*89.62*/("""').remove();
		                            			$.ajax("""),format.raw/*90.41*/("""{"""),format.raw/*90.42*/("""
					                                url:"/delcart?id="""),_display_(Seq[Any](/*91.56*/item/*91.60*/.commodityId)),format.raw/*91.72*/("""",
					                                type:"get",
					                                success:function (data) """),format.raw/*93.62*/("""{"""),format.raw/*93.63*/("""
                                                        if(data=="success")
                                                            alert("添加成功");
					                                """),format.raw/*96.38*/("""}"""),format.raw/*96.39*/("""
			                                """),format.raw/*97.36*/("""}"""),format.raw/*97.37*/(""")
	                            """),format.raw/*98.30*/("""}"""),format.raw/*98.31*/(""");
                            """),format.raw/*99.29*/("""}"""),format.raw/*99.30*/(""");
                            """),format.raw/*100.29*/("""}"""),format.raw/*100.30*/(""");
					</script>
					<div class="cart-header" id="cart-header"""),_display_(Seq[Any](/*102.47*/item/*102.51*/.commodityId)),format.raw/*102.63*/("""">
						<div id="del"""),_display_(Seq[Any](/*103.20*/item/*103.24*/.commodityId)),format.raw/*103.36*/("""" class="close1"> </div>
						<div class="cart-sec simpleCart_shelfItem">
							<div class="cart-item cyc">
								<img src=""""),_display_(Seq[Any](/*106.20*/routes/*106.26*/.Assets.at("uploads/commodity_"))),_display_(Seq[Any](/*106.59*/item/*106.63*/.commodityId)),format.raw/*106.75*/("""" class="img-responsive" alt=""/>
							</div>
							<div class="cart-item-info">
								<span>数量</span>
						        <span class="total1"> x """),_display_(Seq[Any](/*110.40*/item/*110.44*/.number)),format.raw/*110.51*/("""</span>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					""")))})),format.raw/*115.7*/("""
				</div>
				<div class="col-md-3 cart-total">

					"""),_display_(Seq[Any](/*119.7*/for(commodity<-commoditys) yield /*119.33*/{_display_(Seq[Any](format.raw/*119.34*/("""
					<div class="price-details" id="deldetails"""),_display_(Seq[Any](/*120.48*/commodity/*120.57*/.commodityId)),format.raw/*120.69*/("""">
						<h3>价格细节</h3>
						<span>单价</span>
						<span class="total1">"""),_display_(Seq[Any](/*123.29*/commodity/*123.38*/.price)),format.raw/*123.44*/("""</span>
						<span>折扣</span>
						<span class="total1">"""),_display_(Seq[Any](/*125.29*/commodity/*125.38*/.agio)),format.raw/*125.43*/("""</span>
						<span>名称</span>
						<span class="total1">"""),_display_(Seq[Any](/*127.29*/commodity/*127.38*/.commodityName)),format.raw/*127.52*/("""</span>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
					<br><br>
					""")))})),format.raw/*132.7*/("""
					
					<ul class="total_price">
						<li class="last_price"> <h4>总计</h4></li>
						<li class="last_price"><span>"""),_display_(Seq[Any](/*136.37*/money)),format.raw/*136.42*/("""</span></li>
						<div class="clearfix"> </div>
					</ul>
					<a class="order" id="buyall" href="#">支付</a>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		
		<script>
	$(document).ready(function () """),format.raw/*146.32*/("""{"""),format.raw/*146.33*/("""
		$("#buyall").click(function () """),format.raw/*147.34*/("""{"""),format.raw/*147.35*/("""
			$.ajax("""),format.raw/*148.11*/("""{"""),format.raw/*148.12*/("""
					url:"/buy",
					type:"get",
					success:function (data) """),format.raw/*151.30*/("""{"""),format.raw/*151.31*/("""
                        alert(data);
                        location.reload() 
					"""),format.raw/*154.6*/("""}"""),format.raw/*154.7*/("""
			"""),format.raw/*155.4*/("""}"""),format.raw/*155.5*/(""")
		"""),format.raw/*156.3*/("""}"""),format.raw/*156.4*/(""")

	"""),format.raw/*158.2*/("""}"""),format.raw/*158.3*/(""")
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
                    DATE: Fri May 26 15:00:27 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/cart.scala.html
                    HASH: 5d63dfa7d3c12eb3efb33445eba5c7f45e2bdefe
                    MATRIX: 800->1|955->62|1065->137|1079->143|1139->182|1307->315|1321->321|1381->360|1498->441|1513->447|1570->482|2162->1046|2191->1047|2248->1075|2278->1076|2338->1107|2368->1108|2420->1131|2450->1132|2552->1198|2567->1204|2625->1240|2751->1330|2766->1336|2823->1371|2902->1422|2931->1423|2981->1445|3010->1446|3075->1475|3090->1481|3155->1524|3456->1796|3486->1797|3537->1819|3567->1820|4003->2220|4018->2226|4069->2255|4457->2607|4472->2613|4523->2642|5187->3271|5221->3289|5260->3290|5341->3343|5370->3344|5444->3382|5457->3386|5491->3398|5545->3424|5574->3425|5657->3472|5670->3476|5704->3488|5762->3518|5791->3519|5875->3567|5888->3571|5922->3583|6017->3642|6030->3646|6064->3658|6146->3712|6175->3713|6268->3770|6281->3774|6315->3786|6458->3901|6487->3902|6707->4094|6736->4095|6801->4132|6830->4133|6890->4165|6919->4166|6979->4198|7008->4199|7069->4231|7099->4232|7202->4298|7216->4302|7251->4314|7311->4337|7325->4341|7360->4353|7529->4485|7545->4491|7609->4524|7623->4528|7658->4540|7846->4691|7860->4695|7890->4702|8016->4796|8113->4857|8156->4883|8196->4884|8282->4933|8301->4942|8336->4954|8449->5030|8468->5039|8497->5045|8594->5105|8613->5114|8641->5119|8738->5179|8757->5188|8794->5202|8940->5316|9101->5440|9129->5445|9387->5674|9417->5675|9481->5710|9511->5711|9552->5723|9582->5724|9678->5791|9708->5792|9825->5881|9854->5882|9887->5887|9916->5888|9949->5893|9978->5894|10012->5900|10041->5901
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|61->33|61->33|61->33|61->33|76->48|76->48|76->48|89->61|89->61|89->61|112->84|112->84|112->84|113->85|113->85|114->86|114->86|114->86|114->86|114->86|115->87|115->87|115->87|115->87|115->87|116->88|116->88|116->88|117->89|117->89|117->89|118->90|118->90|119->91|119->91|119->91|121->93|121->93|124->96|124->96|125->97|125->97|126->98|126->98|127->99|127->99|128->100|128->100|130->102|130->102|130->102|131->103|131->103|131->103|134->106|134->106|134->106|134->106|134->106|138->110|138->110|138->110|143->115|147->119|147->119|147->119|148->120|148->120|148->120|151->123|151->123|151->123|153->125|153->125|153->125|155->127|155->127|155->127|160->132|164->136|164->136|174->146|174->146|175->147|175->147|176->148|176->148|179->151|179->151|182->154|182->154|183->155|183->155|184->156|184->156|186->158|186->158
                    -- GENERATED --
                */
            