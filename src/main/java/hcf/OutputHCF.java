package hcf;

import java.util.Scanner;

public class OutputHCF {

    public static void main(String[] args) {

        HCFTwoNumber hcf = new HCFTwoNumber();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Num :");

        int a = sc.nextInt();

        System.out.println("Enter Second Num : ");

        int b = sc.nextInt();

        hcf.hcfCalculation(a,b);
    }
}
