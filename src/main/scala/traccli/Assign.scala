package traccli

import com.gargoylesoftware.htmlunit.WebClient
import com.gargoylesoftware.htmlunit.html.{HtmlPage, HtmlTextInput, HtmlPasswordInput, HtmlSubmitInput, HtmlRadioButtonInput}
import scala.collection.JavaConversions._

object Assign extends optional.Application {
  def main(url: String, ticket: Int, to: String) {
    val webclient = new WebClient
    webclient.setJavaScriptEnabled(false)
    val page = webclient.getPage[HtmlPage](url + "/ticket/" + ticket + "?pane=edit")
    val reassign = page.getFirstByXPath[HtmlRadioButtonInput]("//input[@id='action_reassign']")
    reassign setChecked true
    val owner = page.getFirstByXPath[HtmlTextInput]("//input[@id='action_reassign_reassign_owner']")
    owner setText to
    val submit = page.getFirstByXPath[HtmlSubmitInput]("//input[@name='submit']")
    submit.click()
  }
}
