import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr size ?");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements:"+size+" :");
        
        int i=0;
        while(i<size){
            arr[i]=sc.nextInt();
            i++;
        }

        System.out.println("enter the element to be searched:");
        int search=sc.nextInt();

        i=0;
        while(i<size){
            if(arr[i]==search){
                System.out.println("element found");
                return;
            }
            i++;
        }

        System.out.println("element not found");
    }
}
