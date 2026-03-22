import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) { 
        double cash = 19.99;
        System.out.println("---MAIN MENU---");
        System.out.println("1-drinks");
        System.out.println("2-snacks");
        System.out.println("3-burgers");
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option (1-3):");
        String mainChoice = scanner.nextLine().trim();

        if (mainChoice.equals("1")) {
            System.out.println("--- MENU ---");
            Product cola = new Product("coca cola", 9.99);
            Product pepsi = new Product("pepsi", 7.49);
            Product drpepper = new Product("dr. pepper", 5.99);
            Product fanta = new Product("fanta", 6.67);
            Product sprite = new Product("sprite", 5.49);
            cola.printInfo();
            pepsi.printInfo();
            drpepper.printInfo();
            fanta.printInfo();
            sprite.printInfo();

            System.out.println("What do you want to buy? (Write the name):");
            String megaknight = scanner.nextLine();
            String cleanChoice = megaknight.toLowerCase();
           if (cleanChoice.equals("coca cola")) {
                    System.out.println("You chose Coca Cola ");
                    System.out.println("cash:" + cash );
                    cash -= 9.99;
                    System.out.printf("%.2f" , cash );
           }
           else if (cleanChoice.equals("pepsi")) {
                    System.out.println("You chose Pepsi ");
                    System.out.println("cash:" + cash );
                    cash -= 7.49;
                    System.out.printf("%.2f" , cash );
           }
           else if (cleanChoice.equals("dr pepper")) {
            System.out.println("cash:" + cash );
                    cash -= 5.99;
                    System.out.printf("%.2f" , cash );
           }
           else if (cleanChoice.equals("fanta")) {
            System.out.println("You chose Fanta ");
                    System.out.println("cash:" + cash );
                    cash -= 6.67;
                    System.out.printf("%.2f" , cash );
           }
           else if (cleanChoice.equals("sprite")) {
            System.out.println("You chose Sprite ");
                    System.out.println("cash:" + cash );
                    cash -= 5.49;
                    System.out.printf("%.2f" , cash );
           }
           else {
            System.out.println("bro we dont have that drink");
           }
      /*
            switch (cleanChoice) {
                case "coca cola":
                    System.out.println("You chose Coca Cola ");
                    System.out.println("cash:" + cash );
                    cash -= 9.99;
                    System.out.println("cash:" + cash );
                    break;

                case "pepsi":
                    System.out.println("You chose Pepsi ");
                    System.out.println("cash:" + cash );
                    cash -= 7.49;
                    System.out.println("cash:" + cash );
                    break;

                case "dr. pepper":
                    System.out.println("You chose Dr. Pepper ");
                    System.out.println("cash:" + cash );
                    cash -= 5.99;
                    System.out.println("cash:" + cash );
                    break;

                case "fanta":
                    System.out.println("You chose Fanta ");
                    System.out.println("cash:" + cash );
                    cash -= 6.67;
                    System.out.println("cash:" + cash );
                    break;

                case "sprite":
                    System.out.println("You chose Sprite ");
                    System.out.println("cash:" + cash );
                    cash -= 5.49;
                    System.out.println("cash:" + cash );
                    break;

                default:
                    System.out.println("We don't have this drink!");
                    break;
            } */
        } else {
            System.out.println("Option not implemented yet.");
        }
        System.out.println("made by: EgorTVman1");
    }
    
}