
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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Commodity,List[Comment],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(item: Commodity,comments: List[Comment]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.43*/("""

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
						<li ><a class="lock"  href="/login"  >登录</a></li>
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
    
    def render(item:Commodity,comments:List[Comment]): play.api.templates.HtmlFormat.Appendable = apply(item,comments)
    
    def f:((Commodity,List[Comment]) => play.api.templates.HtmlFormat.Appendable) = (item,comments) => apply(item,comments)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 26 14:52:19 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/item.scala.html
                    HASH: 18e3087e703900f52acca3826827e82b528cf3bb
                    MATRIX: 790->1|925->42|1033->115|1047->121|1107->160|1271->289|1285->295|1345->334|1456->409|1471->415|1528->450|2108->1002|2137->1003|2194->1031|2224->1032|2284->1063|2314->1064|2366->1087|2396->1088|2492->1148|2507->1154|2565->1190|2689->1278|2704->1284|2761->1319|2838->1368|2867->1369|2917->1391|2946->1392|3013->1423|3028->1429|3083->1462|3146->1489|3161->1495|3226->1538|3512->1796|3542->1797|3593->1819|3623->1820|4035->2196|4050->2202|4101->2231|4482->2576|4497->2582|4548->2611|6246->4280|6276->4281|6453->4429|6483->4430|6589->4507|6619->4508|6856->4716|6886->4717|6921->4723|6951->4724|7106->4850|7136->4851|7173->4860|7202->4861|7239->4870|7268->4871|8543->6109|8559->6115|8609->6142|9053->6549|9069->6555|9119->6582|9636->7062|9652->7068|9716->7101|9730->7105|9765->7117|9870->7185|9886->7191|9955->7237|10035->7280|10051->7286|10114->7326|10264->7447|10294->7448|10355->7480|10385->7481|10472->7540|10501->7541|10533->7545|10562->7546|10736->7683|10750->7687|10787->7701|10868->7745|10882->7749|10911->7755|13113->9920|13154->9944|13194->9945|13308->10022|13324->10028|13374->10055|13493->10137|13510->10144|13538->10149|13583->10157|13600->10164|13628->10169|13957->10461|13974->10468|14005->10476|14060->10499|14229->10631|14243->10635|14278->10647|14438->10777|14469->10778|14522->10801|14553->10802|14656->10876|14686->10877|14751->10913|14781->10914|14900->11004|14930->11005|15012->11059|15041->11060|15116->11106|15146->11107|15187->11119|15217->11120|15335->11209|15365->11210|15463->11280|15492->11281|15525->11286|15554->11287|15588->11293|15617->11294|15649->11298|15678->11299|15714->11307|15743->11308|15806->11342|15836->11343|15901->11379|15931->11380|16049->11469|16079->11470|16148->11511|16177->11512|16218->11524|16248->11525|16365->11613|16395->11614|16519->11710|16548->11711|16581->11716|16610->11717|16643->11722|16672->11723|16706->11729|16735->11730
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|54->26|54->26|54->26|55->27|55->27|55->27|64->36|64->36|64->36|64->36|79->51|79->51|79->51|92->64|92->64|92->64|148->120|148->120|152->124|152->124|154->126|154->126|158->130|158->130|158->130|158->130|161->133|161->133|162->134|162->134|164->136|164->136|207->179|207->179|207->179|221->193|221->193|221->193|241->213|241->213|241->213|241->213|241->213|246->218|246->218|246->218|247->219|247->219|247->219|251->223|251->223|252->224|252->224|255->227|255->227|256->228|256->228|261->233|261->233|261->233|264->236|264->236|264->236|341->313|341->313|341->313|343->315|343->315|343->315|346->318|346->318|346->318|346->318|346->318|346->318|354->326|354->326|354->326|356->328|360->332|360->332|360->332|361->333|361->333|361->333|361->333|366->338|366->338|367->339|367->339|370->342|370->342|373->345|373->345|374->346|374->346|375->347|375->347|379->351|379->351|382->354|382->354|383->355|383->355|384->356|384->356|385->357|385->357|388->360|388->360|389->361|389->361|390->362|390->362|393->365|393->365|396->368|396->368|397->369|397->369|401->373|401->373|404->376|404->376|405->377|405->377|406->378|406->378|408->380|408->380
                    -- GENERATED --
                */
            