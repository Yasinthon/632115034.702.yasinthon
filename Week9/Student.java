package Week9;

public class Student {
    private String firstname = "Hello";
    private String lastname = "World";

    public String toString(){
        return "My first name "+ firstname + " last name " + lastname;
    }
    public static void main(String[] args) {
        Student p = new Student();
        System.out.println(p.toString());
    }
}
