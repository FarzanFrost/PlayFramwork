name := "fp_assignment"
organization := "com.Group38"
version := "1.0-SNAPSHOT"
      
lazy val `fp_assignment` = (project in file(".")).enablePlugins(PlayScala)

      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.13.5"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies ++= Seq(
    jdbc
)

libraryDependencies ++= Seq(
    "mysql" % "mysql-connector-java" % "5.1.41"
)

libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"

//play.sbt.routes.RoutesKeys.routesImport += "com.Group38.binders._"