lazy val root = (project in file(".")).
		settings(
			name := "Coding Dojo",
			version := "1.0.0",
			organization := "org.juanitodread",
			scalaVersion := "2.11.6",
			scalaHome := Some(file("/opt/scala-sdk/scala-2.11.6/"))
		)
