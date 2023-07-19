package factorial;

import java.util.Scanner;

public class OutputFactorial {

    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        FactorialPrint fp = new FactorialPrint();

        System.out.println("Enter number to find factorial :");

        fp.num = scan.nextInt();

        fp.printFactorial();
    }
}
