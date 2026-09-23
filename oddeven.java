import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        int a=ref.nextInt();
        int even=0;
        int odd=0;
        while(a>0){
            int d=a%10;
            if(d%2==0){
                even=even+1;
            }
            else{
                odd+=1;
            }
            a=a/10;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
