package Week7;

public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog("dog","Lucky","Pooddle","Brown",2);
        dog.size = "Small";
        dog.hair = "Short hair";
        dog.data();
        dog.Run();
        dog.Bark();
        dog.IsShortHair();

        Fish fish = new Fish("fish","Puck","Clownfish","Orange and White",1);
        fish.size = "Small";
        fish.water = "Salt water";
        fish.speed = 40;
        fish.data();
        fish.SwimFast();
        fish.IsSwimToThesea();

        Bird bird  = new Bird("bird", "Phoenix", "Magpie", "Black and White", 2);
        bird.country = "Thailand";
        bird.canfly = "Sky";
        bird.data();
        bird.Speak();
        bird.Checkcountry();
        bird.IsCanFly();
    }
}