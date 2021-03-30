public class arbitrary{
    public static void main(String[] args) {
        Shape triangle = new Triangle(2,2);
        System.out.println(triangle.getArea());

        Shape rectangle = new Rectangle(10);
        System.out.println(rectangle.getArea());

        Shape circle = new Circle(3.14, 3);
        System.out.format("%.2f",circle.getArea());
    }
}