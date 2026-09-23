import java.util.Scanner;
class Main {
    public static void main(String[] args) {
           Scanner ref=new Scanner(System.in);
           int n=ref.nextInt();
           int[] rank=new int[n];
           rank[0]=ref.nextInt();
           for(int i=1;i<n;){
               int temp=ref.nextInt();
               if(temp!=rank[i-1]){
                   rank[i]=temp;
                   i++;
               }
               else if(temp==rank[i-1]){
                   n--;
               }
               }
               for(int i=0;i<n;i++){
             System.out.print(rank[i]+" ");
           }
           
    }
}
