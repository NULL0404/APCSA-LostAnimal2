public class shelterAnimal {
    // instance variables
    private String nameOfAnimal;
    private String typeOfAnimal;
    private int age;
    private boolean tagged;
    private boolean fixed;


    // All variable constructor
    public shelterAnimal(String name, String type, int animalAge, boolean isTagged, boolean isFixed) {
        nameOfAnimal = name;
        typeOfAnimal = type;
        age = animalAge;
        tagged = isTagged;
        fixed = isFixed;
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
