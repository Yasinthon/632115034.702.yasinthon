package Week7;

public class Bird extends MyPets{
    String country;
    String canfly;
    boolean fly;
    public Bird(String pets, String name, String species, String color, int age){
        this.pets = pets;
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void Speak(){
        System.out.println("My Bird " + name + " can speak and can fly in the " + canfly);
    }
    public void Checkcountry(){
        System.out.println("Country : " + country);
    }
    public boolean IsCanFly(){
        if(this.canfly == "Sky"){
            System.out.println("Can fly : true");
            System.out.println();
        }else{
            System.out.println("Can fly : false");
            System.out.println();
        }
        return true;
    }
}
