//Eric Dominguez
public class Cat extends shelterAnimal {
    private String eyeColor;
    private String type;
    private boolean outdoor;
//Cat subclass constructor 
    public Cat(String nameOfAnimal, int animalAge, int microchipData, boolean isFixed, boolean isSurrendered,
            String eyeColor, String type, boolean outdoor, int time) {
        super(nameOfAnimal, animalAge, microchipData, isFixed, isSurrendered, time);
        this.eyeColor = eyeColor;
        this.type = type;
        this.outdoor = outdoor;
    }
//methods made to return and set different cat features 
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
//Cat subclass toString to print the most important aspects 
    public String toString(){
        return this.getName() + " is a " + this.type + " with " + this.eyeColor + " eyes " + " and has spent " + this.getDays() + " days in the shelter";
    }
}
