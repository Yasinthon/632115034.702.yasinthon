package Week7;

public class Runbike {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        System.out.println("----------Bicycle----------");
        bike.currentspeed();
        bike.setspeedUP();
        System.out.println("SpeedUP");
        bike.currentspeed();
        bike.setbreake();
        System.out.println("Break");
        bike.currentspeed();
        System.out.println();
        
        MountainBike Mtbike = new MountainBike();
        System.out.println("-------MountainBike-------");
        Mtbike.currentspeed();
        Mtbike.gearUP(5);
        System.out.println("GearUP");
        Mtbike.currentspeed();
        Mtbike.setbreake();
        System.out.println("Break");
        Mtbike.currentspeed();
        System.out.println();
        
    }
}
