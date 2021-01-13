public class Main {
    public static void main(String[] args) {
        Circle cir1 = new Circle(0.0,0.0,2.0);
        cir1.area();
        cir1.circumference();
        System.out.println("Area of cir1 = " + cir1.area());
        System.out.println("Circumference of cir1 = " + cir1.circumference());
        
        Circle cir2 = new Circle(1.0,2.0,3.0);
        cir2.area();
        cir2.circumference();
        System.out.println("Area of cir2 = " + cir2.area());
        System.out.println("Circumference of cir2 = " + cir2.circumference());
        
        Circle cir3 = new Circle(3.0,5.0,1.0);
        cir3.area();
        cir3.circumference();
        System.out.println("Area of cir3 = " + cir3.area());
        System.out.println("Circumference of cir3 = " + cir3.circumference());

        Circle cir4 = new Circle(-1.0,-10.0,-1.0);
        cir4.area();
        cir4.circumference();
        System.out.println("Area of cir4 = " + cir4.area());
        System.out.println("Circumference of cir4 = " + cir4.circumference());

        System.out.println("Is circle 1 intersec circle 2: " + cir1.intersec(cir2));
        System.out.println("Is circle 1 intersec circle 3: " + cir1.intersec(cir3));
    }
}
