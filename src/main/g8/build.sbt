lazy val baseSettings: Seq[Setting[_]] = Seq(
  scalaVersion       := "$scala_version$",
  scalacOptions     ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:higherKinds",
    "-language:implicitConversions", "-language:existentials",
    "-unchecked",
    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture"
  ),
  resolvers += Resolver.sonatypeRepo("releases")
)

lazy val $name$ = project.in(file("."))
  .settings(moduleName := "$name$")
  .settings(baseSettings: _*)
  .aggregate(core, docs)
  .dependsOn(core, docs)

lazy val core = project.in(file("core"))
  .settings(moduleName := "$name$-core")
  .settings(baseSettings: _*)

  lazy val docs = project.in(file("slides/mdoc"))       // new documentation project
    .settings(moduleName := "$name$-slides")
    .settings(baseSettings: _*)
    .settings(
      mdocVariables := Map(
        "VERSION" -> version.value
      ),
      watchSources += (ThisBuild / baseDirectory).value / "slides/mdoc/*.html",
      mdocIn        := file("./slides/mdoc"),
      mdocOut       := file("./docs")
    )
    .dependsOn(core)
    .enablePlugins(MdocPlugin)