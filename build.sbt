name := "rc-core"

version := "0.1"

scalaVersion := "2.12.4"

val akkaVersion = "2.5.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion",
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test
)

        