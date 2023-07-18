package gradesystem;

public class Marks {
    int marks ;

    public void gradeSystem(int marks){

        this.marks = marks;

        if(this.marks > 80) System.out.println("Your Grade is : A");

        else if((this.marks >= 60) && (this.marks <= 80)) System.out.println("Your Grade is : B");

        else if (this.marks >= 50 && this.marks < 60) System.out.println("Your Grade is : C");

        else if(this.marks >= 45 && this.marks <50 ) System.out.println("Your Grade is : D");

        else if (this.marks >= 25 && this.marks < 45) System.out.println("Your Grade is : E");

        else System.out.println("Your are Failed.");

    }

}
