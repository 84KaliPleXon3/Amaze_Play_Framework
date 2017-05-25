
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
<!--header-->
    <form id= "uploadForm">
      <input type="text" name="commodityName"/>
      <input type="text" name="price"/>
      <input type="text" name="agio"/>
      <input type="text" name="cType"/> 
          <p >上传文件： <input type="file" name="picture"/></ p>  
          <input type="button" value="上传" onclick="doUpload()" />  
    </form>  

<script>
        function doUpload() """),format.raw/*38.29*/("""{"""),format.raw/*38.30*/("""  
         var formData = new FormData($( "#uploadForm" )[0]);  
         $.ajax("""),format.raw/*40.17*/("""{"""),format.raw/*40.18*/("""  
              url: '/item' ,    //1为商品id,用js获取当前编辑的商品
              type: 'POST',  
              data: formData,  
              async: false,  
              cache: false,  
              contentType: false,  
              processData: false,  
              success: function (returndata) """),format.raw/*48.46*/("""{"""),format.raw/*48.47*/("""  
                  alert(returndata);  
              """),format.raw/*50.15*/("""}"""),format.raw/*50.16*/(""",  
              error: function (returndata) """),format.raw/*51.44*/("""{"""),format.raw/*51.45*/("""  
                  alert(returndata);  
              """),format.raw/*53.15*/("""}"""),format.raw/*53.16*/("""  
         """),format.raw/*54.10*/("""}"""),format.raw/*54.11*/(""");  
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""  
</script>



<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onFocus="this.value = '';" onBlur="if (this.value == '') """),format.raw/*65.99*/("""{"""),format.raw/*65.100*/("""this.value = 'Search';"""),format.raw/*65.122*/("""}"""),format.raw/*65.123*/("""">
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
							<img src=""""),_display_(Seq[Any](/*78.19*/routes/*78.25*/.Assets.at("images/cart.png"))),format.raw/*78.54*/("""" alt=""/></h3>
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
					<a href="/"><img src=""""),_display_(Seq[Any](/*91.29*/routes/*91.35*/.Assets.at("images/logo.png"))),format.raw/*91.64*/("""" alt=""></a>
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
			  <script src=""""),_display_(Seq[Any](/*110.20*/routes/*110.26*/.Assets.at("javascripts/responsiveslides.min.js"))),format.raw/*110.75*/(""""></script>
  <script>
    $(function () """),format.raw/*112.19*/("""{"""),format.raw/*112.20*/("""
      $("#slider").responsiveSlides("""),format.raw/*113.37*/("""{"""),format.raw/*113.38*/("""
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      """),format.raw/*119.7*/("""}"""),format.raw/*119.8*/(""");
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/(""");
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
		    """),_display_(Seq[Any](/*161.8*/for(line <- lines) yield /*161.26*/{_display_(Seq[Any](format.raw/*161.27*/("""
			<div class="col-md-4 grid-top">
				<a href="/item?id="""),_display_(Seq[Any](/*163.24*/line/*163.28*/.commodityId)),format.raw/*163.40*/("""" class="b-link-stripe b-animate-go  thickbox"><img style="height:250px" class="img-responsive" src=""""),_display_(Seq[Any](/*163.142*/routes/*163.148*/.Assets.at("uploads/commodity_"))),_display_(Seq[Any](/*163.181*/line/*163.185*/.commodityId)),format.raw/*163.197*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>"""),_display_(Seq[Any](/*166.18*/line/*166.22*/.commodityName)),format.raw/*166.36*/("""</span>
									</h3>
								</div>
				</a>


			<p><a href="/item?id="""),_display_(Seq[Any](/*172.26*/line/*172.30*/.commodityId)),format.raw/*172.42*/("""">"""),_display_(Seq[Any](/*172.45*/line/*172.49*/.commodityName)),format.raw/*172.63*/("""</a></p>
			</div>
			""")))})),format.raw/*174.5*/("""


					<div class="clearfix"> </div>
		</div>
	</div>
	<!----->

	<div class="content-top-bottom">
		<h2>特色商品</h2>
		<div class="col-md-6 men">
			<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*185.105*/routes/*185.111*/.Assets.at("images/t1.jpg"))),format.raw/*185.138*/("""" alt="">
				<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in   b-delay03 ">
										<span>女鞋</span>
									</h3>
								</div>
			</a>


		</div>
		<div class="col-md-6">
			<div class="col-md1 ">
				<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*197.106*/routes/*197.112*/.Assets.at("images/t2.jpg"))),format.raw/*197.139*/("""" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in1   b-delay03 ">
										<span>行李箱</span>
									</h3>
								</div>
				</a>

			</div>
			<div class="col-md2">
				<div class="col-md-6 men1">
					<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*208.107*/routes/*208.113*/.Assets.at("images/t3.jpg"))),format.raw/*208.140*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>领带</span>
									</h3>
								</div>
					</a>

				</div>
				<div class="col-md-6 men2">
					<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*218.107*/routes/*218.113*/.Assets.at("images/t4.jpg"))),format.raw/*218.140*/("""" alt="">
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
                    DATE: Thu May 25 23:23:50 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/index.scala.html
                    HASH: 42ffdcaf713d1ef0a609cd197447a0ce599d4d8e
                    MATRIX: 783->1|901->25|999->88|1013->94|1073->133|1235->260|1249->266|1309->305|1417->377|1432->383|1489->418|2063->964|2092->965|2149->993|2179->994|2239->1025|2269->1026|2321->1049|2351->1050|2444->1107|2459->1113|2517->1149|2640->1236|2655->1242|2712->1277|2788->1325|2817->1326|2867->1348|2896->1349|2958->1375|2973->1381|3038->1424|3487->1845|3516->1846|3626->1928|3655->1929|3979->2225|4008->2226|4092->2282|4121->2283|4196->2330|4225->2331|4309->2387|4338->2388|4378->2400|4407->2401|4443->2410|4471->2411|4722->2634|4752->2635|4803->2657|4833->2658|5187->2976|5202->2982|5253->3011|5609->3331|5624->3337|5675->3366|6127->3781|6143->3787|6215->3836|6285->3877|6315->3878|6381->3915|6411->3916|6555->4032|6584->4033|6619->4040|6648->4041|7306->4663|7341->4681|7381->4682|7477->4741|7491->4745|7526->4757|7666->4859|7683->4865|7748->4898|7763->4902|7799->4914|7952->5030|7966->5034|8003->5048|8114->5122|8128->5126|8163->5138|8203->5141|8217->5145|8254->5159|8309->5182|8596->5431|8613->5437|8664->5464|9034->5796|9051->5802|9102->5829|9483->6172|9500->6178|9551->6205|9910->6526|9927->6532|9978->6559
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|66->38|66->38|68->40|68->40|76->48|76->48|78->50|78->50|79->51|79->51|81->53|81->53|82->54|82->54|83->55|83->55|93->65|93->65|93->65|93->65|106->78|106->78|106->78|119->91|119->91|119->91|138->110|138->110|138->110|140->112|140->112|141->113|141->113|147->119|147->119|148->120|148->120|189->161|189->161|189->161|191->163|191->163|191->163|191->163|191->163|191->163|191->163|191->163|194->166|194->166|194->166|200->172|200->172|200->172|200->172|200->172|200->172|202->174|213->185|213->185|213->185|225->197|225->197|225->197|236->208|236->208|236->208|246->218|246->218|246->218
                    -- GENERATED --
                */
            