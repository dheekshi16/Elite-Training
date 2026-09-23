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
         		int sum=0,j;
    		    for(j=k;j<=i;j++){
    		  //  System.out.print(arr[j]+" ");
    		    sum+=arr[j];
    		   
    		    }
    		    if(tar==sum){
    		        int count=0;
    		      for(int s=k;s<=j-1;s++){
    		    
    		      System.out.print(arr[s]+" ");
    		      count++;
    		      }
    		      System.out.print(": "+count);
    		      //if()
    		      System.out.println();
    		    }
    		}
    		
		}
	}
}

