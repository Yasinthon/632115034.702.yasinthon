package Week6fix;

public class Chef extends Person{
    String food;
    public Chef(String name, int age, String gender){
        this.age =age;
        this.name = name;
        this.gender = gender;
    }

    public void chef(){
        System.out.println(name + " cooking a " + food );
        System.out.println();
    }
}
