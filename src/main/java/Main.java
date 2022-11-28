import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to supermarket inventory program!");

        Scanner scanner = new Scanner(System.in);
        SuperMarket supermarket = new SuperMarket();

        String input = "";
        do {
            System.out.println("""
                    Lets start inventory today!
                                        
                    1. Add product
                    2. View all products
                    3. Remove a product
                    4. View single product
                    5. Buy a product (deducting the products quantity)
                    6. Track the total amount earned by the supermarket
                                        
                    """);
            input = scanner.nextLine();
            switch (input){
                case "quit":
                    System.out.println("Exit application");
                    break;
                case "1":
                    //System.out.println("Add a product");
                    supermarket.addProduct();
                    break;
                case "2":
                    //System.out.println("View all products");
                    supermarket.viewAllProducts();
                    break;
                case "3":
                    //System.out.println("Remove a product");
                    supermarket.removeProduct();
                    break;
                case "4":
                    //System.out.println("View a single product");
                    supermarket.viewProduct();
                    break;
                case "5":
                    System.out.println("Buy a product");
                    break;
                case "6":
                    System.out.println("Track total amount earned by supermarket");
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;


            }
        } while (!input.equals("quit"));
    }
}

