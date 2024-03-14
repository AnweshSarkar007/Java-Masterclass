# Section 06 - Control Flow

## Switch

- Traditional Switch

```java
switch(value) {
  case x:
    // value == x
    break;

  case y: case z: // can be multiple
    // value == y or value == z
    break;

  default:
    // default case
}
```

- `switch` can be used with:

| Valid Switch Value Types                |
| --------------------------------------- |
| `byte`, `short`, `int`, `char`          |
| `Byte`, `Short`, `Integer`, `Character` |
| `String`                                |
| `enum`                                  |

- When a case label is matched, no more cases are checked. Once matched, code is esecuted till break is enocountered. Also known as: Fallthrough

## Enchanced Switch

```java
switch (value) {
    case 1 -> System.out.println("Value is 1");
    case 2, 3 -> System.out.println("Value is 2 or 3");
    default -> System.out.println("Value is something else");
}
```

- The syntax is slightly diffrent, like `->` instead of `:`
- No need of `break` statement as fallthrough never occurs
- Multiple case grouping is replaced with comma seperated

### Enhanced Switch as an expression

```java
public static String getQuarter(String month) {
    return switch (month) { // here switch is used as a expression
        case "Jan", "Feb", "Mar" -> "1st";
        case "Apr", "May", "Jun" -> "2nd";
        case "Jul", "Aug", "Sep" -> "3rd";
        case "Oct", "Nov", "Dev" -> "4th";
        default -> { // default is required when using as expression
            String badResponse = month + "is bad";
            yield badResponse; // return within return is not possible, hence yield is used
        } // multi-line needs {...}
    };
}
```

- Note: `yield` needs to be within a code block `{...}`

## Looping

- Several looping statements in Java - `for`, `while` and `do while`

## `for` loop

- Similar to other languages like C/C++

```java
for (init; expression; increment) {
  // code block
}
```

- Example

```java
for (int counter = 1; counter <= 5; counter++) {
    System.out.println(counter);
}
```

- `break` can be used in loops too, to break out of a loop when certain condition(s) is met
- Challenge:

```java
public class ForChallenge {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }
        }

        System.out.println("There are " + counter + " prime numbers!");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int checkTill = (int) Math.sqrt(n);
        for (int i = 2; i <= checkTill; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
```

## IntelliJ Debugger

- [Debug code | IntelliJ IDEA](https://www.jetbrains.com/help/idea/debugging-code.html)
- To add breakpoint, select the line number and then run the Debug
- We can add the variables or conditons in the watch section
- Step over means, going to the next line. Step into means, going into the method

## `do-while` and `while` loop

- When the range is not known but exit condition is known
- `while` - Continue looping till some condition is met
- `do-while` - Same as `while` but runs atleast once

```java
int j = 1;
while (j <= 5) {
    System.out.println(j);
    j += 1;
}
```

```java
int j = 1;
while (true) {
    if (j > 5) {
        break;
    }

    System.out.println(j);
    j += 1;
}
```

```java
int j = 1;
boolean isReady = false;
do {
    System.out.println(j);
    j += 1;
    isReady = j <= 5;
} while (isReady);
```

- `continue` will stop execution of the current iteration and go to next iteration

## Local Variables and Scope

- A local variable is called local as it is available to use by the code block in which it was declared. It is also available to the clode blocks that are contained by the declaring block.
- Scope: Means the accessibility of a variable
- Best Practice:
  - To declare and initialize variables in the same place if possible
  - And to declare variables in the narrowest scope possible
- For switch case, variables declared in a case block are available in case/default blocks that are after that declaration

```java
switch(value) {
    case 1:
        System.out.println(i); // not ok
        break;

    case 2:
        int i = 10;
        break;

    default:
        i = value; // ok
        System.out.println(i); // ok
        break;
}

System.out.println(i); // not ok
```

## The class, the object, static & instance fields and methods

- Attributes on classes is another way to store data
- A class is:
  - A custom Data Type
  - Special code block that contains method
  - A class is like a template that helps to create an object
- An object is:
  - Instance of a class
- An object can be created using `new` keyword

```java
String s = new String("Hello, World!");
```

- Types of fields

| Static Field                                                                   | Instance Field                                                                              |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------- |
| Requires `static` keyword when declared on the class                           | Omits the `static` keyword when declared on the class                                       |
| Value of the field is stored in a special memory locaton and only in one place | Value of the field is not allocated any memory and has no value until the object is created |
| Value can be accesse by `ClassName.fieldName`                                  | Value can be accesed by `ObjectVariable.fieldName`                                          |
| Example: `Integer.MAX_VALUE`                                                   | Example: `myObject.myFieldName`                                                             |

- Types of methods

| Static Method                                            | Instance Method                                       |
| -------------------------------------------------------- | ----------------------------------------------------- |
| Requires the `static` keyword when declared on the class | Omits the `static` keyword when declared on the class |
| Method is accssed by `ClassName.methodName`              | Method is accessed by `ObjectVariable.methodName`     |
| Example: `Integer.parseInt("123")`                       | Example: `"hello".toUpperCase()`                      |

## Parsing Values and Reading Input using `System.console()`

- When we read data in, either from a file or user input, it is common for that data to be initially a String
- We use some methods in the wrapper classe to parse String values

```java
public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2023;
        String userDateOfBirth = "2000"; // coming as user input
        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));
    }
}
```

- Ways to read data from the console

| Technique                | Description                                                                                                                                                                                                |
| ------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `System.in`              | Like System.out, Java provides System.in which can read input from the console or terminal. It’s not easy to use for beginners, and lots of code has been built around it, to make it easier.              |
| `System.console`         | This is Java’s solution for easier support for reading a single line and prompting user for information. Although this is easy to use, it doesn’t work with I.D.E.’s because these environments disable it |
| `Command Line Arguments` | This is calling the Java program and specifying data in the call. This is very commonly used but doesn’t let us create an interactive application in a loop in Java.                                       |
| `Scanner`                | The Scanner class was built to be a common way to read input, either using System.in or a file. For beginners, it’s much easier to understand than the bare bones System.in                                |

- Using `System.Console()`

```java
public static String getInputFromConsole(int currentYear) {
    String name = System.console().readLine("What's your name?");
    System.out.println("Hi " + name + "!");
    return "";
}
```

- Note: `readline` returns `String`
- However, IntelliJ doesn't allow to run `System.console()`:

```sh
/Library/Java/JavaVirtualMachines/zulu-17.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=56675:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/{...}/Java 17 Masterclass/06-Control-Flow/ControlFlow/out/production/ControlFlow ReadingUserInput
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.io.Console.readLine(String, Object[])" because the return value of "java.lang.System.console()" is null
	at ReadingUserInput.getInputFromConsole(ReadingUserInput.java:10)
	at ReadingUserInput.main(ReadingUserInput.java:5)

Process finished with exit code 1
```

- So use the terminal: `java src/ReadingUserInput.java`

## Exception Handling

- An Exception is an error that happens i code. Some types of errors can be predicted and named
- Java has many named exceptions. Read more about them here: [Direct Known Subclasses | `Class Exception`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html)
- Exception is caught using Try/Catch

```java
try {
    // statments might cause errors
} catch(Exception e) { // here Exception can be a named Exception too, for catching
    // handle the exception
}
```

## Scanner class

- Simple text scanner, which can parse types and string.
- We first need to create an instance of `Scanner`

```java
import java.util.Scanner // important

Scanner sc = new Scanner(System.in); // from stdin
Scanner sc = new Scanner(new File("nameOfFileOnFileSystem")) // from file
```

- Import lets us use other people's code/classes by importing them to our project

```java
public static String getInputFromScanner(int currentYear) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What's your name?");
    String name = scanner.nextLine();

    System.out.println("What year were you born?");
    String dateOfBirth = scanner.nextLine();
    int age = currentYear - Integer.parseInt(dateOfBirth);

    return "So, you are " + age + " years old.";
}
```

- `Scanner` doesn't allow prompts, so we need to add them seperately. `.nextLine()` is used to read `String`

```java
public static String getInputFromScanner(int currentYear) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What's your name?");
    String name = scanner.nextLine();

    System.out.println("What year were you born?");

    boolean validDob = false;
    int age = 0;
    do {
        System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " +currentYear);
        try {
            age = checkData(currentYear, scanner.nextLine());
            validDob = age >= 0;
        } catch (NumberFormatException e) {
            System.out.println("Characters not allowed! Try again!");
        }
    } while (!validDob);

    return "So, you are " + age + " years old.";
}

public static int checkData(int currentYear, String dateOfBirth) {
    int dob = Integer.parseInt(dateOfBirth);
    int minimumYear = currentYear - 125;

    if (dob < minimumYear || dob > currentYear) {
        return -1;
    }

    return currentYear - dob;
}
```
