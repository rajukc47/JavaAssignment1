package shopping;

public class Purchase {

    public int qty;
    public int price = 100;

    public void TotalCost(){

        if(qty>1000){
            System.out.println("Your total cost of shopping with 10% discount is : " + ((qty * price)-(qty * price) * 0.1));
        }
        else {
            System.out.println("Your total cost of shopping is : " + (qty * price));
        }
    }

}
