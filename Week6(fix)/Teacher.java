package Week6;

public class Teacher extends Person{
    String course;
    public Teacher(String name, int age, String gender){
        this.age =age;
        this.name = name;
        this.gender = gender;
    }

    public void teach(){
        System.out.println(name + " is teaching " + course);
        System.out.println();
    }
}
