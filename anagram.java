import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner ref=new Scanner(System.in);
      String a=ref.next();
      String b=ref.next();
      if(a.length()!=b.length()){
          System.out.print("not a anagram");
      }
      char[] arr1=a.toCharArray();
      char[] arr2=b.toCharArray();
      for(int i=0;i<arr1.length;i++){
          for(int j=i+1;j<arr1.length;j++){
          if(arr1[i]>arr1[j]){        
              char temp=arr1[i];
              arr1[i]=arr1[j];
              arr1[j]=temp;
          }
      }
      }
      for(int i=0;i<arr2.length;i++){
          for(int j=i+1;j<arr2.length;j++){
              if(arr2[i]>arr2[j]){
                  char temp=arr2[i];
                  arr2[i]=arr2[j];
                  arr2[j]=temp;
              }
          }
      }
      boolean ana=true;
      for(int i=0;i<arr1.length;i++){
          if(arr1[i]!=arr2[i]){
              ana=false;
          }
      }
      if(ana){
          System.out.print("its anagram");
      }
      else{
          System.out.print("its not a anagram");
      }
    }
}