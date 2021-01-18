package Week7;

public class Fish extends MyPets{
    String size;
    String water;
    int speed;
    boolean swimInSea;
    public Fish(String pets, String name, String species, String color, int age){
        this.pets = pets;
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void SwimFast(){
        System.out.println("My Fish " + name + " is swim in the " +  water + " with speed " + speed + " km/hr");
        System.out.println("Size : " + size);
    }
    public boolean IsSwimToThesea(){
        if(this.water == "Salt water"){
            System.out.println("Is swim to the sea : true");
            System.out.println();
        }else{
            System.out.println("Is swim to the sea : false");
            System.out.println();
        }
        return true;
    }
}