# Hero Level Classifier

## Project Description

This project was developed as part of a hands-on programming logic challenge on DIO, with the goal of classifying heroes based on their experience points (XP) using the Java programming language.

## Objective

Implement an algorithm that determines a hero's level based on predefined XP ranges and displays a message containing the hero's name and achieved level.

## Concepts Applied

- **Variables and data types:** Use of `String` to store text and `int` to represent the hero's experience points.
- **Relational operators:** Use of the `<` and `<=` operators to evaluate XP ranges.
- **Conditional statements:** Use of `if`, `else if`, and `else` to determine the corresponding level.
- **Loops:** Use of `while` to demonstrate condition-based flow control.
- **String comparison:** Use of the `equals()` method to compare the value of the loop control variable.
- **String formatting:** Use of `String.format()` and the `%s` format specifier to construct a readable output message.
- **Console output:** Use of `System.out.println()` to display the result.

## How It Works

The program initializes variables with the hero's name and XP value. It then evaluates the experience ranges using conditional statements and assigns the corresponding level to the `nivel` variable.

After determining the hero's level, the program uses `String.format()` to build the final message and `System.out.println()` to display it in the console.

The `while` loop demonstrates how repetition works based on the value of the `continuar` control variable. In the current implementation, the loop executes only once because the variable is assigned the value `"não"` at the end of the iteration.

## Sample Output

`O Herói de nome Luan está no nível de Platina`

## Technologies

- Java
- Git and GitHub

## Key Learnings

This project reinforces fundamental programming logic concepts and their application in Java, including variable declarations, relational operators, conditional statements, loops, and string formatting. It also helps develop an understanding of the syntactic differences between JavaScript and Java.

## Technical Notes and Future Improvements

The current implementation uses predefined values for the hero's name and experience points (XP). The `while` loop was included to demonstrate flow control through repetition structures and terminates after a single iteration when the `continuar` control variable is updated.

Potential future improvements include:

- **Dynamic input:** Use the `Scanner` class to allow users to enter the hero's name and XP value during program execution.
- **Multiple entries:** Adapt the `while` loop to support classifying multiple heroes in a single execution.
- **Exit control:** Implement an interactive exit condition that allows users to decide when to terminate the program.
- **Input validation:** Ensure that the entered XP value is valid and handle inputs that do not match the expected data type.
- **Code organization and reusability:** Encapsulate the classification logic in a dedicated method to improve readability, maintainability, and code reuse.
