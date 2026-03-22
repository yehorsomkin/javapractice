public class Apple {
    double price;
    String color;
    String name;
    public void eat() {
        System.out.println("Im eating a"+ color + name + "bon appetit");
    }
    public Apple(double price, String name, String color) {
            this.price = price;
            this.name = name;
            this.color = color;
        }


}