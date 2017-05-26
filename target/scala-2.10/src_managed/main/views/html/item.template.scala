
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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Commodity,List[Comment],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(item: Commodity,comments: List[Comment],current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.63*/("""

<!DOCTYPE html>
<html>
<head>
<title>Signle</title>
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


<script src=""""),_display_(Seq[Any](/*26.15*/routes/*26.21*/.Assets.at("javascripts/main.js"))),format.raw/*26.54*/(""""></script>
<script src=""""),_display_(Seq[Any](/*27.15*/routes/*27.21*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*27.64*/(""""> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*36.99*/("""{"""),format.raw/*36.100*/("""this.value = 'Search';"""),format.raw/*36.122*/("""}"""),format.raw/*36.123*/("""">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">
					<ul>
						<li ><a class="lock"  href="/login"  >"""),_display_(Seq[Any](/*42.46*/current_user)),format.raw/*42.58*/("""</a></li>
						<li><a class="lock" href="/register"  >注册</a></li>
						<li>
</li>

					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*51.19*/routes/*51.25*/.Assets.at("images/cart.png"))),format.raw/*51.54*/("""" alt=""/></h3>
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
					<a href="index.html"><img src=""""),_display_(Seq[Any](/*64.38*/routes/*64.44*/.Assets.at("images/logo.png"))),format.raw/*64.73*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
					<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="/">主页</a></li>
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


<!--content-->
<!---->
		<div class="product">
			<div class="container">
				<div class="col-md-3 product-price">

				<div class=" rsidebar span_1_of_left">
					<div class="of-left">
						<h3 class="cate">种类</h3>
					</div>
		 <ul class="menu">
		<li class="item1"><a href="#">男 </a>
			<ul class="cute">
				<li class="subitem1"><a href="#">Cute Kittens </a></li>
				<li class="subitem2"><a href="#">Strange Stuff </a></li>
				<li class="subitem3"><a href="#">Automatic Fails </a></li>
			</ul>
		</li>
		<li class="item2"><a href="#">女 </a>
			<ul class="cute">
				<li class="subitem1"><a href="#">Cute Kittens </a></li>
				<li class="subitem2"><a href="#">Strange Stuff </a></li>
				<li class="subitem3"><a href="#">Automatic Fails </a></li>
			</ul>
		</li>
		<li class="item3"><a href="#">儿童</a>
			<ul class="cute">
				<li class="subitem1"><a href="#">Cute Kittens </a></li>
				<li class="subitem2"><a href="#">Strange Stuff </a></li>
				<li class="subitem3"><a href="#">Automatic Fails</a></li>
			</ul>
		</li>

	</ul>
					</div>
				<!--initiate accordion-->
		<script type="text/javascript">
			$(function() """),format.raw/*120.17*/("""{"""),format.raw/*120.18*/("""
			    var menu_ul = $('.menu > li > ul'),
			           menu_a  = $('.menu > li > a');
			    menu_ul.hide();
			    menu_a.click(function(e) """),format.raw/*124.33*/("""{"""),format.raw/*124.34*/("""
			        e.preventDefault();
			        if(!$(this).hasClass('active')) """),format.raw/*126.44*/("""{"""),format.raw/*126.45*/("""
			            menu_a.removeClass('active');
			            menu_ul.filter(':visible').slideUp('normal');
			            $(this).addClass('active').next().stop(true,true).slideDown('normal');
			        """),format.raw/*130.12*/("""}"""),format.raw/*130.13*/(""" else """),format.raw/*130.19*/("""{"""),format.raw/*130.20*/("""
			            $(this).removeClass('active');
			            $(this).next().stop(true,true).slideUp('normal');
			        """),format.raw/*133.12*/("""}"""),format.raw/*133.13*/("""
			    """),format.raw/*134.8*/("""}"""),format.raw/*134.9*/(""");

			"""),format.raw/*136.4*/("""}"""),format.raw/*136.5*/(""");
		</script>
<!---->
	<div class="product-middle">

					<div class="fit-top">
						<h6 class="shop-top">Lorem Ipsum</h6>
						<a href="#" class="shop-now">SHOP NOW</a>
<div class="clearfix"> </div>
	</div>
				</div>
						<div class="sellers">
							<div class="of-left-in">
								<h3 class="tag">标签</h3>
							</div>
								<div class="tags">
									<ul>
										<li><a href="#">design</a></li>
										<li><a href="#">fashion</a></li>
										<li><a href="#">lorem</a></li>
										<li><a href="#">dress</a></li>
										<li><a href="#">fashion</a></li>
										<li><a href="#">dress</a></li>
										<li><a href="#">design</a></li>
										<li><a href="#">dress</a></li>
										<li><a href="#">design</a></li>
										<li><a href="#">fashion</a></li>
										<li><a href="#">lorem</a></li>
										<li><a href="#">dress</a></li>

										<div class="clearfix"> </div>
									</ul>

								</div>

		</div>
				<!---->
				<div class="product-bottom">
					<div class="of-left-in">
								<h3 class="best">热卖商品</h3>
							</div>
					<div class="product-go">
						<div class=" fashion-grid">
									<a href="#"><img class="img-responsive" src=""""),_display_(Seq[Any](/*179.56*/routes/*179.62*/.Assets.at("images/p1.jpg"))),format.raw/*179.89*/("""" alt=""></a>

								</div>
							<div class=" fashion-grid1">
								<h6 class="best2"><a href="#" >Lorem ipsum dolor sit
amet consectetuer  </a></h6>

								<span class=" price-in1"> $40.00</span>
							</div>

							<div class="clearfix"> </div>
							</div>
							<div class="product-go">
						<div class=" fashion-grid">
									<a href="#"><img class="img-responsive " src=""""),_display_(Seq[Any](/*193.57*/routes/*193.63*/.Assets.at("images/p2.jpg"))),format.raw/*193.90*/("""" alt=""></a>

								</div>
							<div class="fashion-grid1">
								<h6 class="best2"><a href="#" >Lorem ipsum dolor sit
amet consectetuer </a></h6>

								<span class=" price-in1"> $40.00</span>
							</div>

							<div class="clearfix"> </div>
							</div>

				</div>

				</div>
				<div class="col-md-9 product-price1">
				<div class="col-md-5 single-top">
			<div class="flexslider">
  <ul class="slides">
      <img style="width:320px" src=""""),_display_(Seq[Any](/*213.38*/routes/*213.44*/.Assets.at("uploads/commodity_"))),_display_(Seq[Any](/*213.77*/item/*213.81*/.commodityId)),format.raw/*213.93*/("""" />

  </ul>
</div>
<!-- FlexSlider -->
  <script defer src=""""),_display_(Seq[Any](/*218.23*/routes/*218.29*/.Assets.at("javascripts/jquery.flexslider.js"))),format.raw/*218.75*/(""""></script>
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*219.31*/routes/*219.37*/.Assets.at("stylesheets/flexslider.css"))),format.raw/*219.77*/("""" type="text/css" media="screen" />

<script>
// Can also be used with $(document).ready()
$(window).load(function() """),format.raw/*223.27*/("""{"""),format.raw/*223.28*/("""
  $('.flexslider').flexslider("""),format.raw/*224.31*/("""{"""),format.raw/*224.32*/("""
    animation: "slide",
    controlNav: "thumbnails"
  """),format.raw/*227.3*/("""}"""),format.raw/*227.4*/(""");
"""),format.raw/*228.1*/("""}"""),format.raw/*228.2*/(""");
</script>
					</div>
					<div class="col-md-7 single-top-in simpleCart_shelfItem">
						<div class="single-para ">
						<h4>"""),_display_(Seq[Any](/*233.12*/item/*233.16*/.commodityName)),format.raw/*233.30*/("""</h4>


							<h5 class="item_price">$ """),_display_(Seq[Any](/*236.34*/item/*236.38*/.price)),format.raw/*236.44*/("""</h5>
							<p>评论</p>
							<div class="available">
								<ul>
									<li>Color
										<select>
										<option>Silver</option>
										<option>Black</option>
										<option>Dark Black</option>
										<option>Red</option>
									</select></li>
								<li class="size-in">Size<select>
									<option>Large</option>
									<option>Medium</option>
									<option>small</option>
									<option>Large</option>
									<option>small</option>
								</select></li>
								<div class="clearfix"> </div>
							</ul>
						</div>
							<ul class="tag-men">
								<li><span>TAG</span>
								<span class="women1">: Women,</span></li>
								<li><span>SKU</span>
								<span class="women1">: CK09</span></li>
							</ul>

							数量：<input id="number" type="text" value="1">
								<a id="addcart" href="#" class="add-cart item_add">加入购物车</a>

						</div>
					</div>
				<div class="clearfix"> </div>
			<!---->
					<div class="cd-tabs">
			<nav>
				<ul class="cd-tabs-navigation">
					<li><a data-content="fashion"  href="#0">商品描述 </a></li>
					<li><a data-content="cinema" href="#0" >更多信息</a></li>
					<li><a data-content="television" href="#0" class="selected ">评论 (1)</a></li>

				</ul>
			</nav>
	<ul class="cd-tabs-content">
		<li data-content="fashion" >
		<div class="facts">
									  <p > fwer4jgfireik</p>
										<ul>
											<li>Research</li>
											<li>Design and Development</li>
											<li>Porting and Optimization</li>
											<li>System integration</li>
											<li>Verification, Validation and Testing</li>
											<li>Maintenance and Support</li>
										</ul>
							        </div>

</li>
<li data-content="cinema" >
		<div class="facts1">

						<div class="color"><p>Color</p>
							<span >Blue, Black, Red</span>
							<div class="clearfix"></div>
						</div>
						<div class="color">
							<p>Size</p>
							<span >S, M, L, XL</span>
							<div class="clearfix"></div>
						</div>

			 </div>

</li>
<li data-content="television" class="selected">
	<div class="comments-top-top">
	    		    """),_display_(Seq[Any](/*313.13*/for(comment <- comments) yield /*313.37*/{_display_(Seq[Any](format.raw/*313.38*/("""
				<div class="top-comment-left">
					<img class="img-responsive" src=""""),_display_(Seq[Any](/*315.40*/routes/*315.46*/.Assets.at("images/co.png"))),format.raw/*315.73*/("""" alt="">
				</div>
				<div class="top-comment-right">
					<h6><a href="#">"""),_display_(Seq[Any](/*318.23*/comment/*318.30*/.user)),format.raw/*318.35*/("""</a> - """),_display_(Seq[Any](/*318.43*/comment/*318.50*/.time)),format.raw/*318.55*/("""</h6>
					<ul class="star-footer">
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
									</ul>
									<p>"""),_display_(Seq[Any](/*326.14*/comment/*326.21*/.content)),format.raw/*326.29*/("""</p>
				</div>
				""")))})),format.raw/*328.6*/("""
				<a id="disscus" class="add-re" href="#">添加评论</a>
			</div>
<form>
    <input type="hidden" id="title" name="title" value=""""),_display_(Seq[Any](/*332.58*/item/*332.62*/.commodityId)),format.raw/*332.74*/("""">
    <textarea cols="77" rows="6" value=" " id="content" name="content" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*333.127*/("""{"""),format.raw/*333.128*/("""this.value = 'Discuss';"""),format.raw/*333.151*/("""}"""),format.raw/*333.152*/(""""></textarea>
</form>
</li>

<script>
	$(document).ready(function () """),format.raw/*338.32*/("""{"""),format.raw/*338.33*/("""
		$("#disscus").click(function () """),format.raw/*339.35*/("""{"""),format.raw/*339.36*/("""
			var title = $("#title").val();
			var content = $("#content").val();
			var data = """),format.raw/*342.15*/("""{"""),format.raw/*342.16*/("""
				"commodityId":title,
				"content":content
			"""),format.raw/*345.4*/("""}"""),format.raw/*345.5*/("""
			if(content != "Discuss" && content != "")"""),format.raw/*346.45*/("""{"""),format.raw/*346.46*/("""
			$.ajax("""),format.raw/*347.11*/("""{"""),format.raw/*347.12*/("""
					url:"/discuss",
					type:"post",
					data:data,
					success:function (data) """),format.raw/*351.30*/("""{"""),format.raw/*351.31*/("""
					    if(data=="success")
					        location.reload() 
					"""),format.raw/*354.6*/("""}"""),format.raw/*354.7*/("""
			"""),format.raw/*355.4*/("""}"""),format.raw/*355.5*/(""")
			"""),format.raw/*356.4*/("""}"""),format.raw/*356.5*/("""
		"""),format.raw/*357.3*/("""}"""),format.raw/*357.4*/(""")


	"""),format.raw/*360.2*/("""}"""),format.raw/*360.3*/(""")
	$(document).ready(function () """),format.raw/*361.32*/("""{"""),format.raw/*361.33*/("""
		$("#addcart").click(function () """),format.raw/*362.35*/("""{"""),format.raw/*362.36*/("""
			var title = $("#title").val();
			var content = $("#number").val();
			var data = """),format.raw/*365.15*/("""{"""),format.raw/*365.16*/("""
				"id":title,
				"num":content
			"""),format.raw/*368.4*/("""}"""),format.raw/*368.5*/("""
			$.ajax("""),format.raw/*369.11*/("""{"""),format.raw/*369.12*/("""
					url:"/addcart",
					type:"get",
					data:data,
					success:function (data) """),format.raw/*373.30*/("""{"""),format.raw/*373.31*/("""
                        if(data=="success")
                            alert("添加成功");
					"""),format.raw/*376.6*/("""}"""),format.raw/*376.7*/("""
			"""),format.raw/*377.4*/("""}"""),format.raw/*377.5*/(""")
		"""),format.raw/*378.3*/("""}"""),format.raw/*378.4*/(""")

	"""),format.raw/*380.2*/("""}"""),format.raw/*380.3*/(""")
</script>
				

<div class="clearfix"></div>
	</ul>
</div>

</div>

		</div>
		</div>
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
    
    def render(item:Commodity,comments:List[Comment],current_user:String): play.api.templates.HtmlFormat.Appendable = apply(item,comments,current_user)
    
    def f:((Commodity,List[Comment],String) => play.api.templates.HtmlFormat.Appendable) = (item,comments,current_user) => apply(item,comments,current_user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 26 15:57:25 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/item.scala.html
                    HASH: 243d85bb7a9308f1530d9e9891fc7d5f8d9d3414
                    MATRIX: 797->1|952->62|1060->135|1074->141|1134->180|1298->309|1312->315|1372->354|1483->429|1498->435|1555->470|2135->1022|2164->1023|2221->1051|2251->1052|2311->1083|2341->1084|2393->1107|2423->1108|2519->1168|2534->1174|2592->1210|2716->1298|2731->1304|2788->1339|2865->1388|2894->1389|2944->1411|2973->1412|3040->1443|3055->1449|3110->1482|3173->1509|3188->1515|3253->1558|3539->1816|3569->1817|3620->1839|3650->1840|3841->1995|3875->2007|4131->2227|4146->2233|4197->2262|4578->2607|4593->2613|4644->2642|6342->4311|6372->4312|6549->4460|6579->4461|6685->4538|6715->4539|6952->4747|6982->4748|7017->4754|7047->4755|7202->4881|7232->4882|7269->4891|7298->4892|7335->4901|7364->4902|8639->6140|8655->6146|8705->6173|9149->6580|9165->6586|9215->6613|9732->7093|9748->7099|9812->7132|9826->7136|9861->7148|9966->7216|9982->7222|10051->7268|10131->7311|10147->7317|10210->7357|10360->7478|10390->7479|10451->7511|10481->7512|10568->7571|10597->7572|10629->7576|10658->7577|10832->7714|10846->7718|10883->7732|10964->7776|10978->7780|11007->7786|13209->9951|13250->9975|13290->9976|13404->10053|13420->10059|13470->10086|13589->10168|13606->10175|13634->10180|13679->10188|13696->10195|13724->10200|14053->10492|14070->10499|14101->10507|14156->10530|14325->10662|14339->10666|14374->10678|14534->10808|14565->10809|14618->10832|14649->10833|14752->10907|14782->10908|14847->10944|14877->10945|14996->11035|15026->11036|15108->11090|15137->11091|15212->11137|15242->11138|15283->11150|15313->11151|15431->11240|15461->11241|15559->11311|15588->11312|15621->11317|15650->11318|15684->11324|15713->11325|15745->11329|15774->11330|15810->11338|15839->11339|15902->11373|15932->11374|15997->11410|16027->11411|16145->11500|16175->11501|16244->11542|16273->11543|16314->11555|16344->11556|16461->11644|16491->11645|16615->11741|16644->11742|16677->11747|16706->11748|16739->11753|16768->11754|16802->11760|16831->11761
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|54->26|54->26|54->26|55->27|55->27|55->27|64->36|64->36|64->36|64->36|70->42|70->42|79->51|79->51|79->51|92->64|92->64|92->64|148->120|148->120|152->124|152->124|154->126|154->126|158->130|158->130|158->130|158->130|161->133|161->133|162->134|162->134|164->136|164->136|207->179|207->179|207->179|221->193|221->193|221->193|241->213|241->213|241->213|241->213|241->213|246->218|246->218|246->218|247->219|247->219|247->219|251->223|251->223|252->224|252->224|255->227|255->227|256->228|256->228|261->233|261->233|261->233|264->236|264->236|264->236|341->313|341->313|341->313|343->315|343->315|343->315|346->318|346->318|346->318|346->318|346->318|346->318|354->326|354->326|354->326|356->328|360->332|360->332|360->332|361->333|361->333|361->333|361->333|366->338|366->338|367->339|367->339|370->342|370->342|373->345|373->345|374->346|374->346|375->347|375->347|379->351|379->351|382->354|382->354|383->355|383->355|384->356|384->356|385->357|385->357|388->360|388->360|389->361|389->361|390->362|390->362|393->365|393->365|396->368|396->368|397->369|397->369|401->373|401->373|404->376|404->376|405->377|405->377|406->378|406->378|408->380|408->380
                    -- GENERATED --
                */
            