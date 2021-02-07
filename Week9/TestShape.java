package Week9;

public class TestShape {
    public static void main(String[] args) {
        
        Shape shape = new Shape();
        Rectangle reg = new Rectangle(50, 40);
        Cube cube = new Cube(20);

        System.out.println(shape.toString());
        System.out.println(reg.toString());
        System.out.println(cube.toString());
        
        
    }
}
