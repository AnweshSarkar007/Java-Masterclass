# Section 05 - Expressions, Statements and More

## Keywords and Expressions

- Java has 51 reserved keywords
- [Java Language Specifications | Lexical Structure | Keywords](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9)
- Keywords cant be used as variable names
- Expression: An expression computes a single values
- Statement: Statements are stand alone units of work
- Code Block: A code block is a set of zero, one or more statements, usually grouped together in some way to achieve a single goal

```java
public class Main {
    public static void main(String[] args) {
        double kilometers = (10 * 1.609344);

        int highScore = 50;
        if (highScore > 25) {
            highScore = 1000 + highScore; // add bonus points
        }

        int health = 100;
        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}
```

## Statements, Whitespace and Indentation

- Semicolons are needed for lines to form statements
- Statements can be multi-lines too

```java
System.out.println("This is" +
                " another" +
                " and still more!");
```

- Whitespace and Indentation makes code readable. Java ignores whitespace while compiling
- [Google Java Style Guide | Whitespace](https://google.github.io/styleguide/javaguide.html#s4.6-whitespace)
- Use Code > reformat code or `⌘ + ⌥ + L` to format the code in IntelliJ

## If/Else

```java
public class KeywordsAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else if (score > 5000) {
            System.out.println("Your score was greater than 5000");
        } else {
            System.out.println("Your score was equal to 5000");
        }
    }
}
```

## If/Else Challenge

```java
public class IfElseChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;
        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was "+ finalScore);
        }
    }
}
```

## Methods

- A method declares executable code that can be invoked, passing a fixed number of values as arguments
- It reduces code duplication
- Can be run multiple times with different inputs and getting new outputs

```java
public static dataType methodName(p1type p1, p2type p2, {more}) {
  // method body
  return ...
}
```

- We can't have a method inside a method
- We cant have a method outside a class
- Parameter is the definition as shown in the method declaration and Argument is the value that's passed to the method when we call it

```java
public class Methods {
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    public static void main(String[] args) {
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = calculateScore(true, 800, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
        System.out.println("Your final score was " +
                calculateScore(true, 10_000, 5, 200));
    }
}

```

- A method can be executed as a statement. A method that returns a value can be used as an expression or a part of an expression
- If a method declares a non-void return type, then return is required from every exit points. One common practice is to define the default return type in the starting and only have one return statement
- Java doesn't support default values for parameters
- `main` is actually method! JVM looks for it to run the Java program. `args` represent command line arguments

## Methods Challenge

```java
public class MethodsChallenge {
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position "
                + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        displayHighScorePosition("A", calculateHighScorePosition(1500));
        displayHighScorePosition("B", calculateHighScorePosition(1000));
        displayHighScorePosition("C", calculateHighScorePosition(500));
        displayHighScorePosition("D", calculateHighScorePosition(100));
        displayHighScorePosition("E", calculateHighScorePosition(25));
    }
}

```

## Method Overloading

- When name of the method is same, but the number or types of the arguments are different.
- Java can resolve which method is to execute, based on the arguments passed
- Method Signature consists of the name of the method and the uniquness of the declaration of it's parameters (number of parameters, types and order). The method's return type or the parameter names are not part of the signature.
- A unique method signature is the key for Java to determine if the method has been overloaded correctly

```java
public class MethodOverloading {
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500 );
        System.out.println("New score is " + newScore);

        calculateScore(75);

        calculateScore();
    }
}
```

## Method Overloading Challenge

```java
public class MethodOverloadingChallenge {
    public static double convertToCentimeters(int inches) {
        return 2.54 * inches;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((12 * feet) + inches);
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));
    }
}
```
