public class StudentData {
    public static void main(String[] args) {
        Student std01 = new Student("Mark",18,4.00);
        Student std02 = new Student("Jane",18,2.20);
        Student std03 = new Student("Peter",19,4.00);
        Student std04 = new Student("Mark",22,1.75);

        //name
        System.out.println(std01.equalsName(std02));
        System.out.println(std01.equalsName(std03));
        System.out.println(std02.equalsName(std04));
        System.out.println(std01.equalsName(std04));
        System.out.println();
        //age
        System.out.println(std01.equalsAge(std02));
        System.out.println(std03.equalsAge(std04));
        System.out.println(std01.equalsAge(std03));
        System.out.println();
        //gpa
        System.out.println(std01.equalsGpa(std03));
        System.out.println(std02.equalsGpa(std04));
        System.out.println(std02.equalsGpa(std03));
    }
}