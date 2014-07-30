name := """testPhantomJS22"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "com.github.detro.ghostdriver" % "phantomjsdriver" % "1.0.4" % "test",
  "org.webjars" % "jquery" % "2.1.1"
)
