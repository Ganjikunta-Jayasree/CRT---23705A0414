import java.util.Stack;
class Main {
    public static void main(String[] args) {
       Stack<Integer> s = new Stack<Integer>();
       s.push(10);
       s.push(20);
       s.push(30);
       pushBottom(s,40);
       System.out.println("Elements in the stack are:");
       System.out.println(s);
    }
    public static void pushBottom(Stack<Integer>Stack,int ele){
        if(Stack.isEmpty()){
            Stack.push(ele);
            return;
        }
        int val=Stack.pop();
        pushBottom(Stack,ele);
        Stack.push(val);
    }
    
}