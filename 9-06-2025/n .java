import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       int count=0;
       while(n>1){
        n=(int)( n/Math.sqrt(n));
        n=(int)n;
        if(n<=1){
            count++;
        break;
       }
       n=n-1;
       count++;
    }
        System.out.println("count:"+count);
    }
}