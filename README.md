# Satellite Command System

The Satellite Command System is a Java-based program that simulates controlling a satellite in orbit. The program allows you to interact with the satellite by issuing commands to change its orientation, activate/deactivate solar panels, and collect data.

## Prerequisites

Before running the program, make sure you have the following:

- Java Development Kit (JDK) installed on your system.
- An Integrated Development Environment (IDE) or a command-line interface to run Java programs.

## Getting Started

1. Clone or download the repository from GitHub.

2. Open the project in your preferred Java development environment.

3. Compile and run the `Main.java` file to start the Satellite Command System.

To compile the program using the command line, use the following command:

```bash
javac Main.java
```
To run the program using the command line, use the following command:

```bash
java Main.java
```
## Usage

Upon running the program, you will see a console-based menu that allows you to interact with the satellite. Here are the available options:

1. **Rotate**: Change the satellite's orientation (North, South, East, West).
2. **Activate Panels**: Activate the solar panels.
3. **Deactivate Panels**: Deactivate the solar panels.
4. **Collect Data**: Collect data (only when solar panels are active).
5. **Exit**: Terminate the program.

Follow the on-screen prompts to enter your choices and input values.

## Command Pattern

The program uses the Command Pattern to encapsulate actions (commands) that can be executed on the satellite. Each command is represented by a class (`RotateCommand`, `ActivatePanelsCommand`, `DeactivatePanelsCommand`, and `CollectDataCommand`) that implements the `Command` interface.

## Error Handling

- Invalid input for directions and menu choices is handled gracefully, providing appropriate error messages and prompts for re-entry.
- Data collection is only possible when solar panels are active, and this condition is checked before collecting data.

## Code Structure

The code is organized into several classes:

- `Satellite`: Represents the satellite's state and behavior.
- `Command`: Defines the Command interface.
- Command classes (e.g., `RotateCommand`, `ActivatePanelsCommand`): Implement the Command interface.
- `Main`: Contains the user interface and the main program logic.

## Author

- Sohan S Shetty

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
