import sbt._

class TracCliProject(info: ProjectInfo) extends DefaultProject(info) {
  val htmlunit = "htmlunit" % "htmlunit" % "1.14"
}
