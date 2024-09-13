# JShell

**JShell** is a tool introduced in **Java 9** that provides a **REPL** (Read-Eval-Print Loop) environment for Java. It allows you to run Java code **line by line**, or in small chunks, without the need to create a complete program or a `main` method.

### Key Points of JShell:

1. **Immediate Feedback**:
   - In a normal Java program, you write code, compile it, and then run it to see the result. But in JShell, you can enter individual lines of code and see the result instantly. This makes it ideal for quickly testing out small pieces of code or learning Java.
   
2. **Interactive Console**:
   - You can type Java code directly into JShell and it will execute immediately, providing feedback. This interactive environment is similar to what you might see in Python or JavaScript consoles.

3. **Simple Usage**:
   - No need to create a class or method to run code. You can write expressions, variable declarations, and even full methods directly in the JShell.
   
   Example:
   ```bash
   jshell> int x = 10;
   jshell> System.out.println(x * 2);
   ```

4. **Testing and Prototyping**:
   - JShell is perfect for testing small pieces of code without having to go through the entire process of creating a new Java project, writing a class, compiling, and running. It is a fast and easy way to test Java syntax or libraries.

5. **State Preservation**:
   - Variables and methods you define in JShell persist throughout your session, meaning you can refer to them later without having to redefine them.

   Example:
   ```bash
   jshell> int y = 5;
   jshell> int z = y + 10;
   jshell> System.out.println(z);  // Output: 15
   ```

6. **Autocompletion**:
   - JShell offers autocompletion, so you can quickly find methods, classes, and variables just by typing a few characters and pressing `Tab`.

7. **Error Reporting**:
   - If you make a mistake, JShell tells you what went wrong immediately, so you can fix errors quickly without needing to rerun your program.

8. **Exploration of APIs**:
   - JShell is an excellent tool for exploring Java's vast libraries and APIs, making it easier for you to learn new classes and methods interactively.

### How to Start JShell:

1. **Opening JShell**:
   - First, make sure you have **JDK 9 or later** installed.
   - To start JShell, simply type `jshell` in your terminal or command prompt and hit enter.

2. **Writing Code**:
   - Once inside, you can write any Java statement or expression.
   
3. **Saving and Loading**:
   - You can save your JShell session to a file using the `-save` option and load previous sessions with `-open`.

### Example Session in JShell:
```bash
jshell> int a = 3;
a ==> 3

jshell> int b = 7;
b ==> 7

jshell> a + b;
$3 ==> 10

jshell> String message = "Hello, JShell!";
message ==> "Hello, JShell!"

jshell> System.out.println(message);
Hello, JShell!
```

### Use Cases:
- **Learning Java**: JShell is great for beginners who want to experiment with Java concepts in small steps.
- **Testing Code Snippets**: Developers can use JShell to quickly test a block of code or algorithm without needing to set up a full project.
- **Exploring New Libraries**: It helps you explore the functionality of unfamiliar libraries and APIs without full-scale project setup.

JShell offers several built-in commands that make it easy to manage your coding session. These commands begin with a `/` and are designed to interact with your JShell environment.

### Complete List of JShell Commands:

1. **`/help`**:  
   - **Purpose**: Provides help and information about available commands in JShell.
   - **Usage**:  
     ```bash
     /help
     ```
   - This command can be followed by specific topics for more details, e.g., `/help intro`, `/help /list`.

2. **`/vars`**:  
   - **Purpose**: Displays all the variables that have been declared during the session.
   - **Usage**:  
     ```bash
     /vars
     ```

3. **`/methods`**:  
   - **Purpose**: Lists all the methods defined in the current JShell session.
   - **Usage**:  
     ```bash
     /methods
     ```

4. **`/types`**:  
   - **Purpose**: Shows the classes and interfaces you’ve defined in your session.
   - **Usage**:  
     ```bash
     /types
     ```

5. **`/list`**:  
   - **Purpose**: Lists all snippets (code statements or expressions) that you have entered in the current session.
   - **Usage**:  
     ```bash
     /list
     ```
   - You can add specific options to narrow down the list, such as `/list -all` for all snippets, or `/list <id>` to show the snippet with a specific ID.

6. **`/save`**:  
   - **Purpose**: Saves the current JShell session to a file, allowing you to resume it later.
   - **Usage**:  
     ```bash
     /save <filename>
     ```
   - Example:
     ```bash
     /save mySession.jsh
     ```

7. **`/open`**:  
   - **Purpose**: Loads a previously saved JShell session.
   - **Usage**:  
     ```bash
     /open <filename>
     ```
   - Example:
     ```bash
     /open mySession.jsh
     ```

8. **`/exit`**:  
   - **Purpose**: Exits the current JShell session.
   - **Usage**:  
     ```bash
     /exit
     ```

9. **`/reset`**:  
   - **Purpose**: Clears the JShell session, resetting it to a blank state, removing all variables, methods, and types.
   - **Usage**:  
     ```bash
     /reset
     ```

10. **`/reload`**:  
    - **Purpose**: Reloads previously defined snippets that may have been invalidated (e.g., due to errors or changes in other code).
    - **Usage**:  
      ```bash
      /reload
      ```

11. **`/drop`**:  
    - **Purpose**: Deletes a specific snippet, variable, method, or class by its ID.
    - **Usage**:  
      ```bash
      /drop <id>
      ```
    - Example:
      ```bash
      /drop 2
      ```

12. **`/edit`**:  
    - **Purpose**: Opens an editor within JShell to modify previously entered code.
    - **Usage**:  
      ```bash
      /edit <id>
      ```

13. **`/history`**:  
    - **Purpose**: Displays the history of the commands you’ve entered.
    - **Usage**:  
      ```bash
      /history
      ```

14. **`/set`**:  
    - **Purpose**: Modifies the behavior of JShell settings.
    - **Usage**:  
      ```bash
      /set <option>
      ```
    - Example of setting an option:
      ```bash
      /set feedback verbose
      ```
    - Common options:
      - **feedback**: Controls how much feedback you get after running commands (e.g., `normal`, `verbose`).
      - **format**: Sets the format for displaying results (e.g., `json`, `normal`).

15. **`/!`**:  
    - **Purpose**: Re-executes a previous command from the history by its number.
    - **Usage**:  
      ```bash
      /! <n>
      ```
    - Example:
      ```bash
      /! 5  # Re-runs the 5th command in the history
      ```

16. **`/replay`**:  
    - **Purpose**: Re-executes all or specific parts of your session, such as snippets that have been invalidated.
    - **Usage**:  
      ```bash
      /replay
      ```

17. **`/env`**:  
    - **Purpose**: Displays the current environment configuration in JShell.
    - **Usage**:  
      ```bash
      /env
      ```

18. **`/classpath`**:  
    - **Purpose**: Adds JAR files or directories to JShell’s classpath, so you can use external libraries in your session.
    - **Usage**:  
      ```bash
      /classpath <path>
      ```

19. **`/imports`**:  
    - **Purpose**: Displays or manages the imported packages in the current JShell session.
    - **Usage**:  
      ```bash
      /imports
      ```

20. **`/debug`**:  
    - **Purpose**: Enables or disables debug mode, which provides more detailed output about errors or issues in your session.
    - **Usage**:  
      ```bash
      /debug
      ```

### Example JShell Command Usage:
```bash
jshell> int x = 5;
x ==> 5

jshell> /list
   1 : int x = 5;

jshell> /edit 1
// Now edit the code for snippet 1

jshell> /drop 1
// Drops the first snippet, removing the variable 'x'
```

In summary, **JShell** is a powerful, interactive tool that simplifies the process of testing, learning, and experimenting with Java code, especially when you want instant feedback and are not building a full application.