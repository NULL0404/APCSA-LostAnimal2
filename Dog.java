public class Dog extends shelterAnimal{
    private String breed;
    private String color;
    private boolean friendly;

    public Dog(String name, int animalAge, int microchipData, boolean isFixed, boolean isSurrendered, String breed, String color, boolean friendly) {
    super(name, animalAge, microchipData, isFixed, isSurrendered); 
    this.breed = breed;
    this.color = color;
    this.friendly = friendly;
  }

    public void isFriendly(){
        if(friendly){
            System.out.println(this.name + " is a friendly dog.");
        }else{
            System.out.println(this.name + " is not friendly.");
        }
    }

     public void dogColor(){
            System.out.println(this.name + " has " + this.color + " fur.");
        }

    public void dogBreed(){
            System.out.println(this.name + " is a " + this.breed);
        }
}

