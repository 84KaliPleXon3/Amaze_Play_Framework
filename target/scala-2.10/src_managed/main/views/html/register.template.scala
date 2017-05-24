
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[util.Registration],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[util.Registration]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

<!DOCTYPE html>
<html>
  <body>
    <h1> Registration </h1>
      """),_display_(Seq[Any](/*7.8*/helper/*7.14*/.form(action = routes.Application.postregister())/*7.63*/ {_display_(Seq[Any](format.raw/*7.65*/("""
      """),_display_(Seq[Any](/*8.8*/helper/*8.14*/.inputText(userForm("username")))),format.raw/*8.46*/("""
      """),_display_(Seq[Any](/*9.8*/helper/*9.14*/.inputPassword(userForm("password")))),format.raw/*9.50*/("""
      """),_display_(Seq[Any](/*10.8*/helper/*10.14*/.checkbox(userForm("sellers"),
    '_showConstraints->false,
    '_disabled->""
    ))),format.raw/*13.6*/("""
      <input type="submit">
    """)))})),format.raw/*15.6*/("""
  </body>
</html>
"""))}
    }
    
    def render(userForm:Form[util.Registration]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[util.Registration]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 24 14:46:34 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/register.scala.html
                    HASH: 3451141ed0bb2511ef6d5270039a2c698f4e03aa
                    MATRIX: 794->1|923->36|1026->105|1040->111|1097->160|1136->162|1178->170|1192->176|1245->208|1287->216|1301->222|1358->258|1401->266|1416->272|1522->357|1587->391
                    LINES: 26->1|29->1|35->7|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|41->13|43->15
                    -- GENERATED --
                */
            