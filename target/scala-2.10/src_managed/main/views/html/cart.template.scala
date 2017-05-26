
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
object cart extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Cart],List[Commodity],Double,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(items: List[Cart],commoditys: List[Commodity],money: Double,current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.83*/("""

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
							<li ><a class="lock"  href="/login"  >"""),_display_(Seq[Any](/*39.47*/current_user)),format.raw/*39.59*/("""</a></li>
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
    
    def render(items:List[Cart],commoditys:List[Commodity],money:Double,current_user:String): play.api.templates.HtmlFormat.Appendable = apply(items,commoditys,money,current_user)
    
    def f:((List[Cart],List[Commodity],Double,String) => play.api.templates.HtmlFormat.Appendable) = (items,commoditys,money,current_user) => apply(items,commoditys,money,current_user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 26 15:58:01 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/cart.scala.html
                    HASH: 4e3ea142cc08a41cd1b016e4ac7d77ccbb323f28
                    MATRIX: 807->1|982->82|1092->157|1106->163|1166->202|1334->335|1348->341|1408->380|1525->461|1540->467|1597->502|2189->1066|2218->1067|2275->1095|2305->1096|2365->1127|2395->1128|2447->1151|2477->1152|2579->1218|2594->1224|2652->1260|2778->1350|2793->1356|2850->1391|2929->1442|2958->1443|3008->1465|3037->1466|3102->1495|3117->1501|3182->1544|3483->1816|3513->1817|3564->1839|3594->1840|3793->2003|3827->2015|4099->2251|4114->2257|4165->2286|4553->2638|4568->2644|4619->2673|5283->3302|5317->3320|5356->3321|5437->3374|5466->3375|5540->3413|5553->3417|5587->3429|5641->3455|5670->3456|5753->3503|5766->3507|5800->3519|5858->3549|5887->3550|5971->3598|5984->3602|6018->3614|6113->3673|6126->3677|6160->3689|6242->3743|6271->3744|6364->3801|6377->3805|6411->3817|6554->3932|6583->3933|6803->4125|6832->4126|6897->4163|6926->4164|6986->4196|7015->4197|7075->4229|7104->4230|7165->4262|7195->4263|7298->4329|7312->4333|7347->4345|7407->4368|7421->4372|7456->4384|7625->4516|7641->4522|7705->4555|7719->4559|7754->4571|7942->4722|7956->4726|7986->4733|8112->4827|8209->4888|8252->4914|8292->4915|8378->4964|8397->4973|8432->4985|8545->5061|8564->5070|8593->5076|8690->5136|8709->5145|8737->5150|8834->5210|8853->5219|8890->5233|9036->5347|9197->5471|9225->5476|9483->5705|9513->5706|9577->5741|9607->5742|9648->5754|9678->5755|9774->5822|9804->5823|9921->5912|9950->5913|9983->5918|10012->5919|10045->5924|10074->5925|10108->5931|10137->5932
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|61->33|61->33|61->33|61->33|67->39|67->39|76->48|76->48|76->48|89->61|89->61|89->61|112->84|112->84|112->84|113->85|113->85|114->86|114->86|114->86|114->86|114->86|115->87|115->87|115->87|115->87|115->87|116->88|116->88|116->88|117->89|117->89|117->89|118->90|118->90|119->91|119->91|119->91|121->93|121->93|124->96|124->96|125->97|125->97|126->98|126->98|127->99|127->99|128->100|128->100|130->102|130->102|130->102|131->103|131->103|131->103|134->106|134->106|134->106|134->106|134->106|138->110|138->110|138->110|143->115|147->119|147->119|147->119|148->120|148->120|148->120|151->123|151->123|151->123|153->125|153->125|153->125|155->127|155->127|155->127|160->132|164->136|164->136|174->146|174->146|175->147|175->147|176->148|176->148|179->151|179->151|182->154|182->154|183->155|183->155|184->156|184->156|186->158|186->158
                    -- GENERATED --
                */
            