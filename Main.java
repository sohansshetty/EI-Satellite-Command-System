// Main class contains the user interface for interacting with the satellite.
import java.util.Scanner;
import satellite.Satellite;
import command.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Satellite satellite = new Satellite();

        while (true) {
            // Display current state of the satellite.
            System.out.println("\nCurrent State:");
            System.out.println("Orientation: " + satellite.getOrientation());
            System.out.println("Solar Panels: " + (satellite.areSolarPanelsActive() ? "active" : "inactive"));
            System.out.println("Data Collected: " + satellite.getDataCollected());

            // Display menu options.
            System.out.println("\nMenu:");
            System.out.println("1. Rotate");
            System.out.println("2. Activate Panels");
            System.out.println("3. Deactivate Panels");
            System.out.println("4. Collect Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter direction (North/South/East/West): ");
                        String direction = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity
                        if (isValidDirection(direction)) {
                            Command rotateCommand = new RotateCommand(direction);
                            rotateCommand.execute(satellite);
                        } else {
                            System.out.println("Invalid direction. Please enter North, South, East, or West.");
                        }
                        break;

                    case 2:
                        Command activatePanelsCommand = new ActivatePanelsCommand();
                        activatePanelsCommand.execute(satellite);
                        break;

                    case 3:
                        Command deactivatePanelsCommand = new DeactivatePanelsCommand();
                        deactivatePanelsCommand.execute(satellite);
                        break;

                    case 4:
                        Command collectDataCommand = new CollectDataCommand();
                        collectDataCommand.execute(satellite);
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
    }

    // Helper method to validate direction input.
    private static boolean isValidDirection(String direction) {
        return direction.equals("north") || direction.equals("south") || direction.equals("east")
                || direction.equals("west");
    }
}