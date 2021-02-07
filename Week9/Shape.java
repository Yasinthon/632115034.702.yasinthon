package Week9;

public class Shape {
    String shape;

    public Shape() {
        this.shape = "shape";
    }

    public String toString() {
        return "This is a " + shape;
    }
}

class Rectangle extends Shape {

    int heigth = 0;
    int width = 0;

    public Rectangle() {

    }

    public Rectangle(int heigth, int width) {
        super();
        this.heigth = heigth;
        this.width = width;
        this.shape = "Rectangle";
    }
    public String toString(){
        return "This is a "+ shape +" width as " + width + " and height as " + heigth;
 }
}

class Cube extends Rectangle {
    int length;
        public Cube(){

        }
        public Cube(int length){
            super();
            this.length = length;
        }
        public String toString(){
            return "This is a cube with the side of " + length;
        }
}


    

    
