import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner ref=new Scanner(System.in);
      int n=ref.nextInt();
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(i==j ){
                  System.out.print(i+1);
              }
              else if((i+j)==(n-1)){
                  System.out.print(j+1);
              }
              else{
                  System.out.print(" ");
              }
          }
      System.out.println();
      }
}
}
