
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
object contact extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Contact</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*16.78*/("""{"""),format.raw/*16.79*/(""" setTimeout(hideURLbar, 0); """),format.raw/*16.107*/("""}"""),format.raw/*16.108*/(""", false); function hideURLbar()"""),format.raw/*16.139*/("""{"""),format.raw/*16.140*/(""" window.scrollTo(0,1); """),format.raw/*16.163*/("""}"""),format.raw/*16.164*/(""" </script>
<!--fonts-->
<!-- start menu -->
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function()"""),format.raw/*21.37*/("""{"""),format.raw/*21.38*/("""$(".memenu").memenu();"""),format.raw/*21.60*/("""}"""),format.raw/*21.61*/(""");</script>
<script src="js/simpleCart.min.js"> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<!-- <form>
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*31.99*/("""{"""),format.raw/*31.100*/("""this.value = 'Search';"""),format.raw/*31.122*/("""}"""),format.raw/*31.123*/("""">
						<input type="submit" value="Go">
					</form> -->
			</div>
			<div class="header-left">
					<ul>
						<li ><a class="lock"  href="login.html"  >Login</a></li>
						<li><a class="lock" href="register.html"  >Register</a></li>
						<li>
</li>

					</ul>
					<div class="cart box_1">
						<a href="checkout.html">
						<h3> <div class="total">
							<span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> items)</div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
												<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<a href="index.html"><img src="images/logo.png" alt=""></a>
				</div>
		  <div class=" h_menu4">
					<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="index.html">Home</a></li>
				      <li><a class="color1" href="#">Shop</a>
				      	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.html">Accessories</a></li>
										<li><a href="products.html">Bags</a></li>
										<li><a href="products.html">Caps & Hats</a></li>
										<li><a href="products.html">Hoodies & Sweatshirts</a></li>
										<li><a href="products.html">Jackets & Coats</a></li>
										<li><a href="products.html">Jeans</a></li>
										<li><a href="products.html">Jewellery</a></li>
										<li><a href="products.html">Jumpers & Cardigans</a></li>
										<li><a href="products.html">Leather Jackets</a></li>
										<li><a href="products.html">Long Sleeve T-Shirts</a></li>
										<li><a href="products.html">Loungewear</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.html">Shirts</a></li>
										<li><a href="products.html">Shoes, Boots & Trainers</a></li>
										<li><a href="products.html">Shorts</a></li>
										<li><a href="products.html">Suits & Blazers</a></li>
										<li><a href="products.html">Sunglasses</a></li>
										<li><a href="products.html">Sweatpants</a></li>
										<li><a href="products.html">Swimwear</a></li>
										<li><a href="products.html">Trousers & Chinos</a></li>
										<li><a href="products.html">T-Shirts</a></li>
										<li><a href="products.html">Underwear & Socks</a></li>
										<li><a href="products.html">Vests</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="products.html">Levis</a></li>
										<li><a href="products.html">Persol</a></li>
										<li><a href="products.html">Nike</a></li>
										<li><a href="products.html">Edwin</a></li>
										<li><a href="products.html">New Balance</a></li>
										<li><a href="products.html">Jack & Jones</a></li>
										<li><a href="products.html">Paul Smith</a></li>
										<li><a href="products.html">Ray-Ban</a></li>
										<li><a href="products.html">Wood Wood</a></li>
									</ul>
								</div>
							</div>
						  </div>
						</div>
					</li>
				    <li class="grid"><a class="color2" href="#">	Lookbook</a>
					  	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.html">Accessories</a></li>
										<li><a href="products.html">Bags</a></li>
										<li><a href="products.html">Caps & Hats</a></li>
										<li><a href="products.html">Hoodies & Sweatshirts</a></li>
										<li><a href="products.html">Jackets & Coats</a></li>
										<li><a href="products.html">Jeans</a></li>
										<li><a href="products.html">Jewellery</a></li>
										<li><a href="products.html">Jumpers & Cardigans</a></li>
										<li><a href="products.html">Leather Jackets</a></li>
										<li><a href="products.html">Long Sleeve T-Shirts</a></li>
										<li><a href="products.html">Loungewear</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="products.html">Shirts</a></li>
										<li><a href="products.html">Shoes, Boots & Trainers</a></li>
										<li><a href="products.html">Shorts</a></li>
										<li><a href="products.html">Suits & Blazers</a></li>
										<li><a href="products.html">Sunglasses</a></li>
										<li><a href="products.html">Sweatpants</a></li>
										<li><a href="products.html">Swimwear</a></li>
										<li><a href="products.html">Trousers & Chinos</a></li>
										<li><a href="products.html">T-Shirts</a></li>
										<li><a href="products.html">Underwear & Socks</a></li>
										<li><a href="products.html">Vests</a></li>
									</ul>
								</div>
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="products.html">Levis</a></li>
										<li><a href="products.html">Persol</a></li>
										<li><a href="products.html">Nike</a></li>
										<li><a href="products.html">Edwin</a></li>
										<li><a href="products.html">New Balance</a></li>
										<li><a href="products.html">Jack & Jones</a></li>
										<li><a href="products.html">Paul Smith</a></li>
										<li><a href="products.html">Ray-Ban</a></li>
										<li><a href="products.html">Wood Wood</a></li>
									</ul>
								</div>
							</div>
						  </div>
						</div>
			    </li>
				<li><a class="color4" href="blog.html">Blog</a></li>
				<li><a class="color6" href="contact.html">Conact</a></li>
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>


<!--content-->
<div class="contact">

			<div class="container">
				<h1>Contact</h1>
			<div class="contact-form">

				<div class="col-md-8 contact-grid">
					<form>
						<input type="text" value="Name" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*198.94*/("""{"""),format.raw/*198.95*/("""this.value ='Name';"""),format.raw/*198.114*/("""}"""),format.raw/*198.115*/("""">

						<input type="text" value="Email" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*200.95*/("""{"""),format.raw/*200.96*/("""this.value ='Email';"""),format.raw/*200.116*/("""}"""),format.raw/*200.117*/("""">
						<input type="text" value="Subject" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*201.97*/("""{"""),format.raw/*201.98*/("""this.value ='Subject';"""),format.raw/*201.120*/("""}"""),format.raw/*201.121*/("""">

						<textarea cols="77" rows="6" value=" " onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*203.101*/("""{"""),format.raw/*203.102*/("""this.value = 'Message';"""),format.raw/*203.125*/("""}"""),format.raw/*203.126*/("""">Message</textarea>
						<div class="send">
							<input type="submit" value="Send">
						</div>
					</form>
				</div>
				<div class="col-md-4 contact-in">

						<div class="address-more">
						<h4>Address</h4>
							<p>The company name,</p>
							<p>Lorem ipsum dolor,</p>
							<p>Glasglow Dr 40 Fe 72. </p>
						</div>
						<div class="address-more">
						<h4>Address1</h4>
							<p>Tel:1115550001</p>
							<p>Fax:190-4509-494</p>
						</div>

				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="map">
				<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d37494223.23909492!2d103!3d55!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x453c569a896724fb%3A0x1409fdf86611f613!2sRussia!5e0!3m2!1sen!2sin!4v1415776049771"></iframe>
			</div>
		</div>

	</div>
<!--//content-->
<div class="footer">
				<div class="container">
			<div class="footer-top-at">

				<div class="col-md-4 amet-sed">
				<h4>MORE INFO</h4>
				<ul class="nav-bottom">
						<li><a href="#">How to order</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="contact.html">Location</a></li>
						<li><a href="#">Shipping</a></li>
						<li><a href="#">Membership</a></li>
					</ul>
				</div>
				<div class="col-md-4 amet-sed ">
				<h4>CONTACT US</h4>

					<p>
Contrary to popular belief</p>
					<p>The standard chunk</p>
					<p>office:  +12 34 995 0792</p>
					<ul class="social">
						<li><a href="#"><i> </i></a></li>
						<li><a href="#"><i class="twitter"> </i></a></li>
						<li><a href="#"><i class="rss"> </i></a></li>
						<li><a href="#"><i class="gmail"> </i></a></li>

					</ul>
				</div>
				<div class="col-md-4 amet-sed">
					<h4>Newsletter</h4>
					<p>Sign Up to get all news update
and promo</p>
					<form>
						<input type="text" value="" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*267.90*/("""{"""),format.raw/*267.91*/("""this.value ='';"""),format.raw/*267.106*/("""}"""),format.raw/*267.107*/("""">
						<input type="submit" value="Sign up">
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="footer-class">
		<p >Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
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
                    DATE: Thu May 25 15:43:05 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/contact.scala.html
                    HASH: fd0ea32c30d91c7d6a9431ca8aa969e02779e46a
                    MATRIX: 857->0|1754->869|1783->870|1840->898|1870->899|1930->930|1960->931|2012->954|2042->955|2291->1176|2320->1177|2370->1199|2399->1200|2736->1509|2766->1510|2817->1532|2847->1533|9227->7884|9257->7885|9306->7904|9337->7905|9466->8005|9496->8006|9546->8026|9577->8027|9706->8127|9736->8128|9788->8150|9819->8151|9955->8257|9986->8258|10039->8281|10070->8282|12031->10214|12061->10215|12106->10230|12137->10231
                    LINES: 29->1|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|49->21|49->21|49->21|49->21|59->31|59->31|59->31|59->31|226->198|226->198|226->198|226->198|228->200|228->200|228->200|228->200|229->201|229->201|229->201|229->201|231->203|231->203|231->203|231->203|295->267|295->267|295->267|295->267
                    -- GENERATED --
                */
            