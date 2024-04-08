// Zachary Bomke
// Main runner file

import java.util.Scanner;

public class PetStoreTycoon {
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
            System.out.println(GRAY + "Main menu -----------------");
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

        else if (command.equals("5")) shelter.printNonFixed();

        else if (command.equals("a")) shelter.printDaysSort(BLUE, GRAY, RESET); // menu for sorting by days

        else if (command.equals("b")) shelter.printChipSort(BLUE, GRAY, RESET); // meun for sorting by chip data

        else if (command.equals("c")) {
            shelter.printAllAnimals();
            System.out.print("Enter the # corresponding to the animal you would like to remove, or -1 to cancel > " + CYAN);
            int remove = input.nextInt(); input.nextLine();
            if (remove == -1) return;
            shelter.removeAnimal(remove);
        }

        else if (command.equals("d")) addAnimal(); // Move to the addAnimal function

        else if (command.equals("e")) {
            shelter.printAllAnimals();
            System.out.print("Enter the # corresponding to the animal you would like to modify, or -1 to cancel > " + CYAN);
            int modifyId = input.nextInt(); input.nextLine();
            if (modifyId == -1) return;
            System.out.println("What data would you like to change?");
            System.out.println("[name][type][age][tag][fixed][days in][microchip]");
            String modifier = input.nextLine();
            System.out.println("New Data:");
            String newData = input.nextLine();
            shelter.modifyAnimal(modifyId, modifier, newData);
        }

        else System.out.println(RED + "Command not found" + RESET);
    }

    public static void PopulateArray() {
        // 5 dogs, 10 cats, 5 other
        shelter.addDog("Scout", 12, 780701625, true, true, "Mutt", "black and white", false, 5);
        shelter.addCat("Mateo", 4, 831462500, true, true, "green", "Tabby", false, 7);
        shelter.addCat("Maxwell", 13, 586892107, true, false, "green", "tuxedo", true, 8);
        shelter.addCat("Eric", 16, 806542905, false, true, "blue", "white", true, 2);
        shelter.addCat("Ethan", 16, 604164455, false, false, "blue", "black", true, 20);
        
        shelter.addCat("Joshua", 16, 950646549, true, true, "hazel", "Tabby", true, 15);
        shelter.addCat("Joseph Robinette Biden Jr.", 900, 115959804, true, false, "hazel", "black", false, 72);
        shelter.addAnimal("Tonald Dohn Jrump", 77, 363881057, false, false, 19);
        shelter.addAnimal("Jordan Belfort", 4, 999127588, false, true, 5);
        shelter.addDog("Tangerine", 8, 557742143, true, true, "australian sheperd", "brown", true, 0);
        
        shelter.addDog("Meatball", 2, 458513048, false, true, "pug", "brown", true, 1);
        shelter.addDog("Jack", 3, 180869070, false, true, "lab", "brown", true, 4);
        shelter.addCat("Keivan", 17, 332915636, true, false, "green", "black", true, 19);
        shelter.addCat("Gribber", 16, 379827576, true, true, "blue", "tuxedo", false, 3);
        shelter.addAnimal("Justin", 17, 613340565, true, false, 0);

        shelter.addAnimal("Waltuh", 66, 189156965, false, true, 232);
        shelter.addCat("Gambit", 4, 425378256, true, true, null, null, false, 1);
        shelter.addCat("Rocket", 6, 934488781, true, true, null, null, false, 1);
        shelter.addAnimal("Bryan", 43, 778949110, true, true, 999);
        shelter.addDog("Robin", 3, 518650274, true, true, null, "brown", true, 8);
        
    }
    public static void addAnimal() {
        System.out.println("Add animal ----------------");
        System.out.println("There are " + shelter.getTotal() + " animals in the shelter");
        if (shelter.getTotal() >= 20) {
            System.out.println(RED + "There is no space for more animals. Please remove one and try again." + RESET); return;
        }
        System.out.println("What type of animal?");
        System.out.println(BLUE + "[1]" + RESET + " Cat");
        System.out.println(RED + "[2]" + RESET + " Dog");
        System.out.println(GREEN + "[3]" + RESET + " Other");
        System.out.print(" > " + CYAN);
        int typeInt = input.nextInt(); input.nextLine();
        if (typeInt == 1) {
            System.out.print(RESET + "What's its name? > " + CYAN);
            String name = input.nextLine();

            System.out.print(RESET + "How old is it? > " + CYAN);
            int age = input.nextInt(); input.nextLine();

            System.out.print(RESET + "How long has it been in the shelter? > " + CYAN);
            int time = input.nextInt(); input.nextLine();

            System.out.print(RESET + "Enter a microchip if available or -1 if it is not > " + CYAN);
            int chip = input.nextInt(); input.nextLine();

            boolean fixed;
            System.out.print(RESET + "Is the cat fixed? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) fixed = true;
            else fixed = false;

            boolean surrendered;
            System.out.print(RESET + "Was the cat surrendered? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) surrendered = true; 
            else surrendered = false;

            System.out.print(RESET + "Enter the eye color > " + CYAN);
            String eyeColor = input.nextLine();

            System.out.print(RESET + "Enter the type > " + CYAN);
            String type = input.nextLine();

            boolean outdoor;
            System.out.print(RESET + "Was the cat an outdoor cat? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) outdoor = true;
            else outdoor = false;

            System.out.println(RESET + "Adding the cat to the database...");
            shelter.addCat(name,age,chip,fixed,surrendered,eyeColor,type,outdoor, time);
            
        }
        if (typeInt == 2) {
            System.out.print(RESET + "What's its name? > " + CYAN);
            String name = input.nextLine();

            System.out.print(RESET + "How old is it? > " + CYAN);
            int age = input.nextInt(); input.nextLine();

            System.out.print(RESET + "How long has it been in the shelter? > " + CYAN);
            int time = input.nextInt(); input.nextLine();

            System.out.print(RESET + "Enter a microchip if available > " + CYAN);
            int chip = input.nextInt(); input.nextLine();

            boolean fixed;
            System.out.print(RESET + "Is the dog fixed? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) fixed = true;
            else fixed = false;

            boolean surrendered;
            System.out.print(RESET + "Was the dog surrendered? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) surrendered = true; 
            else surrendered = false;

            System.out.print(RESET + "Enter the breed > " + CYAN);
            String breed = input.nextLine();

            System.out.print(RESET + "Enter the color > " + CYAN);
            String color = input.nextLine();

            boolean friendly;
            System.out.print(RESET + "Is the dog friendly? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) friendly = true;
            else friendly = false;

            System.out.println(RESET + "Adding the dog to the database...");
            shelter.addDog(name,age,chip,fixed,surrendered,breed,color,friendly, time);
        }
        if (typeInt == 3) {
            System.out.print(RESET + "What's its name? > " + CYAN);
            String name = input.nextLine();

            System.out.print(RESET + "How old is it? > " + CYAN);
            int age = input.nextInt(); input.nextLine();

            System.out.print(RESET + "How long has it been in the shelter? > " + CYAN);
            int time = input.nextInt(); input.nextLine();

            System.out.print(RESET + "Enter a microchip if available > " + CYAN);
            int chip = input.nextInt(); input.nextLine();

            boolean fixed;
            System.out.print(RESET + "Is the animal fixed? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) fixed = true;
            else fixed = false;

            boolean surrendered;
            System.out.print(RESET + "Was the animal surrendered? (Y, N) > " + CYAN);
            if (input.nextLine().equals("y")) surrendered = true; 
            else surrendered = false;

            System.out.println(RESET + "Adding the animal to the database...");
            shelter.addAnimal(name,age,chip,fixed,surrendered, time);
            
        }
    }
}
