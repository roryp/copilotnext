## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Tic Tac Toe Game

This is a simple Tic Tac Toe game built using Java Swing. The project was developed using the GitHub Copilot Edits agent, which assisted in creating and refining the code.

### Project Structure

- **src/**: Contains the Java source code for the application.
- **lib/**: Contains external libraries or dependencies (if any).
- **bin/**: The directory where compiled class files are stored.

### How to Build and Run

1. Open a terminal in the project directory (`c:\dev\copilotnext\copilotnext`).

2. Compile the source code using the following command:

   ```sh
   javac -d bin src\App.java
   ```

   This will compile the code and place the output classes in the `bin` directory.

3. Run the application with the command:

   ```sh
   java -cp bin App
   ```

   The application uses a graphical interface, so a window should open displaying the Tic Tac Toe board.

### How It Works

- The application uses Java Swing to create a window with a 3x3 grid representing the Tic Tac Toe board.
- Each cell is a button that players can click to mark their move.
- The game checks for a win or a tie after every move and shows a dialog with the result.
- When a win or tie is detected, the board is reset automatically.

### Notes

- The project was built and refined using the GitHub Copilot Edits agent, demonstrating the power of AI-assisted development.
- The code is structured to separate the game logic from the UI logic, making it easier to maintain and enhance.

Enjoy the game!
