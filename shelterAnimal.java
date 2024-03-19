public class shelterAnimal {
    // instance variables
    private String nameOfAnimal;
    private String typeOfAnimal;
    private int sheltertime;
    private boolean tagged;
    private boolean surendered;

    // All variable constructor
    public shelterAnimal(String name, String type, int animalShelterTime, boolean isTagged) {
        nameOfAnimal = name;
        typeOfAnimal = type;
        sheltertime = animalShelterTime;
        tagged = isTagged;
    }

    public boolean isAdoptable() {
        if (surendered) return true;
        return sheltertime > 14;
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

    public int getShelterTime() {
        return sheltertime;
    }

    public void setShelterTime(int newShelterTime) {
        sheltertime = newShelterTime;
    }

    public boolean isTagged() {
        return tagged;
    }

    public void setTagged(boolean newTagged) {
        tagged = newTagged;
    }

}
