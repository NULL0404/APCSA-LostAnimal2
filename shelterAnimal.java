import java.util.ArrayList;

public class shelterAnimal {
    // instance variables
    private String nameOfAnimal;
    private String typeOfAnimal;
    private int age;
    private boolean tagged;
    private boolean fixed;
    private int daysIn;
    private boolean surrendered;
    private String microchip;

    // All variable constructor
    public shelterAnimal(String name, String type, int animalAge, boolean isTagged, boolean isFixed, int daysInShelter,
            boolean isSurrendered, String microchipData) {
        nameOfAnimal = name;
        typeOfAnimal = type;
        age = animalAge;
        tagged = isTagged;
        fixed = isFixed;
        daysIn = daysInShelter;
        surrendered = isSurrendered;
        microchip = microchipData;
    }

    public String getName() {
        return nameOfAnimal;
    }

    public boolean getSurrendered() {
        return surrendered;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setName(String newName) {
        nameOfAnimal = newName;
    }

    public String getType() {
        return typeOfAnimal;
    }

    public void setType(String newType) {
        typeOfAnimal = newType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public boolean isTagged() {
        return tagged;
    }

    public void setTagged(boolean newTagged) {
        tagged = newTagged;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean newFixed) {
        fixed = newFixed;
    }

    public int getDays() {
        return daysIn;
    }

    public void setDays(int newDays) {
        daysIn = newDays;
    }

    public String getChip() {
        return microchip;
    }

    public void setChip(String newChip) {
        microchip = newChip;
    }

    public void print() {
        String output = "";
        System.out.println("Name: " + nameOfAnimal);
        System.out.println("Type: " + typeOfAnimal);
        System.out.println("Age: " + age);
        System.out.print("Fixed? ");
        if (fixed) System.out.println("Yes");
        else System.out.println("No");
        System.out.print("Tagged? ");
        if (tagged) System.out.println("Yes");
        else System.out.println("No");
    }

    public String toString() {
        return typeOfAnimal + ": \"" + nameOfAnimal + "\"";
    }
}
