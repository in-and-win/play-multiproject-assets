

lazy val commonSettings = Seq(
  organization := "foo",
  version := "0.1.0",
  scalaVersion := "2.11.6"
)

WebKeys.packagePrefix in Assets := "public/"

lazy val root = (project in file("."))
	.settings(commonSettings:_*)
	.enablePlugins(SbtWeb, PlayScala)
	.settings(routesGenerator := InjectedRoutesGenerator)
  	.dependsOn(sub1)
  	.aggregate(sub1)


lazy val sub1 = (project in file("modules/sub1"))
	.settings(commonSettings:_*)
	.enablePlugins(SbtWeb, PlayScala)
	.settings(routesGenerator := InjectedRoutesGenerator)

