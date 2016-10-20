## How to run a jar file

Java documentation: [Using jar files: the basics](https://docs.oracle.com/javase/tutorial/deployment/jar/basicsindex.html)

On Linux/Mac:

```
javac -cp '.:essential.jar' SpiralTurtleDriver.java
java -cp '.:essential.jar' SpiralTurtleDriver
```

On Windows:

```
javac -cp .;essential.jar SpiralTurtleDriver.java
java -cp .;essential.jar SpiralTurtleDriver
```

In Eclipse:

You will need to tell Eclipse that you want to associate an external .jar file with your Eclipse project.

If you are creating a new project, you can enter your project name, and click Next. On the next screen, there is a tab called "Libraries". Click on it and then click "Add External JARs...". Navigate to your jar file, click ok, and it will be added to Java's class path.

If you are working on an existing project, right click the project and click Properties. Click on Java Build Path on the left hand side, and you will see a tab called "Libraries". Click on it and then click "Add External JARs..." and navigate to your jar file and add it to the project's class path.
