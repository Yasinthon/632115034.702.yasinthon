package Week4;

public class Score{
    private int score;

    public Score(){
        score = 0;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int Score){
        score = Score;
    }
    public static void main(String[] args) {
        double av = 0;
        Score[] student;
        student = new Score[100];
        for(int i = 0; i < 100; i++){
            student[i] = new Score();
            student[i].setScore((int) (Math.random()*101));
            System.out.println("Score of person " + (i+1) + " is " + student[i].getScore());
        }
        av = Average(student);
        System.out.println("The average is " + av);
    }

    public static double Average(Score[] scores){
        double average = 0;
        double sum = 0;
        for(int i = 0; i < 100; i++ ){
            sum = scores[i].getScore()+sum;
        }
        average = sum/100;
        return average;
        
    }
}
