package Week6;

public class InheritanceExample{
    public static void main(String[] args) {
        Artist art = new Artist("Ball",20,"Male");

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        Teacher teach = new Teacher("Kim",22,"Male");

        teach.course= "Football";
        teach.introduce();
        teach.teach();

        Chef chef = new Chef("Lin",20,"Female");

        chef.food = "Spaghetti";
        chef.introduce();
        chef.chef();

        Pilot pilot = new Pilot("Alex",30,"Male");

        pilot.plane = "Jet aircraft";
        pilot.introduce();
        pilot.pilot();

        Programmer programmer = new Programmer("Max",19,"Male");

        programmer.code = "JAVA code";
        programmer.introduce();
        programmer.programmer();

        Seller seller= new Seller("Anna",32,"Female");

        seller.product = "computer";
        seller.introduce();
        seller.sell();    

    }
}