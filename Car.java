public class Car{
    String color;
    String brand;
    int price;
    int speed;
    boolean isParking;
    String nameOfLamborghini;
    public void drive() {
        System.out.println("Im driving a car"+ brand + nameOfLamborghini + "good luck");
    } 
    public Car(String color, String brand, int price, int speed, String nameOfLamborghini){
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.speed = speed;
        this.isParking = isParking;
        this.nameOfLamborghini = nameOfLamborghini;
    }  
}
