package Week6;

public class Programmer extends Person{
    String code;
    public Programmer(String name, int age, String gender){
        this.age =age;
        this.name = name;
        this.gender = gender;
    }

    public void programmer(){
        System.out.println(name + " writing a " + code );
        System.out.println();
    }
}

