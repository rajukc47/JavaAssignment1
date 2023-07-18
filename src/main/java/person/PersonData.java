package person;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PersonData {

    String name;
    int roll;
    String interestArea;

    public void PersonInputDisplay(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");

        name = sc.nextLine();

        System.out.println("Enter Your Roll No : ");

        roll = sc.nextInt();

        System.out.println("Enter Your Area of Interest : ");

        interestArea = sc.nextLine();

        System.out.println("Hey, my name is " + name + " and my age is : " + roll + " My field of interest is " + interestArea);

    }

}
