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
