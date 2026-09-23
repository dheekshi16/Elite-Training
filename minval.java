import java.util.Scanner;
public class Main

{

	public static void main(String[] args) {
	    Scanner ref=new Scanner(System.in);
	    int size=ref.nextInt();
	    int[] arr=new int[size];
	    arr[0]=ref.nextInt();
	    int min=arr[0];
	    for(int i=1;i<size;i++){
	        arr[i]=ref.nextInt();
	        if(arr[i]<min){
	            min=arr[i];
	        }

	        
	    }
	    	        System.out.println(min);
	
	}
}

