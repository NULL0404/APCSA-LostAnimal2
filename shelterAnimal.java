public class shelterAnimal {
    // instance variables
    private String nameOfAnimal;
    private String typeOfAnimal;
    private boolean lost;
    private int age;
    private boolean tagged;

    // All variable constructor
    public shelterAnimal(String name, String type, boolean isLost, int animalAge, boolean isTagged) {
        nameOfAnimal = name;
        typeOfAnimal = type;
        lost = isLost;
        age = animalAge;
        tagged = isTagged;
    }

    public String getName() {
        return nameOfAnimal;
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

    public boolean isLost() {
        return lost;
    }

    public void setLost(boolean newLost) {
        lost = newLost;
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

}
