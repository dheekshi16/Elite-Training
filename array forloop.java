import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr size ?");
        int  size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements:"+size+" :");
        
       for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println("enter the element to be searched:");
        int search=sc.nextInt();
       for(int i=0;i<size;i++){
          if(arr[i]==search){
            System.out.println("element found");
            return;
        }
       
       } System.out.println("element not  found");
        
        

    }
}
