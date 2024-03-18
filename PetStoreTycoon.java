// Zachary Bomke
// Main runner file

import java.util.Scanner;

// Color Variables
// These can be added to print statements to change the colors
final static String RESET = "\u001B[0m";
final static String BLACK = "\u001B[30m";
final static String GRAY = "\u001B[90m";

public class PetStoreTycoon {
    public static void main(String[] args) {
        // Set up user input
        Scanner input = new Scanner(System.in);

        // Create a shelter database
        animalShelter database = new animalShelter();
        while (true) {
            // Print out the menu list
            System.out.println("Main menu ------------");
            System.out.print(GRAY); // Set console color to gray
            System.out.println("[1] Print all shelter animals");
            System.out.println("[2] Print only shelter animals with chips");
            System.out.println("[3] Print only one species of animal");
            System.out.println("[4] Print only adoptable animals");
            System.out.println("[5] Print any animals needing surgery");
            System.out.println("[A] Sort the shelter database by time in shelter");
            System.out.println("[B] Sort the shelter database by microchip number");
            System.out.println("[C] Remove an animal from the database");
            System.out.println("[D] Add an animal to the database");
            System.out.println("[E] Modify an animal in the database");
            System.out.print(RESET); // Reset console color

            // Get command from user
            System.out.print("Enter a command > ");
            String command = input.nextLine();
            menuInterpretor(command, database);

        }
    }

    // Runs the correct methods based on the command from the user
    public static void menuInterpretor (String command, animalShelter database) {
        if (command.equals("1")) animalShelter.printAllAnimals(database);
    }
}
