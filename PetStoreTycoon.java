// Zachary Bomke
// Main runner file

import java.util.Scanner;

// Color Variables
// These can be added to print statements to change the colors of the console
private final static String RESET = "\u001B[0m";
private final static String BLACK = "\u001B[30m";
private final static String GRAY = "\u001B[90m";
private final static String RED = "\u001B[31m";
private final static String CYAN = "\u001B[36m";
private final static String BLUE = "\u001B[34m";
private final static String GREEN = "\u001B[32m";
private final static String YELLOW = "\u001B[33m";
private final static String BG_BLACK  = "\u001B[100m";

public static class PetStoreTycoon {
    // Set up user input program wide
    static Scanner input = new Scanner(System.in);

    // Create a shelter database
    static animalShelter shelter = new animalShelter();
    
    public static void main(String[] args) { 
        // Notice
        System.out.println("Note: Menu items with letters should be typed in lowercase");

        // Populate the shelter with default animals
        PopulateArray();

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
            menuInterpretor(command);

        }
    }

    // Runs the correct methods based on the command from the user
    public static void menuInterpretor (String command) {

        // menu workings
        if (command.equals("1")) shelter.printAllAnimals(); // menu for printing all animals

        else if (command.equals("2")) shelter.printChip(); // menu for printing animals with chips

        else if (command.equals("3")) {
            // Ask the user for the species and run the printLostOfSpecies function on that input
            System.out.print("What species do you want to filter? > " + CYAN); // User input in cyan
            String species = input.nextLine();
            System.out.print(RESET); // Clear cyan color
            shelter.printSpecies(species);
        }

        else if (command.equals("4")) shelter.printAdoptables(); // menu for only adoptables

        else if (command.equals("d")) addAnimal();

        else if (command.equals("e")){
            System.out.println("Name or Microchip Data of Animal To Be Changed");
            String animalModified = input.nextLine();
            System.out.println("What data would you like to change?");
            System.out.println("[Name][Type][Age][Tag][Fixed][Days In][Microchip]");
            String modifier = input.nextLine();
            System.out.println("New Data:");
            String newData = input.nextLine();
            shelter.modifyAnimal(animalModified, modifier, newData);
        }


        else System.out.println(RED + "Command not found" + RESET);
    }

    public static void PopulateArray() {
        // 5 dogs, 10 cats, 5 other
        shelter.addDog("Scout", 12, 780701625, true, true);
        shelter.addCat("Mateo", 4, 831462500, true, true);
        shelter.addCat("Maxwell", 13, 586892107, true, false);
        shelter.addCat("Eric", 16, 806542905, false, true);
        shelter.addCat("Ethan", 16, 604164455, false, false);
        
        shelter.addCat("Joshua", 16, 950646549, true, true);
        shelter.addCat("Joseph Robinette Biden Jr.", 900, 115959804, true, false);
        shelter.addAnimal("Tonald Dohn Jrump", 77, 363881057, false, false);
        shelter.addAnimal("Jordan Belfort", 4, 999127588, false, true);
        shelter.addDog("Tangerine", 8, 557742143, true, true);
        
        shelter.addDog("Meatball", 2, 458513048, false, true);
        shelter.addDog("Jack", 3, 180869070, false, true);
        shelter.addCat("Keivan", 17, 332915636, true, false);
        shelter.addCat("Gribber", 16, 379827576, true, true);
        shelter.addAnimal("Justin", 17, 613340565, true, false);

        shelter.addAnimal("Waltuh", 66, 189156965, false, true);
        shelter.addCat("Gambit", 4, 425378256, true, true);
        shelter.addCat("Rocket", 6, 934488781, true, true);
        shelter.addAnimal("Bryan", 43, 778949110, true, true);
        shelter.addDog("Robin", 3, 518650274, true, true);
        
    }
    public static void addAnimal() {
        System.out.println("Add animal ----------------");
        System.out.println("There are " + shelter.getTotal());
        System.out.print("What type of animal? > " + CYAN);
        System.out.println(BLUE + "[1]" + RESET + " Cat");
        System.out.println(RED + "[2]" + RESET + " Dog");
        System.out.println(GREEN + "[3]" + RESET + " Other");
        int typeInt = input.nextInt();
        if (typeInt == 1) {
            System.out.print("What's its name? > " + CYAN);
            String name = input.nextLine();

            System.out.print("How old is it? > " + CYAN);
            int age = input.nextInt();

            System.out.print("Enter a microchip if available > " + CYAN);
            int chip = input.nextInt();

            boolean fixed;
            System.out.print("Is the animal fixed? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) {
                fixed = true;
            } else {
                fixed = false;
            }

            boolean surrendered;
            System.out.print("Was the animal surrendered? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) {
                surrendered = true;
            } else {
                surrendered = false;
            }

            System.out.println(RESET + "Adding the cat to the database...");
            shelter.addCat(name,age,chip,fixed,surrendered);
            
        }
        if (typeInt == 2) {
            System.out.print("What's its name? > " + CYAN);
            String name = input.nextLine();

            System.out.print("How old is it? > " + CYAN);
            int age = input.nextInt();

            System.out.print("Enter a microchip if available > " + CYAN);
            int chip = input.nextInt();

            boolean fixed;
            System.out.print("Is the animal fixed? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) {
                fixed = true;
            } else {
                fixed = false;
            }

            boolean surrendered;
            System.out.print("Was the animal surrendered? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) {
                surrendered = true;
            } else {
                surrendered = false;
            }

            System.out.println(RESET + "Adding the dog to the database...");
            shelter.addDog(name,age,chip,fixed,surrendered);
        }
        if (typeInt == 3) {
            System.out.print("What's its name? > " + CYAN);
            String name = input.nextLine();

            System.out.print("How old is it? > " + CYAN);
            int age = input.nextInt();

            System.out.print("Enter a microchip if available > " + CYAN);
            int chip = input.nextInt();

            boolean fixed;
            System.out.print("Is the animal fixed? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) {
                fixed = true;
            } else {
                fixed = false;
            }

            boolean surrendered;
            System.out.print("Was the animal surrendered? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) {
                surrendered = true;
            } else {
                surrendered = false;
            }

            System.out.println(RESET + "Adding the animal to the database...");
            shelter.addAnimal(name,age,chip,fixed,surrendered);
            
        }
    }
}
