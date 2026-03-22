public class Mobile {
        int price;
        String name;
        String color;
        int madeIn;
        double size;
        boolean isCharger;
        public void play() {
        System.out.println("Im playing a game on "+ name + madeIn + "good luck");
    } 
        public Mobile(int price, String name, String color, int madeIn, double size) {
            this.price = price;
            this.name = name;
            this.color = color;
            this.madeIn = madeIn;
            this.size = size;
            this.isCharger = isCharger;
        }
            
        
}