import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner ref=new Scanner(System.in);
      int year=ref.nextInt();
      if(year%400==0 || (year%4==0 && year % 100!=0)){
          System.out.println("its leap year"+year);
      }
      else{
                    System.out.println("its not a leap year"+year);

      }
    }
}
