import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println(name);

        //Temos a seguinte pista de escape room que precisamos resolver!
        //Falo sem boca e ouço sem ouvidos. Não tenho corpo, mas vivo com o vento. O que sou eu?
        
        System.out.print("Falo sem boca e ouço sem ouvidos. Não tenho corpo, mas vivo com o vento. O que sou eu?");//Echo
        String answer = scanner.nextLine();

        System.out.println(answer);

    }
}

