name := "scala-test-spark"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++=
  Dependencies.Test :+
    Dependencies.Spark :+
    "com.jsuereth" %% "scala-arm" % "2.0"