import sbt._

object Dependencies {

  val Test = Seq("org.scalatest" %% "scalatest" % "3.0.1" % "test")

  val SparkVersion = "2.0.2"

  val Spark = "org.apache.spark" %% "spark-core" % SparkVersion
}