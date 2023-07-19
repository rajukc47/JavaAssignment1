package factorial;

public class FactorialPrint {

    int num,fact=1;

    public void printFactorial(){

        for(int i = 1; i <= num; i++){

            fact*=i;
        }
        System.out.println("Factorial of " + num +" is : "+ fact);
    }
}
