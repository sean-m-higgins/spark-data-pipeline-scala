# Scala Template

Steps to use Template:
1. Import form repo this repo, and then change the build.sbt :
  - name := "ScalaTemplate" to name:= "NewProjectName"
2. Add files to /project :
  - assembly.sbt - with this line inside - addSbtPlugin("com.eed3si9n" %% "sbt-assembly" % "0.14.9")
  - plugins.sbt - with these lines inside :
    - addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.5.1")
    - addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")
3. Make any other updates to build.sbt for package dependencies or scalaVersion
4. Run `sbt` in the terminal, then at `>` type `run`