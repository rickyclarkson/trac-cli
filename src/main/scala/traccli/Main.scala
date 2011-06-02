package traccli

import com.gargoylesoftware.htmlunit.WebClient

object Main {
  def main(args: Array[String]) {
    val webclient = new WebClient
    val page = webclient.getPage("http://github.com")
    println(page)
  }
}
