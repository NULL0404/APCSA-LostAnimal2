import java.util.ArrayList;
public class animalShelter {
    private ArrayList<shelterAnimal> database = new ArrayList<shelterAnimal>(); // Create the database

    // prints all animals in the shelter
    public static void printAllAnimals(ArrayList<shelterAnimal> database){
        for(int i = 0; i < database.size(); i++){
            System.out.println(database.get(i));
        }
    }

    // prints all lost animals in the shelter
    public static void printLostAnimals(ArrayList<shelterAnimal> database){
        for(int i = 0; i < database.size(); i++){
            if(database.get(i).isLost()){
                System.out.println(database.get(i));
            }
        }
    }


    // prints all lost animals of a specific species
    public static void printLostOfSpecies(ArrayList<shelterAnimal> database, String species){
        for(int i = 0; i < database.size(); i++){
            if(database.get(i).isLost()){
                if(database.get(i).getType().equals(species)){
                    System.out.println(database.get(i));
                }
            }
        }
    }
}