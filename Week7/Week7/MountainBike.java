package Week7;

public class MountainBike extends TestBicycle{
    int gear;

    public MountainBike(){
        this.gear = 2;
        this.currentspeed = 10;
    }

    public int gearUP(int gearUP){
        this.currentspeed = currentspeed + (gearUP*gear);
        return gearUP;
    }
}
