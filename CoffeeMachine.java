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
            System.out.println("coca cola = 9.99");
            System.out.println("pepsi = 7.49");
            System.out.println("dr. pepper = 5.99");
            System.out.println("fanta = 6.67");
            System.out.println("sprite = 5.49");

            System.out.println("What do you want to buy? (Write the name):");
            String megaknight = scanner.nextLine();
            String cleanChoice = megaknight.toLowerCase();

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
            }
        } else {
            System.out.println("Option not implemented yet.");
        }
    }
    
}