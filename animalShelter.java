import java.util.ArrayList;

public class animalShelter {
    private ArrayList<shelterAnimal> database = new ArrayList<shelterAnimal>(); // Create the database

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
    public void printnonFixed(boolean isFixed) {
        for (shelterAnimal animal : database) {
            if (animal.isFixed()) {

            } else {
                System.out.println(animal);
            }
        }
    }

}