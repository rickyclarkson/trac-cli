import sbt._

class TracCliProject(info: ProjectInfo) extends DefaultProject(info) {
  val htmlunit = "net.sourceforge.htmlunit" % "htmlunit" % "2.8"
  val optional = "Paul Phillips" %% "optional" % "0.2"
}
