class Main {
    public static void main(String[] args) {
       int[] nums={2,4,6,9,10,13};
       int evennumcount=0;
       for(int i=0;i<nums.length;i++){
           int value=nums[i];
           if(value%2==0){
              evennumcount=evennumcount+1;
           }
       }
       System.out.println("count:"+evennumcount);
    }
}