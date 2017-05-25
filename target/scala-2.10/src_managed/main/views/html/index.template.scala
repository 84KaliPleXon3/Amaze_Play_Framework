
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Commodity],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(lines: List[Commodity]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""

<!DOCTYPE html>
<html>
<head>
<title>首页</title>
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
<script src=""""),_display_(Seq[Any](/*24.15*/routes/*24.21*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*24.64*/(""""> </script>
</head>
<body>

    <form id= "uploadForm">
          <p >上传文件： <input type="file" name="picture"/></ p>  
          <input type="button" value="上传" onclick="doUpload()" />  
    </form>  

<script>
        function doUpload() """),format.raw/*34.29*/("""{"""),format.raw/*34.30*/("""  
         var formData = new FormData($( "#uploadForm" )[0]);  
         $.ajax("""),format.raw/*36.17*/("""{"""),format.raw/*36.18*/("""  
              url: '/upload/1' ,  
              type: 'POST',  
              data: formData,  
              async: false,  
              cache: false,  
              contentType: false,  
              processData: false,  
              success: function (returndata) """),format.raw/*44.46*/("""{"""),format.raw/*44.47*/("""  
                  alert(returndata);  
              """),format.raw/*46.15*/("""}"""),format.raw/*46.16*/(""",  
              error: function (returndata) """),format.raw/*47.44*/("""{"""),format.raw/*47.45*/("""  
                  alert(returndata);  
              """),format.raw/*49.15*/("""}"""),format.raw/*49.16*/("""  
         """),format.raw/*50.10*/("""}"""),format.raw/*50.11*/(""");  
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/("""  
</script>

<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onFocus="this.value = '';" onBlur="if (this.value == '') """),format.raw/*60.99*/("""{"""),format.raw/*60.100*/("""this.value = 'Search';"""),format.raw/*60.122*/("""}"""),format.raw/*60.123*/("""">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">
					<ul>
						<li ><a href="/login"  >登录</a></li>
						<li><a  href="/register"  >注册</a></li>

					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*73.19*/routes/*73.25*/.Assets.at("images/cart.png"))),format.raw/*73.54*/("""" alt=""/></h3>
						</a>
						<!-- <p><a href="javascript:;" class="simpleCart_empty">清空购物车</a></p> -->

					</div>
					<div class="clearfix"> </div>
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<a href="/"><img src=""""),_display_(Seq[Any](/*86.29*/routes/*86.35*/.Assets.at("images/logo.png"))),format.raw/*86.64*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					<li class="active grid"><a class="color8" href="/">主页</a></li>

				  <li><a class="color4" href="/blog">帖子</a></li>
				  <li><a class="color6" href="/contact">个人中心</a></li>
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>

	<div class="banner">
		<div class="container">
			  <script src=""""),_display_(Seq[Any](/*105.20*/routes/*105.26*/.Assets.at("javascripts/responsiveslides.min.js"))),format.raw/*105.75*/(""""></script>
  <script>
    $(function () """),format.raw/*107.19*/("""{"""),format.raw/*107.20*/("""
      $("#slider").responsiveSlides("""),format.raw/*108.37*/("""{"""),format.raw/*108.38*/("""
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      """),format.raw/*114.7*/("""}"""),format.raw/*114.8*/(""");
    """),format.raw/*115.5*/("""}"""),format.raw/*115.6*/(""");
  </script>
			<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
			    <li>

						<div class="banner-text">
							<h3>华伦天奴西服 </h3>
						<p>时间成就经典，岁月铸造永恒</p>

						</div>

				</li>
				<li>

						<div class="banner-text">
							<h3>爱登堡服装 </h3>
						<p>男人简单就好！</p>


						</div>

				</li>
				<li>
						<div class="banner-text">
							<h3>雪梦莱牌服装</h3>
						<p>潇潇洒洒雪梦莱，“一年半载”有风采！</p>
						</div>

				</li>
			</ul>
		</div>

	</div>
	</div>
<!--content-->
<div class="content">
	<div class="container">
	<div class="content-top">
		<h1>新品发布</h1>
		<div class="grid-in">
		    """),_display_(Seq[Any](/*156.8*/for(line <- lines) yield /*156.26*/{_display_(Seq[Any](format.raw/*156.27*/("""
			<div class="col-md-4 grid-top">
				<a href="/item?id="""),_display_(Seq[Any](/*158.24*/line/*158.28*/.commodityId)),format.raw/*158.40*/("""" class="b-link-stripe b-animate-go  thickbox"><img style="height:250px" class="img-responsive" src=""""),_display_(Seq[Any](/*158.142*/line/*158.146*/.picture)),format.raw/*158.154*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>"""),_display_(Seq[Any](/*161.18*/line/*161.22*/.commodityName)),format.raw/*161.36*/("""</span>
									</h3>
								</div>
				</a>


			<p><a href="/item?id="""),_display_(Seq[Any](/*167.26*/line/*167.30*/.commodityId)),format.raw/*167.42*/("""">"""),_display_(Seq[Any](/*167.45*/line/*167.49*/.commodityName)),format.raw/*167.63*/("""</a></p>
			</div>
			""")))})),format.raw/*169.5*/("""


					<div class="clearfix"> </div>
		</div>
	</div>
	<!----->

	<div class="content-top-bottom">
		<h2>特色商品</h2>
		<div class="col-md-6 men">
			<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*180.105*/routes/*180.111*/.Assets.at("images/t1.jpg"))),format.raw/*180.138*/("""" alt="">
				<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in   b-delay03 ">
										<span>女鞋</span>
									</h3>
								</div>
			</a>


		</div>
		<div class="col-md-6">
			<div class="col-md1 ">
				<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*192.106*/routes/*192.112*/.Assets.at("images/t2.jpg"))),format.raw/*192.139*/("""" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in1   b-delay03 ">
										<span>行李箱</span>
									</h3>
								</div>
				</a>

			</div>
			<div class="col-md2">
				<div class="col-md-6 men1">
					<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*203.107*/routes/*203.113*/.Assets.at("images/t3.jpg"))),format.raw/*203.140*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>领带</span>
									</h3>
								</div>
					</a>

				</div>
				<div class="col-md-6 men2">
					<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*213.107*/routes/*213.113*/.Assets.at("images/t4.jpg"))),format.raw/*213.140*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>男鞋</span>
									</h3>
								</div>
					</a>

				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div>
	</div>
</div>
<div class="footer" style="margin-top:40px;">
		<div class="footer-class">
		<p >Copyright &copy; 2017</p>
		</div>
</div>
</body>
</html>
"""))}
    }
    
    def render(lines:List[Commodity]): play.api.templates.HtmlFormat.Appendable = apply(lines)
    
    def f:((List[Commodity]) => play.api.templates.HtmlFormat.Appendable) = (lines) => apply(lines)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 25 22:13:58 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/index.scala.html
                    HASH: 59af0ac301f4d1b9fa5ef5992c921934d9a7ff2b
                    MATRIX: 783->1|901->25|999->88|1013->94|1073->133|1235->260|1249->266|1309->305|1417->377|1432->383|1489->418|2063->964|2092->965|2149->993|2179->994|2239->1025|2269->1026|2321->1049|2351->1050|2444->1107|2459->1113|2517->1149|2640->1236|2655->1242|2712->1277|2788->1325|2817->1326|2867->1348|2896->1349|2958->1375|2973->1381|3038->1424|3306->1664|3335->1665|3445->1747|3474->1748|3779->2025|3808->2026|3892->2082|3921->2083|3996->2130|4025->2131|4109->2187|4138->2188|4178->2200|4207->2201|4243->2210|4271->2211|4534->2446|4564->2447|4615->2469|4645->2470|4999->2788|5014->2794|5065->2823|5421->3143|5436->3149|5487->3178|5939->3593|5955->3599|6027->3648|6097->3689|6127->3690|6193->3727|6223->3728|6367->3844|6396->3845|6431->3852|6460->3853|7118->4475|7153->4493|7193->4494|7289->4553|7303->4557|7338->4569|7478->4671|7493->4675|7525->4683|7678->4799|7692->4803|7729->4817|7840->4891|7854->4895|7889->4907|7929->4910|7943->4914|7980->4928|8035->4951|8322->5200|8339->5206|8390->5233|8760->5565|8777->5571|8828->5598|9209->5941|9226->5947|9277->5974|9636->6295|9653->6301|9704->6328
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|62->34|62->34|64->36|64->36|72->44|72->44|74->46|74->46|75->47|75->47|77->49|77->49|78->50|78->50|79->51|79->51|88->60|88->60|88->60|88->60|101->73|101->73|101->73|114->86|114->86|114->86|133->105|133->105|133->105|135->107|135->107|136->108|136->108|142->114|142->114|143->115|143->115|184->156|184->156|184->156|186->158|186->158|186->158|186->158|186->158|186->158|189->161|189->161|189->161|195->167|195->167|195->167|195->167|195->167|195->167|197->169|208->180|208->180|208->180|220->192|220->192|220->192|231->203|231->203|231->203|241->213|241->213|241->213
                    -- GENERATED --
                */
            