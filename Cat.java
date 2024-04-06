public class Cat extends shelterAnimal{
    private String eyeColor;
    private String type;
    private boolean outdoor;

    public Cat(String nameOfAnimal, int animalAge, int microchipData, boolean isFixed, boolean isSurrendered, String eyeColor, String type, boolean outdoor) {
    super(nameOfAnimal, animalAge, microchipData, isFixed, isSurrendered); 
    this.eyeColor = eyeColor;
    this.type = type;
    this.outdoor = outdoor;
    }

    public void catEye(){
        System.out.println(this.nameOfAnimal + " has " + this.eyeColor + " eyes.");
    }

    public void catType(){
        System.out.println(this.nameOfAnimal + " is a " + this.type + " cat.");
    }

    public void isOutdoor(){
        if(outdoor){
            System.out.println(this.nameOfAnimal + " is a outdoor cat.");
        }else{
            System.out.println(this.nameOfAnimal + " is a indoor cat.");
        }
    }
}
