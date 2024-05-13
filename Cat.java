// Eric Dominguez
// cat subclass

public class Cat extends shelterAnimal {
    private String eyeColor;
    private String type;
    private boolean outdoor;

    // Cat subclass constructor, contains variables that set and change different traits of the cat animal 
    public Cat(String nameOfAnimal, int animalAge, int microchipData, boolean isFixed, boolean isSurrendered,
            String eyeColor, String type, boolean outdoor, int time) {
        super(nameOfAnimal, animalAge, microchipData, isFixed, isSurrendered, time);
        this.eyeColor = eyeColor;
        this.type = type;
        this.outdoor = outdoor;
    }

    // methods made to return and set different variables declared in the constructor 
    public String getCatEye() {
        return eyeColor;
    }

    public void setCatEye(String newEye) {
        eyeColor = newEye;
    }

    public String getCatType() {
        return type;
    }

    public void setCatType(String newType) {
        type = newType;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void setOutdoor(boolean newOutdoor) {
        outdoor = newOutdoor;
    }

    @Override
    public void print() { // Override the superclass print to include subclass informmation
        super.print();    // Call the superclass print statement to get that data, then print the rest
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Type: " + type);
        System.out.print("Outdoor? ");
        if (outdoor) System.out.println("Yes");
        else System.out.println("No");
    }

    // Cat subclass toString to print the set features by the user 
    public String toString() {
        return this.getName() + " is a " + this.type + " with " + this.eyeColor + " eyes " + " and has spent "
                + this.getDays() + " days in the shelter";
    }
}
