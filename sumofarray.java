import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ref=new Scanner(System.in);
        int size=ref.nextInt();
        int[] arr=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
          arr[i]=ref.nextInt();
           sum+=arr[i];
            }
        System.out.println(sum);
    }
    
}
