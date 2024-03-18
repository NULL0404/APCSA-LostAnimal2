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
}