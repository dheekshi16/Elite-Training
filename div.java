Scanner ref=new Scanner(System.in);
       int size=ref.nextInt();
       int[] a=new int[size];
       int sum=0;
       int b=0;
       for(int i=0;i<size;i++){
           a[i]=ref.nextInt();
           sum=sum+a[i];
          
           
           }
            b=sum/size;
           System.out.print(b);
