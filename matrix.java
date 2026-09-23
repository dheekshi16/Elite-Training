import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
       Scanner ref=new Scanner(System.in);
       int r=ref.nextInt();
       int c=ref.nextInt();
       
       int[][] arr=new int[r][c];
       for(int i=0;i<r;i++){
          for (int j=0;j<c;j++){
               arr[i][j]=ref.nextInt();
               System.out.print(arr[i][j]);
           }
           System.out.println();
       }
	}
}