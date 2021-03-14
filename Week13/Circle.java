public class Circle extends Shape{
    double pi;
    double radius;
    public Circle(double pi, double radius){
        this.pi = pi;
        this.radius = radius;
    }

    public double getArea() {
        return pi*radius*radius;
    }
    
}
