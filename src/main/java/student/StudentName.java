package student;

public class StudentName {

    String name;

    StudentName(){

        System.out.println("Your name is : Unknown" );
    }

    StudentName(String name){

        this.name = name;
        System.out.println("Your name is : "+ this.name);
    }
}
