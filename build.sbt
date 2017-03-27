

enablePlugins(ScalaJSPlugin)

name := "enzyme"

//version := "2017.3.0-SNAPSHOT"

//scalaVersion := "2.12.0"
scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.11.8","2.12.1")


val scalatestVersion = "3.0.0"


resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")

resolvers += Resolver.url("scalajs-react-interface",url("https://dl.bintray.com/scalajs-react-interface/maven"))

resolvers += Resolver.jcenterRepo

libraryDependencies += "scalajs-react-interface" %%% "core" % "2017.3.26-beta" % Provided


relativeSourceMaps := true


scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-language:implicitConversions"
)

//======================== Publication Settings =========================\\

resolvers += Resolver.jcenterRepo

organization := "scalajs-react-interface"

licenses += ("Apache-2.0", url(
  "https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-interface")

bintrayRepository := "maven"

bintrayVcsUrl := Some("git@github.com:scalajs-react-interface/enzyme.git")

publishArtifact in Test := false


//================ Testing settings =====================\\
libraryDependencies += "org.scalatest" %%% "scalatest" % scalatestVersion % Test

scalaJSStage in Global := FastOptStage

requiresDOM := true


