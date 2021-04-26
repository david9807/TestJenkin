name := "untitled1"
 
version := "1.0" 
      
lazy val `untitled1` = (project in file(".")).enablePlugins(PlayJava)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq( javaJdbc , cache , javaWs )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

libraryDependencies += "com.spotify" % "docker-client" % "3.5.13"

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.3")

      