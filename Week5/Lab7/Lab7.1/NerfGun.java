public class NerfGun{

    int ammo = 0;
    static int ID = 0;

    public NerfGun(){
       this.ammo = 0; 
       ID++;
    }
    
    public NerfGun(int ammo){
        this.ammo = ammo;
        ID++;
    }

    public void fire(){
        if(ammo == 0){
            System.out.println("There is no ammuition");
        }else{
            System.out.println("BANG !!!");
            ammo -= 1;
        }
    } 
    public void reload(int num){
        if(ammo + num > 15){
            System.out.println("Error!! the ammuition is overload");
        }else{
            this.ammo += num;
        }
    }

    public void displayNumOfAmmunition(){
        System.out.println(ammo + " bullet left");
    }
    public void displayGunID(){
        System.out.println("The ID of this gun is " + ID);
    }


}