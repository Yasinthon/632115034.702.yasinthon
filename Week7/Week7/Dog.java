package Week7;

public class Dog extends MyPets{
    String size;
    String hair;
    public Dog(String pets, String name, String species, String color, int age){
        this.pets = pets;
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void Run(){
        System.out.println("My dog " + name + " is run to the jungle");
    }
    public void Bark(){
        System.out.println(size + " bark Box Box!!");
    }
    public boolean IsShortHair(){
        if(this.hair == "Short hair"){
            System.out.println("Short hair : true");
            System.out.println();
        }else{
            System.out.println("Short hair : false");
            System.out.println();
        }
        return true;
    }
}
