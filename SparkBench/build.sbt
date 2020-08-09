name := "SparkApp"

version := "1.0"

// For spark 3.0
scalaVersion := "2.12.11"

// Copied spark jar packages
unmanagedBase := baseDirectory.value / "custom_lib"
