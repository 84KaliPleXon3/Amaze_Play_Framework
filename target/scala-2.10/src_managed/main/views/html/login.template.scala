
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[util.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[util.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""

<!DOCTYPE html>
<html>
  <body>
    <h1> Login </h1>
      """),_display_(Seq[Any](/*7.8*/helper/*7.14*/.form(action = routes.Application.postlogin())/*7.60*/ {_display_(Seq[Any](format.raw/*7.62*/("""
      """),_display_(Seq[Any](/*8.8*/helper/*8.14*/.inputText(userForm("username")))),format.raw/*8.46*/("""
      """),_display_(Seq[Any](/*9.8*/helper/*9.14*/.inputPassword(userForm("password")))),format.raw/*9.50*/("""
      <input type="submit">
    """)))})),format.raw/*11.6*/("""
  </body>
</html>
"""))}
    }
    
    def render(userForm:Form[util.Login]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[util.Login]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 24 14:55:14 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/login.scala.html
                    HASH: 8d4a9b9c22e3731e76411eb01d3dd0bb8796b087
                    MATRIX: 784->1|906->29|1002->91|1016->97|1070->143|1109->145|1151->153|1165->159|1218->191|1260->199|1274->205|1331->241|1396->275
                    LINES: 26->1|29->1|35->7|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11
                    -- GENERATED --
                */
            