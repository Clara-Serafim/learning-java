import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your next move? ");
        String move = scanner.nextLine();
         
          System.out.println(move);

         System.out.print("How many coins do you have? ");
         double coins = scanner.nextDouble();

        double coinValue = 0.0045;
        double money = coinValue * coins;

         System.out.println(money);  
    }
}
