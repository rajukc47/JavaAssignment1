package hcf;

public class HCFTwoNumber {

    public int a, b, i, hcf=0;

    public void hcfCalculation(int f, int s){

        a =  f;

        b = s;

        for(i = 1; i < a || i < s;i ++){

            if((a % i == 0) && (b % i ==0)){

                hcf=i;
            }

        }

        System.out.println("HCF of " + a +" and " + b +" is :" + hcf);
    }


}
