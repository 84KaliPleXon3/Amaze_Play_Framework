
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
object additem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[util.Shelves],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[util.Shelves]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html>
  <body>
    <h1> Edit </h1>
      """),_display_(Seq[Any](/*7.8*/helper/*7.14*/.form(action = routes.Application.postitem())/*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""
      """),_display_(Seq[Any](/*8.8*/helper/*8.14*/.inputText(userForm("commodityName")))),format.raw/*8.51*/("""
      """),_display_(Seq[Any](/*9.8*/helper/*9.14*/.inputText(userForm("price")))),format.raw/*9.43*/("""
      """),_display_(Seq[Any](/*10.8*/helper/*10.14*/.inputText(userForm("agio")))),format.raw/*10.42*/("""
      """),_display_(Seq[Any](/*11.8*/helper/*11.14*/.inputText(userForm("picture")))),format.raw/*11.45*/("""
      """),_display_(Seq[Any](/*12.8*/helper/*12.14*/.inputText(userForm("cType")))),format.raw/*12.43*/("""
      <input type="submit">
    """)))})),format.raw/*14.6*/("""
  </body>
</html>
"""))}
    }
    
    def render(userForm:Form[util.Shelves]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[util.Shelves]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 25 21:22:59 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/additem.scala.html
                    HASH: 7e8a4d3649b2b5b7dc616b7ce73b01aa0f5c2917
                    MATRIX: 788->1|912->31|1007->92|1021->98|1074->143|1113->145|1155->153|1169->159|1227->196|1269->204|1283->210|1333->239|1376->247|1391->253|1441->281|1484->289|1499->295|1552->326|1595->334|1610->340|1661->369|1726->403
                    LINES: 26->1|29->1|35->7|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14
                    -- GENERATED --
                */
            