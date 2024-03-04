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

## `byte`, `short`, `long` and `width`

| Primitive | Wrapper Class | Notes                                           | Ranges                                      | Width |
| --------- | ------------- | ----------------------------------------------- | ------------------------------------------- | ----- |
| `byte`    | `Byte`        | Has the smallest range                          | -128 to 127                                 | 8     |
| `short`   | `Short`       |                                                 | -32768 to 32767                             | 16    |
| `int`     | `Integer`     | Java's default data type to store whole numbers | -2147483648 to 2147483647                   | 32    |
| `long`    | `Long`        | Has the largest range                           | -9223372036854775808 to 9223372036854775807 | 64    |

- Width is the amount of bits a number takes up to store in the memory. Can be found using `.SIZE` in the wrapper classes
- Java allows certain numeric literals to have a suffix appended to the value, to force it to use a different data type. Note: A smaller data type will always fit to a larger data type

```sh
jshell> long myLongVal = 100;
myLongVal ==> 100 // this is int assigned to long

jshell> long myLongVal = 100L; // here it is long (can be l or L)
myLongVal ==> 100

jshell> long myVeryLongVal = 2_147_483_647_123; // numeric literal exceeding the int's max valu should have the 'L' suffix
|  Error:
|  integer number too large
|  long myVeryLongVal = 2_147_483_647_123;
|

jshell> long myVeryLongVal = 2_147_483_647_123L;
myVeryLongVal ==> 2147483647123

jshell> short bigShortValue = 32768;
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short bigShortValue = 32768;
|
```

## Casting in Java

- Multi-line declaration can be done in JShell

```sh
jshell> short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
myMinShortValue ==> -32768
myMinIntValue ==> -2147483648

jshell> byte myMinByteValue = Byte.MIN_VALUE, mymMaxByteValue = Byte.MAX_VALUE;
myMinByteValue ==> -128
mymMaxByteValue ==> 127
```

- The Java compiler doesn't attempt to evaluate the value, in a variable, when it's used in a calculation, so it doesn't know if the value fits, and throws an error. If however, the calculations invole numeric literals, Java can already predict if it fits into the variable or not

```sh
jshell> byte myNewByteVal = (myMinByteValue / 2);
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte myNewByteVal = (myMinByteValue / 2);
|                       ^----------------^

jshell> byte myNewByteVal = (byte) (myMinByteValue / 2); // casting
myNewByteVal ==> -64

jshell> int myTotal = (myMinIntValue / 2); // no casting needed as it's already int
myTotal ==> -1073741824
```

- In the above error: The default whole number used by Java is `int` and while evaluating the expression, Java thinks that the result wont fit in to the `byte` data type. To let Java know about the data types, we use casting.
