public class Main {
    
    public static void main(String[] args) {
        System.out.println("fibonacci of 5:"+fibonacci(5));
        
        for(int i=0;i<10;i++){
  
        }
    }
        public static int fibonacci(int n){
            if(n==0){
                return 1;
            }
            else if(n==1){
                return 1;
            }
            else 
            return fibonacci(n-1)+fibonacci(n-2);
            }
            
        }