
version := "0.1"

scalaVersion := "2.13.1"

lazy val root = (project in file("."))
  .settings(
    name := "scala-for-the-impatient",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test",
    libraryDependencies += "junit" % "junit" % "4.11" % "test",
)