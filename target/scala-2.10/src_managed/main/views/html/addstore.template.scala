
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
object addstore extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[util.Request],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[util.Request]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html>
  <body>
    <h1> Edit </h1>
      """),_display_(Seq[Any](/*7.8*/helper/*7.14*/.form(action = routes.Application.postbusiness())/*7.63*/ {_display_(Seq[Any](format.raw/*7.65*/("""
      """),_display_(Seq[Any](/*8.8*/helper/*8.14*/.inputText(userForm("storename")))),format.raw/*8.47*/("""
      """),_display_(Seq[Any](/*9.8*/helper/*9.14*/.inputText(userForm("description")))),format.raw/*9.49*/("""
      <input type="submit">
    """)))})),format.raw/*11.6*/("""
  </body>
</html>
"""))}
    }
    
    def render(userForm:Form[util.Request]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[util.Request]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 24 20:39:52 HKT 2017
                    SOURCE: /root/Downloads/amaze/app/views/addstore.scala.html
                    HASH: a95b02364451215917a337cdc390859db760b5c4
                    MATRIX: 789->1|913->31|1008->92|1022->98|1079->147|1118->149|1160->157|1174->163|1228->196|1270->204|1284->210|1340->245|1405->279
                    LINES: 26->1|29->1|35->7|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11
                    -- GENERATED --
                */
            