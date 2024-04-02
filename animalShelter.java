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
            if (animal.isTagged()) {
                System.out.println(animal);
            }
        }
    }

    // Print all shelter animals of a specific species
    public void printSpecies(String species) {
        for (shelterAnimal animal : database) {
            if (animal.getType().equals(species)) {
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

    // adding the animal
    public void addAnimal(String name, String type, int animalAge, boolean isTagged, boolean isFixed) {
        shelterAnimal newAnimal = new shelterAnimal(name, type, animalAge, isTagged, isFixed);
        database.add(newAnimal);
        totalAnimals++;
        if(type.equals("Dog", "dog")){
            numDogs++;}
        else if(type.equals("Cat", "cat")){
            numCats++;}
        public void totalAni(){
            return totalAnimals;}
        public void totalDog(){
            return numDogs;}
        public void totalCat(){
            return numCats;}
 
    // removing the animal
    public void removeAnimal(String name){
        for (shelterAnimal animal : database) {
            if (animal.getName() == name){
                database.remove(animal);
            }
        }
    }

}
