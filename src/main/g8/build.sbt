scalaVersion := "$scala_version$"

name := "$name$"
organization := "$organization$"

resolvers += Resolver.sonatypeRepo("snapshots")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
enablePlugins(ScalaNativePlugin,NBHAutoPlugin)

libraryDependencies ++= Seq(
  "de.surfice" %%% "scalanative-gtk3" % "$scalanative_gtk_version$"
)

