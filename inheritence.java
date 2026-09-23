class Student {
    String name="prithika";
    int rollno=136;
}
class Faculty extends Student{
    String facname="rithick";
    int id=2503;
}
public class Main{
    public static void main(String [] args){
    Faculty fac=new Faculty();
    System.out.println(fac.facname);
}
}
