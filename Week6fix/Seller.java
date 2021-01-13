package Week6fix;

public class Seller extends Person{
    String product;
    public Seller(String name, int age, String gender){
        this.age =age;
        this.name = name;
        this.gender = gender;
    }

    public void sell(){
        System.out.println(name + " selling a " + product );
        System.out.println();
    }
}
