import sbt._
import Keys._

object TranslatorBuild extends Build {

  lazy val _version = "0.0.1"

  val baseDependency = Seq(
    "org.atilika.kuromoji" % "kuromoji" % "0.7.7",
    "com.ibm.icu" % "icu4j" % "58.2",
    "org.apache.commons" % "commons-lang3" % "3.1",
    "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"
  )

  lazy val main = Project (
    id = "translator",
    base = file ("."),
    settings = Defaults.defaultSettings ++ Seq (
      name := "translator",
      organization := "com.github.tky",
      version := _version,
      scalaVersion := "2.11.8",
      resolvers ++= Seq(
        "ATILIKA dependencies" at "http://www.atilika.org/nexus/content/repositories/atilika"
      ),
      libraryDependencies ++= baseDependency,
      scalacOptions ++= Seq("-deprecation", "-language:_")
    )
  )
}
