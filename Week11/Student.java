public class Student {
    String name;
    int age;
    double gpa;

    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }
    
    public boolean equalsName(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.getName() == ((Student) obj).getName();
    }

    public boolean equalsAge(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.getAge() == ((Student) obj).getAge();
    }

    public boolean equalsGpa(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.getGpa() == ((Student) obj).getGpa();
    }

}
