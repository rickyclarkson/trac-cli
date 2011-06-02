package traccli

import com.gargoylesoftware.htmlunit.WebClient
import com.gargoylesoftware.htmlunit.html.{HtmlPage, HtmlTextInput, HtmlPasswordInput, HtmlSubmitInput}
import scala.collection.JavaConversions._

object Login extends optional.Application {
  def main(url: String, username: String, password: String) {
    val webclient = new WebClient
    val page = webclient.getPage[HtmlPage](url)
    val loginForm = page.getForms()(0)
    val usernamePart = loginForm.getInputByName[HtmlTextInput]("username")
    val passwordPart = loginForm.getInputByName[HtmlPasswordInput]("password")

    usernamePart.setText(username)
    passwordPart.setText(password)
    val submitButton = loginForm.getInputByName[HtmlSubmitInput]("submit")
    val newPage = submitButton.click[HtmlPage]()
    println(newPage.getTitleText)
  }
}
