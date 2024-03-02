# Section 02 - Programming Tools Setup

- Check the version of Java

```sh
java -version
```

- Oerating system and Java 17 version I'm using:

```sh
openjdk version "17.0.1" 2021-10-19 LTS
OpenJDK Runtime Environment Zulu17.30+15-CA (build 17.0.1+12-LTS)
OpenJDK 64-Bit Server VM Zulu17.30+15-CA (build 17.0.1+12-LTS, mixed mode, sharing)
```

- Java can be written in Code editors, however IntelliJ IDEA is prefered for writing Java code

## JShell

- JShell became standard component of JDK since Java 9
- It is a Read-Eval-Print-Loop (REPL)
- It often allows shortcuts for use
- Runs on terminal
- Sandbox enviornment
- Handly tool to get started with Java, not a full fledged IDE
- Documentation available at Oracle [Java Shell User’s Guide](https://docs.oracle.com/en/java/javase/17/jshell/index.html#Java-Platform%2C-Standard-Edition)

- Launch JShell

```sh
jshell
```

```
|  Welcome to JShell -- Version 17.0.1
|  For an introduction type: /help intro

jshell>
```

- For help, use `/help`
- To get a list of the libraies, JShell has alreay include, use:

```sh
/list -all
```

```sh
  s1 : import java.io.*;
  s2 : import java.math.*;
  s3 : import java.net.*;
  s4 : import java.nio.file.*;
  s5 : import java.util.*;
  s6 : import java.util.concurrent.*;
  s7 : import java.util.function.*;
  s8 : import java.util.prefs.*;
  s9 : import java.util.regex.*;
 s10 : import java.util.stream.*;
```

- Java has a lot of libraries we can already use instead of re-inventing the wheel
- Use curly braces `{...}` for multi-line code
- Use `/exit` to exit the JShell
