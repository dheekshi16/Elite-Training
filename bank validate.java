

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("---bank account---");
        int balance=1000;
        int pin=1234;
         System.out.println("enter your choice");
         Scanner obj=new Scanner(System.in);
         while(true){
                     System.out.println("1.account holder name:");
                     System.out.println("2.pin valid");
                     System.out.println("3.deposit amount");
                     System.out.println("4.widthamount");
            int choice=obj.nextInt();
            switch(choice){
                case 1:
                    System.out.println("prithika's");
                    break;
               case 2:
                   System.out.println("enter your pin no:");
                   int pinnum=obj.nextInt();
                   if(pinnum==pin){
                       System.out.println("your pin is crt! And your balance is:"+" "+balance);
                   }   
                    else{
                        System.out.println("invalid pin number!");
                    } 
                    break;
                 case 3:
                    System.out.println("enter the deposit amount:");
                    int depositamount=obj.nextInt();
                     balance+=depositamount;
                    System.out.println("And the current balance is:"+" "+balance);
                    break;
                case 4:
                   System.out.println("enter the amount to widthdraw:");
                   int widthdraw=obj.nextInt();
                   if(widthdraw > balance){
                       System.out.println("insufficient balamce");
                   }
                   else{
                       System.out.println("amount widthdrawn!");
                      System.out.println(balance-widthdraw);
                       
                   }
                   break;
                   default:
                         System.out.println("invalid choice!");

                     }


         }
         
         

    }
}

