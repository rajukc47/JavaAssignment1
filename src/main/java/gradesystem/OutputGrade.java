package gradesystem;

import java.util.Scanner;

public class OutputGrade {


    public static void main(String[] args) {

        int marks;
        Marks m  = new Marks();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks : ");

        marks = sc.nextInt();

        m.gradeSystem(marks);
    }
}
