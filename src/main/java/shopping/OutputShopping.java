package shopping;

import java.util.Scanner;

public class OutputShopping {

    public static void main(String[] args) {

        Purchase p = new Purchase();


        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter Quantity of Shipping :");

        p.qty = scanner.nextInt();

        p.TotalCost();


    }
}
