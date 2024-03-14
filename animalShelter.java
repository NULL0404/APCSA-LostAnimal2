import java.util.ArrayList;
public class animalShelter {
    private ArrayList<shelterAnimal> database = new ArrayList<shelterAnimal>(); // Create the database

    // makes print de all animal
    public static void printAllAnimals(ArrayList<shelterAnimal> database){
        for(int i = 0; i < database.size(); i++){
            System.out.println(database.get(i));
        }
    }
}