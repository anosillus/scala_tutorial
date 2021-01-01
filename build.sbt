lazy val root = (project in file(".")).
  settings(
    name := "lesson",
    version := "0.0.1",
    scalaVersion := "2.12.8",
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"
  )
