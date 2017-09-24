
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
"""),_display_(Seq[Any](/*39.2*/if(current_user=="登录")/*39.24*/{_display_(Seq[Any](format.raw/*39.25*/("""<li ><a href="/login"  >登录</a></li><li><a  href="/register"  >注册</a></li>""")))}/*39.99*/else/*39.103*/{_display_(Seq[Any](format.raw/*39.104*/("""<li ><a href="#"  >"""),_display_(Seq[Any](/*39.124*/current_user)),format.raw/*39.136*/("""</a></li>""")))})),format.raw/*39.146*/("""

						</ul>
						<div class="cart box_1">
							<a href="/checkout">
								<h3> <div class="total">购物车</div>
									<img src=""""),_display_(Seq[Any](/*45.21*/routes/*45.27*/.Assets.at("images/cart.png"))),format.raw/*45.56*/("""" alt=""/></h3>
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
						<a href="/"><img src=""""),_display_(Seq[Any](/*58.30*/routes/*58.36*/.Assets.at("images/logo.png"))),format.raw/*58.65*/("""" alt=""></a>
					</div>
					<div class=" h_menu4">
						<ul class="memenu skyblue">

							<li><a class="color4" href="/blog">帖子</a></li>
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
					"""),_display_(Seq[Any](/*79.7*/for(item <- items) yield /*79.25*/{_display_(Seq[Any](format.raw/*79.26*/("""
					        <script>$(document).ready(function(c) """),format.raw/*80.52*/("""{"""),format.raw/*80.53*/("""
                            $('#del"""),_display_(Seq[Any](/*81.37*/item/*81.41*/.commodityId)),format.raw/*81.53*/("""').on('click', function(c)"""),format.raw/*81.79*/("""{"""),format.raw/*81.80*/("""
	                            $('#cart-header"""),_display_(Seq[Any](/*82.46*/item/*82.50*/.commodityId)),format.raw/*82.62*/("""').fadeOut('slow', function(c)"""),format.raw/*82.92*/("""{"""),format.raw/*82.93*/("""
		                            $('#cart-header"""),_display_(Seq[Any](/*83.47*/item/*83.51*/.commodityId)),format.raw/*83.63*/("""').remove();
		                            $('#deldetails"""),_display_(Seq[Any](/*84.46*/item/*84.50*/.commodityId)),format.raw/*84.62*/("""').remove();
		                            			$.ajax("""),format.raw/*85.41*/("""{"""),format.raw/*85.42*/("""
					                                url:"/delcart?id="""),_display_(Seq[Any](/*86.56*/item/*86.60*/.commodityId)),format.raw/*86.72*/("""",
					                                type:"get",
					                                success:function (data) """),format.raw/*88.62*/("""{"""),format.raw/*88.63*/("""
                                                        if(data=="success")
                                                            alert("添加成功");
					                                """),format.raw/*91.38*/("""}"""),format.raw/*91.39*/("""
			                                """),format.raw/*92.36*/("""}"""),format.raw/*92.37*/(""")
	                            """),format.raw/*93.30*/("""}"""),format.raw/*93.31*/(""");
                            """),format.raw/*94.29*/("""}"""),format.raw/*94.30*/(""");
                            """),format.raw/*95.29*/("""}"""),format.raw/*95.30*/(""");
					</script>
					<div class="cart-header" id="cart-header"""),_display_(Seq[Any](/*97.47*/item/*97.51*/.commodityId)),format.raw/*97.63*/("""">
						<div id="del"""),_display_(Seq[Any](/*98.20*/item/*98.24*/.commodityId)),format.raw/*98.36*/("""" class="close1"> </div>
						<div class="cart-sec simpleCart_shelfItem">
							<div class="cart-item cyc">
								<img src=""""),_display_(Seq[Any](/*101.20*/routes/*101.26*/.Assets.at("uploads/commodity_"))),_display_(Seq[Any](/*101.59*/item/*101.63*/.commodityId)),format.raw/*101.75*/("""" class="img-responsive" alt=""/>
							</div>
							<div class="cart-item-info">
								<span>数量</span>
						        <span class="total1"> x """),_display_(Seq[Any](/*105.40*/item/*105.44*/.number)),format.raw/*105.51*/("""</span>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					""")))})),format.raw/*110.7*/("""
				</div>
				<div class="col-md-3 cart-total">

					"""),_display_(Seq[Any](/*114.7*/for(commodity<-commoditys) yield /*114.33*/{_display_(Seq[Any](format.raw/*114.34*/("""
					<div class="price-details" id="deldetails"""),_display_(Seq[Any](/*115.48*/commodity/*115.57*/.commodityId)),format.raw/*115.69*/("""">
						<h3>价格细节</h3>
						<span>单价</span>
						<span class="total1">"""),_display_(Seq[Any](/*118.29*/commodity/*118.38*/.price)),format.raw/*118.44*/("""</span>
						<span>折扣</span>
						<span class="total1">"""),_display_(Seq[Any](/*120.29*/commodity/*120.38*/.agio)),format.raw/*120.43*/("""</span>
						<span>名称</span>
						<span class="total1">"""),_display_(Seq[Any](/*122.29*/commodity/*122.38*/.commodityName)),format.raw/*122.52*/("""</span>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
					<br><br>
					""")))})),format.raw/*127.7*/("""
					
					<ul class="total_price">
						<li class="last_price"> <h4>总计</h4></li>
						<li class="last_price"><span>"""),_display_(Seq[Any](/*131.37*/money)),format.raw/*131.42*/("""</span></li>
						<div class="clearfix"> </div>
					</ul>
					<a class="order" id="buyall" href="#">支付</a>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		
		<script>
	$(document).ready(function () """),format.raw/*141.32*/("""{"""),format.raw/*141.33*/("""
		$("#buyall").click(function () """),format.raw/*142.34*/("""{"""),format.raw/*142.35*/("""
			$.ajax("""),format.raw/*143.11*/("""{"""),format.raw/*143.12*/("""
					url:"/buy",
					type:"get",
					success:function (data) """),format.raw/*146.30*/("""{"""),format.raw/*146.31*/("""
                        alert(data);
                        location.reload() 
					"""),format.raw/*149.6*/("""}"""),format.raw/*149.7*/("""
			"""),format.raw/*150.4*/("""}"""),format.raw/*150.5*/(""")
		"""),format.raw/*151.3*/("""}"""),format.raw/*151.4*/(""")

	"""),format.raw/*153.2*/("""}"""),format.raw/*153.3*/(""")
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
                    DATE: Sun Sep 24 11:41:31 HKT 2017
                    SOURCE: /root/Downloads/Amaze_Play_Framework-master/app/views/cart.scala.html
                    HASH: 3f98084aba1ae5f60d442ad916715a268bacff2d
                    MATRIX: 807->1|982->82|1092->157|1106->163|1166->202|1334->335|1348->341|1408->380|1525->461|1540->467|1597->502|2189->1066|2218->1067|2275->1095|2305->1096|2365->1127|2395->1128|2447->1151|2477->1152|2579->1218|2594->1224|2652->1260|2778->1350|2793->1356|2850->1391|2929->1442|2958->1443|3008->1465|3037->1466|3102->1495|3117->1501|3182->1544|3483->1816|3513->1817|3564->1839|3594->1840|3747->1958|3778->1980|3817->1981|3910->2055|3924->2059|3964->2060|4021->2080|4056->2092|4099->2102|4276->2243|4291->2249|4342->2278|4730->2630|4745->2636|4796->2665|5270->3104|5304->3122|5343->3123|5424->3176|5453->3177|5527->3215|5540->3219|5574->3231|5628->3257|5657->3258|5740->3305|5753->3309|5787->3321|5845->3351|5874->3352|5958->3400|5971->3404|6005->3416|6100->3475|6113->3479|6147->3491|6229->3545|6258->3546|6351->3603|6364->3607|6398->3619|6541->3734|6570->3735|6790->3927|6819->3928|6884->3965|6913->3966|6973->3998|7002->3999|7062->4031|7091->4032|7151->4064|7180->4065|7282->4131|7295->4135|7329->4147|7388->4170|7401->4174|7435->4186|7604->4318|7620->4324|7684->4357|7698->4361|7733->4373|7921->4524|7935->4528|7965->4535|8091->4629|8188->4690|8231->4716|8271->4717|8357->4766|8376->4775|8411->4787|8524->4863|8543->4872|8572->4878|8669->4938|8688->4947|8716->4952|8813->5012|8832->5021|8869->5035|9015->5149|9176->5273|9204->5278|9462->5507|9492->5508|9556->5543|9586->5544|9627->5556|9657->5557|9753->5624|9783->5625|9900->5714|9929->5715|9962->5720|9991->5721|10024->5726|10053->5727|10087->5733|10116->5734
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|61->33|61->33|61->33|61->33|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|73->45|73->45|73->45|86->58|86->58|86->58|107->79|107->79|107->79|108->80|108->80|109->81|109->81|109->81|109->81|109->81|110->82|110->82|110->82|110->82|110->82|111->83|111->83|111->83|112->84|112->84|112->84|113->85|113->85|114->86|114->86|114->86|116->88|116->88|119->91|119->91|120->92|120->92|121->93|121->93|122->94|122->94|123->95|123->95|125->97|125->97|125->97|126->98|126->98|126->98|129->101|129->101|129->101|129->101|129->101|133->105|133->105|133->105|138->110|142->114|142->114|142->114|143->115|143->115|143->115|146->118|146->118|146->118|148->120|148->120|148->120|150->122|150->122|150->122|155->127|159->131|159->131|169->141|169->141|170->142|170->142|171->143|171->143|174->146|174->146|177->149|177->149|178->150|178->150|179->151|179->151|181->153|181->153
                    -- GENERATED --
                */
            