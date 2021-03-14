public class Rectangle extends Shape{
    double widght;
    public Rectangle(double widght){
        this.widght = widght;
        
    }

    public double getArea() {
        return widght*widght;
    }
    
}