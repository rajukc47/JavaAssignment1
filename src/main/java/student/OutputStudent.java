package student;

import java.util.Scanner;

public class OutputStudent {

    public final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your name : ");

        String name = sc.nextLine();

        if(name.isEmpty()){
            StudentName std = new StudentName();

        }
        else {
            StudentName std = new StudentName(name);
        }
    }
}
