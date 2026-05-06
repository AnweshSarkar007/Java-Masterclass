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

- A keyword is any one of the reserved words, that have a pre-defined meaning in the Java syntax
- All code is case sensitive
- Java 17 keywords [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9)
- Variables are namespace memory location, whose value can change during program execution.
- Data types - the different types of variables we can define. They are keywords.
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

- Re-declaring the same varibale is not allowed. It throws error. However, JShell does allowy it !
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

| Whole number | Real number  | Single character | Boolean   |
| ------------ | ------------ | ---------------- | --------- |
| `byte`       | `float`      | `char`           | `boolean` |
| `short`      | **`double`** |                  |           |
| **`int`**    |              |                  |           |
| `long`       |              |                  |           |

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
jshell> int myMaxIntTest = 2147483648; # Note: max is 2147483647
|  Error:
|  integer number too large
|  int myMaxIntTest = 2147483648;
|

jshell> int myMaxIntTest = 2147483647 + 1; # Note: this is an expression
myMaxIntTest ==> -2147483648
```

- Commas cannot be placed in between text literals, but to improve readability, Java uses `_`. Note: `_` cannot be used in the start and end of the numeric literals

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
myLongVal ==> 100 # this is int assigned to long

jshell> long myLongVal = 100L; # here it is long (can be l or L)
myLongVal ==> 100

jshell> long myVeryLongVal = 2_147_483_647_123; # numeric literal exceeding the int's max valu should have the 'L' suffix
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

jshell> byte myNewByteVal = (byte) (myMinByteValue / 2); # casting
myNewByteVal ==> -64

jshell> int myTotal = (myMinIntValue / 2); # no casting needed as it's already int
myTotal ==> -1073741824
```

- In the above error: The default whole number used by Java is `int` and while evaluating the expression, Java thinks that the result wont fit in to the `byte` data type. To let Java know about the data types, we use casting.

## Primitive Types Challenge

```sh
jshell> byte aByte = 12;
aByte ==> 12

jshell> short aShort = 20_000;
aShort ==> 20000

jshell> int aInt = 600_000;
aint ==> 600000

jshell> long aLong = 50_000L + (10L * (aByte + aShort + aInt));
aLong ==> 6250120
```

- Parenthesis makes code more readable and and also denotes which part of the expression to work out first

## Float and Double Primitives

- Floating point numbers have fractional parts denoted by decimal point
- Floating point numbers are used for more precision in calculations
- Two default floating-point number types in Java - `float` and `double`. `double` is the default for any decimal/real number
- Precision refer to the format and the amount of space occupied by the relevant type. `double` is more precise then `float`

| Data Type | Width | Min Value | Max Value              |
| --------- | ----- | --------- | ---------------------- |
| `float`   | 32    | 1.4E-45   | 3.4028235E38           |
| `double`  | 64    | 4.9E-324  | 1.7976931348623157E308 |

- Java's Scientific Notation - Scientific notations are often used when denoting floating point numbers in Java. It can be translated into more familar terms by replacing the `E` in the number by `× 10^`
  - 1.4E-45 = 1.4 × 10<sup>-45</sup>
  - 3.4028235E38 = 3.4028235 × 10<sup>38</sup>
  - 4.9E-324 = 4.9 × 10<sup>-324</sup>
  - 1.7976931348623157E308 = 1.7976931348623157 × 10<sup>308</sup>

```sh
jshell> int myInt = 5; float myFloat = 5f; double myDouble = 5;
myInt ==> 5
myFloat ==> 5.0
myDouble ==> 5.0

jshell> float myFloat = 2.25;
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  float myFloat = 2.25;
|                  ^--^

jshell> float myFloat = 2.25f;
myFloat ==> 2.25

jshell> float myFloat = (float) 2.25; # not recommended
myFloat ==> 2.25
```

- Similar to `long`, floating point numbers have literal suffixes too.
  - `D` or `d` for Double - Optional as double is default
  - `F` or `f` for float

## Floating Point Precision

- For whole numbers, the output is never in scientific notation. But for floating point numbers, it could be in scientific notations in some cases

| Literal value | Default Output |
| ------------- | -------------- |
| 5             | 5.0            |
| 5.000000      | 5.0            |
| 5f            | 5.0            |
| 5d            | 5.0            |
| 5e1           | 50.0           |
| 5_000_000.0   | 5000000.0      |
| 50_000_000.0  | 5.0E7          |

```sh
jshell> double formatDouble = 3_000_000.4_567_890;
formatDouble ==> 3000000.456789
```

- Division arithmetic

```sh
jshell> myInt = 5 / 2;
myInt ==> 2

jshell> myFloat = 5f / 2f;
myFloat ==> 2.5

jshell> myDouble = 5d / 2d;
myDouble ==> 2.5

jshell> myFloat = 5f / 3f;
myFloat ==> 1.6666666 # recurring, we cant represent such number exactly, but we can be precise depending on the data type

jshell> myDouble = 5d / 3d;
myDouble ==> 1.6666666666666667

jshell> myDouble = 5.0 / 3.00;
myDouble ==> 1.6666666666666667

jshell> myDouble = 5.00 / 3; # 3 is integer here
myDouble ==> 1.6666666666666667

jshell> myFloat = 5.00 / 3f;
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  myFloat = 5.00 / 3f;
|            ^-------^
```

- Why `double` is default?

  - It's actually faster in many modern computers
  - At chip level, the funtionality to deal with `double` is fater than `float`
  - Java libraries mostly work on double
  - Double is more precise and has a larger range

- Pounds to Kilograms

```sh
jshell> double pounds = 123.45;
pounds ==> 123.45

jshell> double kilograms = 0.45359237 * pounds;
kilograms ==> 55.9959780765

jshell> System.out.print(pounds + " pounds is equal to: " + kilograms + " kilograms!");
123.45 pounds is equal to: 55.9959780765 kilograms!
```

- `float` and `double` are great for general floating point operations. But for precise calculations, neither should be used. This is due to the limitations with how floating point numbers are stored.
  - Java has a class called `BigDecimal` that overcomes this!

## `char`

```sh
jshell> char myChar = 'D';
myChar ==> 'D'

jshell> char myChar = 'DD';
|  Error:
|  unclosed character literal
|  char myChar = 'DD';
|                ^
```

- The `char` occupies 2 Bytes of memory, thus it's width is 16

  - `char` is internally stored as a 2 Byte number, similar to `short`
  - This number gets mapped to a single character by Java
  - So, when a `char` is printed, we see the mapped character and not the representative number
  - We can use character literals to assign to a `char` instead of looking up their representative number

- Unicode is an international encodinf standard for use with different languages and scripts by which each letter, digit or symbol is assigned a unique numeric value that applies across different platforms and programs. `\u` escape sequence is used.

```sh
jshell> char myChar = '\u0044';
myChar ==> 'D'

jshell> char myChar = 68;
myChar ==> 'D'
```

- `char` can be assigend using either of character literal, unicode notation and number

## `boolean`

- Two values - `true` or `false`

```sh
jshell> boolean myTrue = true;
myTrue ==> true

jshell> boolean myFalse = false;
myFalse ==> false
```

- Developers often used the prefix `is` or `has` for `boolean variable names. It makes the code more readable.

## String Data Type

- Kind of a class in Java, but it is treated a bit differently
- A string is a sequence of characters
- It is technically limited by the heap space of the system

```sh
jshell> String myString = "This is a string";
myString ==> "This is a string"

jshell> System.out.print("My String is equal to " + myString);
My String is equal to This is a string

jshell> myString = myString + ", and this is more!"; # concating
myString ==> "This is a string, and this is more!"

jshell> System.out.print("My String is equal to " + myString);
My String is equal to This is a string, and this is more!

jshell> myString = "I wish I had \u20B910,00,000.00";
myString ==> "I wish I had ₹10,00,000.00"

# multi-line in jshell
jshell> {
   ...>     String numberString = "250.55";
   ...>     numberString = numberString + "49.45";
   ...>     System.out.print(numberString);
   ...> }
250.5549.45

jshell> String lastString = "10"; int myInt = 50;
lastString ==> "10"
myInt ==> 50

jshell> lastString = lastString + myInt;
lastString ==> "1050" # integers got concated

jshell> lastString = lastString + doubleNumber;
lastString ==> "1050137.65"
```

- In Java `+` symbol is an operator which can mean addition, if used for numbers. But it means concatenation when used with Strings
- `String` is immutable, i.e. we can't change a `String` after it is created. So when concatenations happen, they just don't ge appended to the end of the `String`. Java creates a new `String` internally. The old one will get discarded from the memory automatically
- The `StringBuilder` class is mutable, but it does not have special features of the String class like assinging String Literal or using the `+` operator

## Operators, Operands and Expressions

- Operators are special symbols which perform operations over multiple operands
- Expression is a formed by combining variables, literals, method return values and operators
- `+` with `char` - Work on the representative numbers

```sh
jshell> char first = 'A', second = 'B';
first ==> 'A'
second ==> 'B'

jshell> System.out.print(first + second);
131

jshell> System.out.print("" + first + second); # now it's a string
AB
```

| Operator | Numeric        | `char`         | `boolean` | `String`      |
| -------- | -------------- | -------------- | --------- | ------------- |
| `+`      | Addition       | Addition       | ×         | Concatenation |
| `-`      | Subtraction    | Subtraction    | ×         | ×             |
| `*`      | Multiplication | Multiplication | ×         | ×             |
| `/`      | Division       | Division       | ×         | ×             |
| `%`      | Modulo         | Modulo         | ×         | ×             |

## Abbreviating Operators

| Shorthand           | Example     |
| ------------------- | ----------- |
| Post-fix            | `result++`  |
| Compound Assignment | `result+=1` |

```sh
jshell> int result = 10;
result ==> 10

jshell> result = result - 5.5;
|  Error:
|  incompatible types: possible lossy conversion from double to int
|  result = result - 5.5;
|           ^----------^

jshell> result -= 5.5; // inplicit cast
$74 ==> 4
```

- `x -= y` = `x = (data type of x) (x-y)`
