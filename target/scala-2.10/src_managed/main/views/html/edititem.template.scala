
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
object edititem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.Commodity],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[models.Commodity]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""

<!DOCTYPE html>
<html>
  <body>
    <h1> Edit </h1>
      """),_display_(Seq[Any](/*7.8*/helper/*7.14*/.form(action = routes.Application.postedititem())/*7.63*/ {_display_(Seq[Any](format.raw/*7.65*/("""
      """),_display_(Seq[Any](/*8.8*/helper/*8.14*/.inputText(userForm("commodityId")))),format.raw/*8.49*/("""
      """),_display_(Seq[Any](/*9.8*/helper/*9.14*/.inputText(userForm("commodityName")))),format.raw/*9.51*/("""
      """),_display_(Seq[Any](/*10.8*/helper/*10.14*/.inputText(userForm("price")))),format.raw/*10.43*/("""
      """),_display_(Seq[Any](/*11.8*/helper/*11.14*/.inputText(userForm("agio")))),format.raw/*11.42*/("""
      """),_display_(Seq[Any](/*12.8*/helper/*12.14*/.inputDate(userForm("picture")))),format.raw/*12.45*/("""
      """),_display_(Seq[Any](/*13.8*/helper/*13.14*/.inputText(userForm("cType")))),format.raw/*13.43*/("""
      <input type="submit">
    """)))})),format.raw/*15.6*/("""
  </body>
</html>
"""))}
    }
    
    def render(userForm:Form[models.Commodity]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[models.Commodity]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 25 20:59:31 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/edititem.scala.html
                    HASH: 6aaf90191021dfe8d208d36f19647fd29fd6bb6c
                    MATRIX: 793->1|921->35|1016->96|1030->102|1087->151|1126->153|1168->161|1182->167|1238->202|1280->210|1294->216|1352->253|1395->261|1410->267|1461->296|1504->304|1519->310|1569->338|1612->346|1627->352|1680->383|1723->391|1738->397|1789->426|1854->460
                    LINES: 26->1|29->1|35->7|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15
                    -- GENERATED --
                */
            