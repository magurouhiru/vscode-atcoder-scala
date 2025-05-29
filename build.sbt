val scala2Version = "2.13.16"
val scala3Version = "3.3.0"

ThisBuild / scalaVersion := scala2Version
ThisBuild / crossScalaVersions := Seq(scala2Version, scala3Version)

lazy val root = project
  .in(file("."))
  .settings(
    name := "vscode-atcoder-scala",
    version := "0.1.0-SNAPSHOT",
    scalacOptions ++= Seq("-deprecation", "-unchecked"),
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
