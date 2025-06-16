class Main {
    public static void main(String[] args) {
       int num = 452;
       int count=0; 
       while(num>0){
           int reaminingnumber=num/10;
           int lastdigit=num%10;
          count=count+1;
           num=reaminingnumber;
       }
       System.out.println("number of digits:"+count);
    }
}