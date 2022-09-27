ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

lazy val root = (project in file("."))
  .settings(
    name := "DAG Generator",
      libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    libraryDependencies ++= Seq(
      "com.chuusai" %% "shapeless" % "2.4.0-M1",
      "org.typelevel" %% "cats-core" % "2.8.0",
      "org.scalacheck" %% "scalacheck" % "1.17.0" % Test
    )
  )
