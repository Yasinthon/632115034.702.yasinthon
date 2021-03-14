public class Triangle extends Shape{
    double base;
    double hight;
    public Triangle(double base, double hight){
        this.base = base;
        this.hight = hight;
    }

    public double getArea() {
        return base*hight;
    }
    
}
