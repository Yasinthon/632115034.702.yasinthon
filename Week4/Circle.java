package Week4;

public class Circle {
    static double radius = 10;

    private static int numberOfObjects = 0;

    String color;

    public Circle(){
        numberOfObjects++;
    }

    public Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        radius = (newRadius  >= 0 )? newRadius : 0;
    }

    public static int getNumberOfObject(){
        return numberOfObjects;
    }

    public static void setNumberOfObject(int number){
        numberOfObjects = number;
    }

    public double getArea(){
        return radius * radius *Math.PI;
    }
    
    /*public String getColor(){
        return color;
    }
    public void setColr(String newColor){
        color = newColor;
    }*/

    
}
