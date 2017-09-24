
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
object usercenter extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html lang="en">
<head>
	<title>用户中心</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*9.32*/routes/*9.38*/.Assets.at("vendor/bootstrap/css/bootstrap.min.css"))),format.raw/*9.90*/("""">
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*10.32*/routes/*10.38*/.Assets.at("vendor/font-awesome/css/font-awesome.min.css"))),format.raw/*10.96*/("""">
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*11.32*/routes/*11.38*/.Assets.at("vendor/linearicons/style.css"))),format.raw/*11.80*/("""">
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*12.32*/routes/*12.38*/.Assets.at("vendor/chartist/css/chartist-custom.css"))),format.raw/*12.91*/("""">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*14.32*/routes/*14.38*/.Assets.at("stylesheets/mainManage.css"))),format.raw/*14.78*/("""">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*16.32*/routes/*16.38*/.Assets.at("stylesheets/demo.css"))),format.raw/*16.72*/("""">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href=""""),_display_(Seq[Any](/*20.52*/routes/*20.58*/.Assets.at("images/apple-icon.png"))),format.raw/*20.93*/("""">
	<link rel="icon" type="image/png" sizes="96x96" href=""""),_display_(Seq[Any](/*21.57*/routes/*21.63*/.Assets.at("images/favicon.png"))),format.raw/*21.95*/("""">
</head>

<body>

	<div id="wrapper">
		<!-- NAVBAR -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="brand">
				<a href="/"><img src=""""),_display_(Seq[Any](/*30.28*/routes/*30.34*/.Assets.at("images/logo-dark.png"))),format.raw/*30.68*/("""" alt="Klorofil Logo" class="img-responsive logo"></a>
			</div>
			<div class="container-fluid">
				<div class="navbar-btn">
					<button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
				</div>
				<form class="navbar-form navbar-left">
					<div class="input-group">
						<input type="text" value="" class="form-control" placeholder="Search dashboard...">
						<span class="input-group-btn"><button type="button" class="btn btn-primary">Go</button></span>
					</div>
				</form>
				<div class="navbar-btn navbar-btn-right">
					<a class="btn btn-success update-pro" href="#downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
				</div>
				<div id="navbar-menu">
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown">
							<a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
								<i class="lnr lnr-alarm"></i>
								<span class="badge bg-danger">5</span>
							</a>
							<ul class="dropdown-menu notifications">
								<li><a href="#" class="notification-item"><span class="dot bg-warning"></span>System space is almost full</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-danger"></span>You have 9 unfinished tasks</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-success"></span>Monthly report is available</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-warning"></span>Weekly meeting in 1 hour</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-success"></span>Your request has been approved</a></li>
								<li><a href="#" class="more">See all notifications</a></li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="lnr lnr-question-circle"></i> <span>Help</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
							<ul class="dropdown-menu">
								<li><a href="#">Basic Use</a></li>
								<li><a href="#">Working With Data</a></li>
								<li><a href="#">Security</a></li>
								<li><a href="#">Troubleshooting</a></li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src=""""),_display_(Seq[Any](/*71.78*/routes/*71.84*/.Assets.at("images/user.png"))),format.raw/*71.113*/("""" class="img-circle" alt="Avatar"> <span>Samuel</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
							<ul class="dropdown-menu">
								<li><a href="#"><i class="lnr lnr-user"></i> <span>My Profile</span></a></li>
								<li><a href="#"><i class="lnr lnr-envelope"></i> <span>Message</span></a></li>
								<li><a href="#"><i class="lnr lnr-cog"></i> <span>Settings</span></a></li>
								<li><a href="#"><i class="lnr lnr-exit"></i> <span>Logout</span></a></li>
							</ul>
						</li>
						<!-- <li>
							<a class="update-pro" href="#downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
						</li> -->
					</ul>
				</div>
			</div>
		</nav>
		<!-- END NAVBAR -->
		<!-- LEFT SIDEBAR -->
		<div id="sidebar-nav" class="sidebar">
			<div class="sidebar-scroll">
				<nav>
					<ul class="nav">
						<li><a href="/user" class="active"><i class="lnr lnr-home"></i> <span>用户中心</span></a></li>
					</ul>
				</nav>
			</div>
		</div>
		<!-- END LEFT SIDEBAR -->
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<!-- RECENT PURCHASES -->
							<div class="panel">
								<div class="panel-heading">
									<h3 class="panel-title">消费记录</h3>


									<div class="right">
										<button type="button" class="btn-toggle-collapse"><i class="lnr lnr-chevron-up"></i></button>
										<button type="button" class="btn-remove"><i class="lnr lnr-cross"></i></button>
									</div>
								</div>
								<div class="panel-body no-padding">
									<table class="table table-striped">
										<thead>
											<tr>
												<th>商品名称</th>
												<th>数量</th>
												<th>总金额</th>
												<th>商店</th>
												<th>时间</th>
											</tr>
										</thead>
										<tbody>
                        """),_display_(Seq[Any](/*128.26*/for(bill <- Bill.findByUser(session.get("user"))) yield /*128.75*/{_display_(Seq[Any](format.raw/*128.76*/("""
                          <tr>
                            <td><a href="#">"""),_display_(Seq[Any](/*130.46*/Commodity/*130.55*/.findById(bill.commodityId).commodityName)),format.raw/*130.96*/("""</a></td>
                            <td>"""),_display_(Seq[Any](/*131.34*/bill/*131.38*/.number)),format.raw/*131.45*/("""</td>
                            <td>"""),_display_(Seq[Any](/*132.34*/bill/*132.38*/.money)),format.raw/*132.44*/("""</td>
                            <td>"""),_display_(Seq[Any](/*133.34*/Commodity/*133.43*/.get_store(bill.commodityId).storename)),format.raw/*133.81*/("""</td>
                            <td>"""),_display_(Seq[Any](/*134.34*/bill/*134.38*/.time)),format.raw/*134.43*/("""</td>
                          </tr>
                        """)))})),format.raw/*136.26*/("""

										</tbody>
									</table>
								</div>
								<div class="panel-footer">
									<div class="row">
										<div class="col-md-6"><span class="panel-note"><i class="fa fa-clock-o"></i> Last 24 hours</span></div>
									</div>
								</div>
							</div>
							<!-- END RECENT PURCHASES -->
						</div>

					</div>
				</div>
			</div>
			<!-- MAIN CONTENT -->
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
		<footer>
			<div class="container-fluid">
				<p class="copyright">&copy; 2017</p>
			</div>
		</footer>
	</div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
	<script src="assets/vendor/chartist/js/chartist.min.js"></script>
	<script src="assets/scripts/klorofil-common.js"></script>
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
                    DATE: Sun Sep 24 13:56:38 HKT 2017
                    SOURCE: /root/Downloads/Amaze_Play_Framework-master/app/views/usercenter.scala.html
                    HASH: 84636e0d37f09d1db1ed2b0c5c2335acaee37cb6
                    MATRIX: 860->0|1204->309|1218->315|1291->367|1361->401|1376->407|1456->465|1526->499|1541->505|1605->547|1675->581|1690->587|1765->640|1854->693|1869->699|1931->739|2074->846|2089->852|2145->886|2378->1083|2393->1089|2450->1124|2545->1183|2560->1189|2614->1221|2813->1384|2828->1390|2884->1424|5371->3875|5386->3881|5438->3910|7531->5966|7597->6015|7637->6016|7751->6093|7770->6102|7834->6143|7914->6186|7928->6190|7958->6197|8034->6236|8048->6240|8077->6246|8153->6285|8172->6294|8233->6332|8309->6371|8323->6375|8351->6380|8447->6443
                    LINES: 29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|44->16|44->16|44->16|48->20|48->20|48->20|49->21|49->21|49->21|58->30|58->30|58->30|99->71|99->71|99->71|156->128|156->128|156->128|158->130|158->130|158->130|159->131|159->131|159->131|160->132|160->132|160->132|161->133|161->133|161->133|162->134|162->134|162->134|164->136
                    -- GENERATED --
                */
            