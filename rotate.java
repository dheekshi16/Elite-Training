import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ref=new Scanner(System.in);
	    int n=ref.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=ref.nextInt();
	    }
	    int r=ref.nextInt();
	    int k=0;
	    while(k<r){
	    int t=arr[0];
	    for(int i=0;i<n-1;i++){
	        arr[i]=arr[i+1];
	    }
	        arr[n-1]=t;
	        k++;
	    }
	    for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	    }
	}
}