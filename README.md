# Hello Greenfield

A very small Java project used in CO3408 Lab 5 to start a new (greenfield) Git repository.

Requires Java 17 or later (tested on Java 17, 21 and 25) and Maven 3.9 or later.
IntelliJ IDEA and Eclipse include Maven: open this folder as a Maven project.


## How to build and run

Build the project using Maven:

```bash
mvn package
```

Run the application:

```bash
java -jar target/hello-greenfield-1.0.0.jar
```

You can also pass a name as an argument:

```bash
java -jar target/hello-greenfield-1.0.0.jar Amaan
```

This will output:

Hello, Amaan!