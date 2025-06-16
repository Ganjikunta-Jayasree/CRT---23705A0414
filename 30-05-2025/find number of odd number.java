import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num<0){
          System.out.println("enter a positive number");
        }
        while(num>0){
            int reaminingnumber=num%10;
            if(num%2!=0){
                count = count+1;
                
            }
            num=num/10;
        }
            System.out.println("number of odd digits:"+count);
        
    }
}