package Week4;

public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Circle.radius = 5;

        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
        //test#1
        System.out.println(myCircle.getRadius());
        //test#2
        System.out.println(myCircle.getNumberOfObject());
        //test#3
        System.out.println("The numberof object is " + myCircle.getNumberOfObject());
        //test#4
        myCircle.setNumberOfObject(10);
        System.out.println("The numberof object is " + myCircle.getNumberOfObject());
        
        System.out.println(myCircle.color);
    }
    
}
