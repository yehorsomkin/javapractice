import java.util.Scanner;
public class Main {
  Scanner scanner = new Scanner(System.in);
  while(true) { 
  System.out.println("enter your name");
  String brand = scanner.nextLine();
  if(brand.equalsIgnoreCase("stop"))break;
  System.out.println("enter your price");
  String price = scanner.nextLine();
  if(price.equalsIgnoreCase("stop"))break;
  System.out.println("enter your color");
  String color = scanner.nextLine();
  if(color.equalsIgnoreCase("stop"))break;
  System.out.println("enter your speed");
  String speed = scanner.nextLine();
  if(speed.equalsIgnoreCase("stop"))break;
  System.out.println("enter your car model");
  String nameOfLamborghini = scanner.nextLine();
  if(NameOfLamborghini.equalsIgnoreCase("stop"))break;
  }

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