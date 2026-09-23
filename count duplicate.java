import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int c=1;
            for(int j=0;j<size;j++){
                if(i!=j){
                    if(arr[i]==arr[j] && j>i){
                        c++;
                    }
                    else if(arr[i]==arr[j] && j<i){
                        break;
                    }
                }
            }
            System.out.println(arr[i] + " " +c);
        }
    }
}