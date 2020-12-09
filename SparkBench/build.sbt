name := "SparkApp"

version := "1.0"

// For spark 3.0
// Use jdk 8 with sbt 1.2.1+
scalaVersion := "2.12.0"

// Copied spark jar packages
unmanagedBase := baseDirectory.value / "custom_lib"
