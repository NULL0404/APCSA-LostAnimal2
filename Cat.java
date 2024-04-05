public class Cat extends shelterAnimal{
    private String eyeColor;
    private String type;
    private boolean outdoor;

    public Cat(String name, int age, int totalAnimals, int numDogs, int numCats, String eyeColor, String type, boolean outdoor) {
    super(name, age, totalAnimals, numDogs, numCats); 
    this.eyeColor = eyeColor;
    this.type = type;
    this.outdoor = outdoor;
    }

    public void catEye(){
        System.out.println(this.name + " has " + this.eyeColor + " eyes.");
    }

    public void catType(){
        System.out.println(this.name + " is a " + this.type + " cat.");
    }

    public void isOutdoor(){
        if(outdoor){
            System.out.println(this.name + " is a outdoor cat.");
        }else{
            System.out.println(this.name + " is a indoor cat.");
        }
    }
}
