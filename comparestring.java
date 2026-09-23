import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner ref=new Scanner(System.in);
	    String n1=ref.next();
	    String n2=ref.next();
	    if(n1.length()>n2.length()){
	        System.out.print("string 1 is greater");
	    }
	    else if (n1.length()<n2.length()) {
	  System.out.print("string 1 is smaller");

	    }
	    else{
	  System.out.print("equal");

	    }
	    
	}
}