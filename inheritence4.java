 class A{
        int a=25;
        void printdata(int a,int b){
            System.out.println("prithika");
        }
    }
    class B extends A{
        int b=20;
        int printdata(){
          System.out.println("rithick");
          return 10;

        }
    }
    class C extends A{
        int c=30;
        
    }
    class D extends B{
        int d=40;
    }
    class F extends C{
         int f=100;
    }
    class G extends F{
        int g=200;
    }
    



public class Main
{
    
   
	public static void main(String[] args) {
	 B  bref=new B();
	 C cref=new C();
	 G gref=new G();
	 D dref=new D();
	 
// 	 System.out.println(bref.a);
// 	 System.out.println(bref.printdata());
// 	 System.out.println(cref.c);
// 	 System.out.println(cref.a)
// 	 System.out.println(cref.b);
System.out.println(dref.a);
System.out.println(gref.c);
	}
}