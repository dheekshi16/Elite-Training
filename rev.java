import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner ref=new Scanner(System.in);
     int num=ref.nextInt();
     int temp =num;
     int rev=0;
 
     for(int i=0;i<num;i++){
         int n=num%10;
         rev=rev*10+n;
         num=num/10;
         
     }
     System.out.print(rev);
        
    }
}