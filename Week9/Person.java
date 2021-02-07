package Week9;

public class Person{
    String name;
    int bornYear;

    public Person(String name, int bornYear){
        this.name = name;
        this.bornYear = bornYear;
    }

    public void introduce(){
        System.out.print("My name is " + name + ",");
        System.out.println("I was born in " + bornYear + ".");
    }
}
    class Sheriff extends Person{
        String workState;
        
        public Sheriff(String name, int bornYear, String workState){
            super(name, bornYear);
            this.workState = workState;
        }

        public void introduce(){
            super.introduce();
            System.out.println("I'm a Sheriff and work in " + workState + ".");
        }
    }

    class Teacher extends Person{
        String university;
        
        public Teacher(String name, int bornYear, String university){
            super(name, bornYear);
            this.university = university;
        }

        public void introduce(){
            super.introduce();
            System.out.println("I'm a teacher and tech the students in " + university + ".");
        }
    }

    class primeminister extends Person{
        String country;
        
        public primeminister(String name, int bornYear, String country){
            super(name, bornYear);
            this.country = country;
        }

        public void introduce(){
            super.introduce();
            System.out.println("I'm a prime minister and work in " + country + ".");
        }
    }

    class footballplayer extends Person{
        String club;
        
        public footballplayer(String name, int bornYear, String club){
            super(name, bornYear);
            this.club = club;
        }

        public void introduce(){
            super.introduce();
            System.out.println("I'm a football player and work in " + club + ".");
        }
    }

    class student extends Person{
        String faculty;
        
        public student(String name, int bornYear, String faculty){
            super(name, bornYear);
            this.faculty = faculty;
        }

        public void introduce(){
            super.introduce();
            System.out.println("I'm a student and study in " + faculty + ".");
        }
    }
