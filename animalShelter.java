import java.util.ArrayList;

public class animalShelter {
    private ArrayList<shelterAnimal> database = new ArrayList<shelterAnimal>(); // Create the database
    private int totalAnimals;
    private int numDogs;
    private int numCats;

    // Print all animals in the shelter
    public void printAllAnimals() {
        for (int i = 0; i < database.size(); i++) {
            System.out.println(" | " + i + ": " + database.get(i));
        }
    }

    // Print all shelter animals that are chipped
    public void printChip() {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).getChip() != -1) {
                System.out.println(" | " + i + ": " + database.get(i));
            }
        }
    }

    // Print all shelter animals of a specific species
    public void printSpecies(String species) {
        if (species.equals("dog")) {
            for (int i = 0; i < database.size(); i++) {
                if (!(database.get(i) instanceof Dog))
                    continue; // If the animal is not a dog, skip this
                System.out.println(" | " + i + ": " + database.get(i));

            }
        } else if (species.equals("cat")) {
            for (int i = 0; i < database.size(); i++) {
                if (!(database.get(i) instanceof Cat))
                    continue; // If the animal is not a cat, skip this
                System.out.println(" | " + i + ": " + database.get(i));
            }
        } else { // Print all other animals
            for (int i = 0; i < database.size(); i++) {
                if (!(database.get(i) instanceof Dog))
                    continue; // If the animal is a dog or cat, skip this
                System.out.println(" | " + i + ": " + database.get(i));
            }
        }
    }

    // print all shelter animals that aren't fixed
    public void printNonFixed() {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).isFixed())
                continue; // If the animal is fixed, skip it
            System.out.println(" | " + i + ": " + database.get(i));
        }
    }

    // printing all adoptable animals
    public void printAdoptables() {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).isAdoptable()) {
                System.out.println(" | " + i + ": " + database.get(i));
            }
        }
    }

    // Function to create an other animal
    public void addAnimal(String name, int animalAge, int microchip, boolean isFixed, boolean isSurrendered, int time) {
        shelterAnimal newAnimal = new shelterAnimal(name, animalAge, microchip, isFixed, isSurrendered, time);
        database.add(newAnimal);
        totalAnimals++;
    }

    // Function to create a cat
    public void addCat(String name, int animalAge, int microchip, boolean isFixed, boolean isSurrendered, String eyeColor, String type, boolean outdoor, int time) {
        Cat newCat = new Cat(name, animalAge, microchip, isFixed, isSurrendered, eyeColor, type, outdoor, time);
        database.add(newCat);
        totalAnimals++;
        numCats++;
    }

    // Function to create an other animal
    public void addDog(String name, int animalAge, int microchip, boolean isFixed, boolean isSurrendered, String breed, String color, boolean friendly, int time) {
        Dog newDog = new Dog(name, animalAge, microchip, isFixed, isSurrendered, breed, color, friendly, time);
        database.add(newDog);
        totalAnimals++;
        numDogs++;
    }

    public int getTotal() {
        return totalAnimals;
    }

    public int getTotalDogs() {
        return numDogs;
    }

    public int totalCat() {
        return numCats;
    }

    // removing the animal
    public void removeAnimal(int id) {
        totalAnimals--;
        if (database.get(id) instanceof Cat)
            numCats--;
        else if (database.get(id) instanceof Dog)
            numDogs--;
        database.remove(id);
    }
    public shelterAnimal getAnimal(int index) {
        return database.get(index);
    }
    // modifying animal
    public void modifyAnimal(int id, String modifier, String newData) {
        shelterAnimal animal = database.get(id);
        
        if (modifier.equals("exit")) return;
        else if (modifier.equals("n")) animal.setName(newData);                                 // Modify name
        else if (modifier.equals("a")) animal.setAge(Integer.parseInt(newData));                // Modify age
        else if (modifier.equals("f")) animal.setFixed(Boolean.parseBoolean(newData));          // Modify fixed
        else if (modifier.equals("d")) animal.setDays(Integer.parseInt(newData));               // Modify days in
        else if (modifier.equals("s")) animal.setSurrendered(Boolean.parseBoolean(newData));    // Modify fixed
        else if (modifier.equals("m")) animal.setChip(Integer.parseInt(newData));               // Modify chip data

        else if (animal instanceof Cat) {                                                       // For cat specific data ---
            if (modifier.equals("e")) ((Cat)animal).setCatEye(newData);                         // Modify eye
            if (modifier.equals("t")) ((Cat)animal).setCatType(newData);                        // Modify type
            if (modifier.equals("o")) ((Cat)animal).setOutdoor(Boolean.parseBoolean(newData));  // Modify outdoor
        }
        else if (animal instanceof Dog) {                                                       // For dog specific data ---
            if (modifier.equals("b")) ((Dog)animal).setBreed(newData);                          // Modify breed
            if (modifier.equals("e")) ((Dog)animal).setColor(newData);                          // Modify color
            if (modifier.equals("f")) ((Dog)animal).setFriendly(Boolean.parseBoolean(newData)); // Modify friendly
        }   
        else System.out.println("\u001B[31m"+ "Warning: No data was modified. Please check your responses!" + "\u001B[0m"); // Warn if 
        System.out.println("\u001B[0m" + "Updated animal: " + "\u001B[90m");
        animal.print();
    }

    // sort animals in order of time in shelter(shortest to longest)
    public void printDaysSort(String spaceColor, String regColor, String RESET) {
        for (int i = 0; i < database.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < database.size(); j++) {
                if (database.get(j).getDays() < database.get(minIndex).getDays()) {
                    minIndex = j;
                }
                shelterAnimal temp = database.get(minIndex);
                shelterAnimal current = database.get(i);
                database.set(minIndex, current);
                database.set(i, temp);
            }
        }

        for (int i = 0; i < database.size(); i++) { // printing all animals sorted
            // printing name of animal
            System.out.println(regColor + "Name: " + (database.get(i).getName()));

            // checking if its a cat, dog, or other, and printing type
            System.out.print("Type: ");
            if (database.get(i) instanceof Cat)
                System.out.println(((Cat) database.get(i)).getCatType());
            else if (database.get(i) instanceof Dog)
                System.out.println(((Dog) database.get(i)).getDogBreed());
            else
                System.out.println("Other");

            // printing position in database
            System.out.println("New Position: " + i);

            // printing days in shelter
            System.out.println("Days In Shelter: " + (database.get(i).getDays()));

            // spacer
            System.out.println(spaceColor + "---------------------------" + RESET);
        }
    }

    public void printChipSort(String spaceColor, String regColor, String RESET) {
        for (int i = 1; i < database.size(); ++i) {
            int key = database.get(i).getChip();
            int j = i - 1;
            while (j >= 0 && database.get(j).getChip() > key) {
                database.set(j+1, database.get(j));
                j--;
            }
            database.get(j + 1).setChip(key);
        }

        for (int i = 0; i < database.size(); i++) { // printing all animals sorted
            // printing name of animal
            System.out.println(regColor + "Name: " + (database.get(i).getName()));

            // checking if its a cat, dog, or other, and printing type
            System.out.print("Type: ");
            if (database.get(i) instanceof Cat)
                System.out.println(((Cat) database.get(i)).getCatType());
            else if (database.get(i) instanceof Dog)
                System.out.println(((Dog) database.get(i)).getDogBreed());
            else
                System.out.println("Other");

            // printing position in database
            System.out.println("New Position: " + (i+1));

            // printing chip data
            System.out.println("Chip data: " + (database.get(i).getChip()));

            // spacer
            System.out.println(spaceColor + "---------------------------" + RESET);
        }
    }
}