//Eric Dominguez
//Dog subclass
public class Dog extends shelterAnimal {
    private String breed;
    private String color;
    private boolean friendly;

    // Dog subclass constructor, contains variables that set and change different traits of the Dog animal
    public Dog(String nameOfAnimal, int animalAge, int microchipData, boolean isFixed, boolean isSurrendered,
            String breed, String color, boolean friendly, int time) {
        super(nameOfAnimal, animalAge, microchipData, isFixed, isSurrendered, time);
        this.breed = breed;
        this.color = color;
        this.friendly = friendly;
    }

    // methods made to return and set different variables declared in the constructor
    public boolean isFriendly() {
        return friendly;

    }

    public void setFriendly(boolean newFriendly) {
        friendly = newFriendly;
    }

    public String dogColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getDogBreed() {
        return breed;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    // Cat subclass toString to print the set features by the user
    public String toString() {
        return this.getName() + " is a " + this.color + " " + this.breed + " and has spent " + this.getDays()
                + " days in the shelter";
    }
}
