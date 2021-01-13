package Week6fix;

public class Pilot extends Person{
    String plane;
    public Pilot(String name, int age, String gender){
        this.age =age;
        this.name = name;
        this.gender = gender;
    }

    public void pilot(){
        System.out.println(name + " driving a " + plane );
        System.out.println();
    }
}
