// Zachary Bomke
// Main runner file

import java.util.Scanner;

// Color Variables
// These can be added to print statements to change the colors of the console
final static String RESET = "\u001B[0m";
final static String BLACK = "\u001B[30m";
final static String GRAY = "\u001B[90m";
final static String RED = "\u001B[31m";
final static String CYAN = "\u001B[36m";
final static String BLUE = "\u001B[34m";
final static String GREEN = "\u001B[32m";
final static String YELLOW = "\u001B[33m";
final static String BG_BLACK  = "\u001B[100m";

public class PetStoreTycoon {
    // Set up user input program wide
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) { 

        // Create a shelter database
        animalShelter shelter = new animalShelter();

        while (true) { // Main menu loop

            // Print out the menu list
            // Menu options are colored blue for print, green for sort, and yellow for modification. Description in gray, main action in black.
            System.out.println("Main menu -----------------");
            System.out.println(BLUE + "[1]" + RESET + " Print" + GRAY + " all shelter animals");
            System.out.println(BLUE + "[2]" + RESET + " Print" + GRAY + " only shelter animals with chips");
            System.out.println(BLUE + "[3]" + RESET + " Print" + GRAY + " only one species of animal");
            System.out.println(BLUE + "[4]" + RESET + " Print" + GRAY + " only adoptable animals");
            System.out.println(BLUE + "[5]" + RESET + " Print" + GRAY + " any animals needing surgery");
            System.out.println(GREEN + "[A]" + RESET + " Sort" + GRAY + " the shelter database by time in shelter");
            System.out.println(GREEN + "[B]" + RESET + " Sort" + GRAY + " the shelter database by microchip number");
            System.out.println(YELLOW + "[C]" + RESET + " Remove" + GRAY + " an animal from the database");
            System.out.println(YELLOW + "[D]" + RESET + " Add" + GRAY + " an animal to the database");
            System.out.println(YELLOW + "[E]" + RESET + " Modify" + GRAY + " an animal in the database");
            System.out.print(RESET); // Reset console colors

            // Get command from user
            System.out.print("Enter a command > " + CYAN); // User input in cyan
            String command = input.nextLine();
            System.out.print(RESET); // Clear cyan color
            menuInterpretor(command, shelter);

        }
    }

    // Runs the correct methods based on the command from the user
    public static void menuInterpretor (String command, animalShelter shelter) {
        if (command.equals("1")) shelter.printAllAnimals();
        else if (command.equals("3")) {
            // Ask the user for the species and run the printLostOfSpecies function on that input
            System.out.print("What species do you want to filter? > " + CYAN); // User input in cyan
            String species = input.nextLine();
            System.out.print(RESET); // Clear cyan color
            shelter.printSpecies(species);
        }
        
        else System.out.println(RED + "Command not found" + RESET);
    }
}
