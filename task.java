import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ref=new Scanner(System.in);
	    int n=ref.nextInt();
	    int[] arr=new int[n];
        int r=ref.nextInt();
	    for(int i=0;i<n;i++){
	        arr[i]=ref.nextInt();
	    }
int tar=ref.nextInt();
 for(int i=0;i<n;i++){
        int sum = arr[i];
    for(int j=0;j<n;j++){
        if(i!=j){
        sum+=arr[j];
        if(i>j && sum>tar){
            break;
        }
        else if(i<j && sum==tar){
            System.out.print(arr[i]);
        }
        }
    }
     }
	}
}

