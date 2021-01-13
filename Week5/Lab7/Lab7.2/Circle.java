public class Circle {

    double radius = 0;
    double x = 0;
    double y = 0;

    public Circle(double x, double y){
        this.x = x;
        this.y = y;
        this.radius = 1;
    }

    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

	public double area(){
        if(radius < 0 ){
            return 0;
        }else{
            return (Math.PI * ( radius * radius));
        }
	}

	public double circumference() {
        if(radius < 0){
            return 0;
        }else{
            return (2 * Math.PI * radius);
        }
    }
    
    public boolean intersec(Circle cir2){
        double distance = Math.sqrt(Math.pow(x - cir2.x , 2) + Math.pow(y - cir2.y , 2));
        if(distance < radius + cir2.radius){
            return true;
        }else{
            return false;
        }
    }
}
