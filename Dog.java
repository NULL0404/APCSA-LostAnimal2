public class Dog extends shelterAnimal {
    private String breed;
    private String color;
    private boolean friendly;

    public Dog(String nameOfAnimal, int animalAge, int microchipData, boolean isFixed, boolean isSurrendered,
            String breed, String color, boolean friendly) {
        super(nameOfAnimal, animalAge, microchipData, isFixed, isSurrendered);
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
}
