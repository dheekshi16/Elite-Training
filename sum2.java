import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++){
		    arr[i]=sc.nextInt();
		}
		int tar=sc.nextInt();
		for(int k=0;k<a;k++){
		    
    		for(int i=k;i<a;i++){
    		    for(int j=k;j<=i;j++){
    		    System.out.print(arr[j]);
    		    int sum=0;
    		    sum+=arr[j];
    		    if(tar==sum){
    		        System.out.print(sum);
    		    }
    		    }
    		    System.out.println();
    		}
    		 System.out.println();
		}
	}
}

