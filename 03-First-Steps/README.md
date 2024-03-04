# Section 03 - First Steps

## Hello, World!

- Running in a JShell

```sh
jshell> System.out.print("Hello, World!");
```

- Statement - Complete command which is a set of expressions
- In Java, we can't replace the double quotes with single quotes. It works like C, where single quotes are for single characters and double quotes are for strings

```sh
jshell> System.out.print('Hello, World!')
|  Error:
|  unclosed character literal
|  System.out.print('Hello, World!')
|
```

- `+` is used in `System.out.print`to print different data types together in a single line of text

```sh
jshell> System.out.print('My Value' + myValue);
```

## Variables

- A keybword is any one of the reserved words, that have a pre-defined meaning in the Java syntax
- All code is case sensitive
- Java 17 keywords [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9)
- Variables are namespace memory location, whise value can change during program execution.
- Data types - the different tyoes of variables we can define. They are keywords.
- Java's Object Oriented features lets us create our own custom data types too, besides primitive ones (which are built in to the Java language)

```sh
jshell> int myFirstNumber = 5;
myFirstNumber ==> 5
```

- Declaration statement is used to define a variable by indicating it's name, data type and optionall set the variable to a specified value
- Expression is a construct that evaluates to a single value

```sh
jshell> System.out.print(myFirstNumber);
5
```

- When changing the value of a variable, the memory location of the variable is still the same

```sh
jshell> myFirstNumber = 10;
myFirstNumber ==> 10

jshell> System.out.print(myFirstNumber);
10
```

- Re-declaring the same varibale is not allowed. It throws error. However, JShell does allowy ti!
- Mathematical operations can be doine in JShell too:

```sh
jshell> (10 + 5) + (2 * 10)
$11 ==> 35
```

## Starting out with Expressions

- Expression is the code segment present on the right side of the equal to sign in an assignment or declaration statement
- Can be single valued or complex
- To list the variables present in JShell along with their values, use:

```sh
jshell> /var
|    int myFirstNumber = 35
|    int $10 = 15
|    int $11 = 35
|    int mySecondNumber = 12
|    int myThirdNumber = 6
```

- Creating variables with other variables

```sh
jshell> int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
myTotal ==> 53
```

## Primitive Types

- Primitive data types are the basic data types in Java
- Primitive Data types

| Whole number | Real number | Single character | Boolean   |
| ------------ | ----------- | ---------------- | --------- |
| `byte`       | `float`     | `char`           | `boolean` |
| `short`      | `double`    |                  |           |
| `int`        |             |                  |           |
| `long`       |             |                  |           |

- Primitive data types are placeholders from memory space in Java
- Integer:

  - Whole number with no fractional part. No decimal
  - Specified range of values for Integer:

  ```sh
  jshell> Integer.MIN_VALUE;
  $16 ==> -2147483648

  jshell> Integer.MAX_VALUE
  $17 ==> 2147483647
  ```

- Classes: Building block for object-oriented programming, allowing us to build custom data types
- Wrapper Class: Java uses the concept of Wrapper class for all its primitive data types. A wrapper class provides simple operations, as well as some basic information about the primitive data type, which cannot be stored on the primitive itself (like `MIN_VALUE` and `MAX_VALUE`)

| Primitive | Wrapper Class |
| --------- | ------------- |
| `byte`    | `Byte`        |
| `short`   | `Short`       |
| `char`    | `Character`   |
| `int`     | `Integer`     |
| `long`    | `Long`        |
| `float`   | `Float`       |
| `double`  | `Double`      |
| `boolean` | `Boolean`     |

- Overflow/Underflow of intergers can happen in Java too. These are also known as Integer Wrap-arounds. These situations can happen when values are being calculated, i.e. in expressions

```sh
jshell> Integer.MAX_VALUE + 1
$2 ==> -2147483648
```

- However, Java doesn't allow us to explicitly set something out of the range and neither does it wraps around. That is, we cannot set something out of bounds using numeric literals

```sh
jshell> int myMaxIntTest = 2147483648; // Note: max is 2147483647
|  Error:
|  integer number too large
|  int myMaxIntTest = 2147483648;
|

jshell> int myMaxIntTest = 2147483647 + 1; // Note: this is an expression
myMaxIntTest ==> -2147483648
```

- Commas cannot be placed in between text literals, but to imporve readability, Java uses `_`. Note: `_` cannot be used in the start and end of the numeric literals

```sh
jshell> int myMaxIntTest = 2_147_483_647;
myMaxIntTest ==> 2147483647

jshell> int myMaxIntTest = _147_483_647;
|  Error:
|  cannot find symbol
|    symbol:   variable _147_483_647
|  int myMaxIntTest = _147_483_647;
|
```
