public class Dog extends shelterAnimal {
    private String breed;
    private String color;
    private boolean friendly;

    public Dog(String nameOfAnimal, int animalAge, int microchipData, boolean isFixed, boolean isSurrendered,
            String breed, String color, boolean friendly, int time) {
        super(nameOfAnimal, animalAge, microchipData, isFixed, isSurrendered, time);
        this.breed = breed;
        this.color = color;
        this.friendly = friendly;
    }

    public boolean isFriendly() {
        return friendly;

    }

    public void setFriendly (boolean newFriendly) {
        friendly = newFriendly;
    }

    public String dogColor() {
        return color;
    }

    public void setColor (String newColor) {
        color = newColor;
    }

    public String getDogBreed() {
        return breed;
    }

    public void setBreed (String newBreed) {
        breed = newBreed;
    }

    public String toString(){
        return this.getName() + " is a " + this.color + " " + this.breed + " and has spent " + this.getDays() + " days in the shelter";
    }
}