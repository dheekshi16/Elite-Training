import java.util.Scanner;
abstract class payment{
  int   TransactionID;
   String   CustomerName;
    int  Amount;
    
  abstract  payment(int tid,String cname,int amount){
        this.TransactionID=tid;
        this.CustomerName=cname;
        this.Amount=amount;
    }
    
    void displaypayment(){
        System.out.println(TransactionID);
        System.out.println(CustomerName);
        System.out.println(Amount);
    }
    
    abstract boolean validate();
    abstract void process();
    abstract double transac();
    
    class CreditCardPayment{
        Scanner ref=new Scanner(System.in);
        String num=ref.nextLine();
        if(num.length()==16){
            System.out.println("VALID");
           
        } 
        else{
            System.out.println("INVALID");
        }
    }
       
}

public class Main
{
	public static void main(String[] args) {
    	}
}


