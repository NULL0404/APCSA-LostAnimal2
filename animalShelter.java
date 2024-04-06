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
                if (!(database.get(i) instanceof Dog)) continue; // If the animal is not a dog, skip this
                System.out.println(" | " + i + ": " + database.get(i));
                
            }
        }
        else if (species.equals("cat")) {
            for (int i = 0; i < database.size(); i++) {
                if (!(database.get(i) instanceof Cat)) continue; // If the animal is not a cat, skip this
                System.out.println(" | " + i + ": " + database.get(i));
            }
        }
        else { // Print all other animals
            for (int i = 0; i < database.size(); i++) {
                if (!(database.get(i) instanceof Dog)) continue; // If the animal is a dog or cat, skip this
                System.out.println(" | " + i + ": " + database.get(i));
            }
        }
    }

    // print all shelter animals that aren't fixed
    public void printNonFixed() {
        for (int i = 0; i < database.size(); i++) {
            if (database.get(i).isFixed()) continue; // If the animal is fixed, skip it
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
    public void removeAnimal(String name) {
        for (shelterAnimal animal : database) {
            if (animal.getName() == name) {
                totalAnimals--;
                if (animal instanceof Cat) numCats--;
                else if (animal instanceof Dog) numDogs--;
                database.remove(animal);
            }
        }
    }

    public void removeAnimal(int id) {
        totalAnimals--;
            if (database.get(id) instanceof Cat) numCats--;
            else if (database.get(id) instanceof Dog) numDogs--;
        database.remove(id);
    }

    // modifying animal
    public void modifyAnimal(String animalData, String modifier, String newData){
        for(shelterAnimal animal : database){
            if((animal.getName().equals(animalData))||(animal.getChip() == (Integer.parseInt(animalData)))){
                if(modifier.equals("name")){ // if they want to change the name
                    animal.setName(newData);}

                if(modifier.equals("type")){ // if they want to change the type
                    System.out.println("Please recreate the animal");}

                if(modifier.equals("age")){ // if they want to change the age
                    animal.setAge(Integer.parseInt(newData));}

                if(modifier.equals("fixed")){ // if they want to change if fixed
                    animal.setFixed(Boolean.parseBoolean(newData));}

                if(modifier.equals("days in")){ // if they want to change how many days in
                    animal.setDays(Integer.parseInt(newData));}

                if(modifier.equals("microchip")){ // if they want to change chip data
                    animal.setChip(Integer.parseInt(newData));}
            }
        }
    }

    // print animals in order of time in shelter(shortest to longest)
    public void printOrganized(){
        ArrayList<Integer> temporary = new ArrayList<Integer>();
        for(int i = 0; i < database.size()-1; i++){
            int minIndex = i;
            for(int j = i+1; j < database.size(); j++){
                if(database.get(j).getDays() < database.get(minIndex).getDays()){
                    minIndex = j;}
                temporary.add(minIndex);
            }
        }

        for(int index : temporary){ // printing all animals sorted
            System.out.println("Name: " + (database.get(index).getName()));
            // System.out.println("Type: " + (database.get(index).getType())); Figure this out with subclass
            System.out.println("Days In Shelter: " + (database.get(index).getDays()));
            System.out.println("---------------------------");
        }
    }
}
