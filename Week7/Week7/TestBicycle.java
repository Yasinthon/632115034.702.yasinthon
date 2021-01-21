package Week7;

public class TestBicycle {
    int currentspeed;

    public void setspeedUP(){
        this.currentspeed += 5;
    }  

    public void setbreake(){
        this.currentspeed -= 5;
    }

    public void currentspeed(){
        if(this.currentspeed <= 99){
            System.out.println("The current speed is >> " + currentspeed);
        }else{
            System.out.println("Over Speed!!!");
        }
    }
    
}
