import java.util.ArrayList;
public class animalShelter {
    private ArrayList<shelterAnimal> database = new ArrayList<shelterAnimal>(); // Create the database

    // prints all animals in the shelter
    public void printAllAnimals(){
        for(int i = 0; i < database.size(); i++){
            System.out.println(database.get(i));
        }
    }

    // prints all lost animals of a specific species
    public void printSpecies(String species){
        for(int i = 0; i < database.size(); i++){
            if(database.get(i).getType().equals(species)){
                System.out.println(database.get(i));
            }
        }
    }
}