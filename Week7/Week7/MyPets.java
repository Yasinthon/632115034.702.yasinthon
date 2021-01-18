package Week7;

public class MyPets {
    String name;
    String species;
    String color;
    int age;
    String pets;
    public MyPets(){

    }
    public MyPets(String pets, String name, String species, String color, int age){
        this.pets = pets;
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void data(){
        System.out.println("My " + pets);
        System.out.println("Name : " + name + " Species : " + species + " Color : " + color + " Age : " + age);
    }
}

