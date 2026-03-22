public class Main {
    public static void main(String[] args) { 
    Mobile iphone = new Mobile(24000, "iphone 17 pro max", "pink", 2025, 12);
    iphone.play();
    Charger charger = new Charger();
    charger.charge(iphone);
    Garage myParking = new Garage();
    Car lamborghini = new Car("aloe vera", "lamborghini", 400000, 4967, "suracan");
    lamborghini.drive();
    Apple apple = new Apple(5.99, "red", "apple");
    apple.eat();
    Mouth mouth = new Mouth();
    mouth.bite(apple);
    myParking.tv(lamborghini);
    }
      }