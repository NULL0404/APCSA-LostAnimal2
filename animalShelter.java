import java.util.ArrayList;

public class animalShelter {
    private ArrayList<shelterAnimal> database = new ArrayList<shelterAnimal>(); // Create the database
    private int totalAnimals;
    private int numDogs;
    private int numCats;

    // Print all animals in the shelter
    public void printAllAnimals() {
        for (shelterAnimal animal : database) {
            System.out.println(animal);
        }
    }

    // Print all shelter animals that are chipped
    public void printChip() {
        for (shelterAnimal animal : database) {
            if (animal.getChip() != -1) {
                System.out.println(animal);
            }
        }
    }

    // Print all shelter animals of a specific species
    public void printSpecies(String species) {
        if (species.equals("dog")) {
            for (shelterAnimal animal : database) {
                if (!(animal instanceof Dog)) continue; // If the animal is not a dog, skip this
                System.out.println(animal);
            }
        }
        else if (species.equals("cat")) {
            for (shelterAnimal animal : database) {
                if (!(animal instanceof Cat)) continue; // If the animal is not a cat, skip this
                System.out.println(animal);
            }
        }
        else { // Print all other animals
            for (shelterAnimal animal : database) {
                if ((animal instanceof Cat) || (animal instanceof Dog)) continue; // If the animal is a dog or cat, skip this
                System.out.println(animal);
            }
        }
    }

    // print all shelter animals that aren't fixed
    public void printNonFixed(boolean isFixed) {
        for (shelterAnimal animal : database) {
            if (animal.isFixed()) {

            } else {
                System.out.println(animal);
            }
        }
    }

    // Function to create an other animal
    public void addAnimal(String name, int animalAge, int microchip, boolean isFixed, boolean isSurrendered) {
        shelterAnimal newAnimal = new shelterAnimal(name, animalAge, microchip, isFixed, isSurrendered);
        database.add(newAnimal);
        totalAnimals++;
    }

    // Function to create a cat
    public void addCat(String name, int animalAge, int microchip, boolean isFixed, boolean isSurrendered) {
        Cat newCat = new Cat(name, animalAge, microchip, isFixed, isSurrendered);
        database.add(newCat);
        totalAnimals++;
        numCats++;
    }
    
    // Function to create an other animal
    public void addDog(String name, int animalAge, int microchip, boolean isFixed, boolean isSurrendered) {
        Dog newDog = new Dog(name, animalAge, microchip, isFixed, isSurrendered);
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
                database.remove(animal);
            }
        }
    }

    // printing all adoptable animals
    public void printAdoptables() {
        for (shelterAnimal animal : database) {
            if (animal.getDays() >= 14) {
                System.out.println(animal);
            }
        }
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
