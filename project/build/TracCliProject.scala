import sbt._

class TracCliProject(info: ProjectInfo) extends DefaultProject(info) {
  val htmlunit = "net.sourceforge.htmlunit" % "htmlunit" % "1.14"
}
