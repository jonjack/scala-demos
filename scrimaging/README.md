# scrimaging

Testing out the [Scrimage](git status --untracked-files) library.

#### To import into Eclipse

```scala
sbt eclipse

// If you want the source of dependencies
sbt "eclipse with-source=true"
```

#### Run the example

From the project root.

```scala
sbt run
```

The generated images should be output to `/images/output`
