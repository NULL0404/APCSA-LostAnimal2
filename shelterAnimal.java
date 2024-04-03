import java.util.ArrayList;

public class shelterAnimal {
    // instance variables
    private String nameOfAnimal;
    private int age;
    private boolean fixed;
    private int daysIn;
    private boolean surrendered;
    private int microchip;

    // All variable constructor
    public shelterAnimal(String name, int animalAge, int microchipData, boolean isFixed, boolean isSurrendered) {
        nameOfAnimal = name;
        age = animalAge;
        fixed = isFixed;
        daysIn = 0;
        surrendered = isSurrendered;
        microchip = microchipData;
    }

    public String getName() {
        return nameOfAnimal;
    }

    public boolean getSurrendered() {
        return surrendered;
    }

    public int getMicrochip() {
        return microchip;
    }

    public void setName(String newName) {
        nameOfAnimal = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
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

    public int getChip() {
        return microchip;
    }

    public void setChip(int newChip) {
        microchip = newChip;
    }

    public void print() {
        System.out.println("Name: " + nameOfAnimal);;
        System.out.println("Age: " + age);
        System.out.print("Fixed? ");
        if (fixed) System.out.println("Yes");
        else System.out.println("No");
        System.out.print("Tagged? ");
        if (microchip != -1) System.out.println("Yes");
        else System.out.println("No");
    }

    public String toString() {
        return "Other" + ": \"" + nameOfAnimal + "\"";
    }
}
