package Week6fix;

public class Person{
    String name;
    int age;
    String gender;
    public Person(){

    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("My name is " + name);
        System.out.println(name + " is " + age + " years old");
        System.out.println(name + " is " + gender);
    }
}
