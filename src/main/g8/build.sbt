name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.2" % "test",
  "junit" % "junit" % "4.8.1" % "test"
)

initialCommands := "import $package;format="lower,word"$._"

