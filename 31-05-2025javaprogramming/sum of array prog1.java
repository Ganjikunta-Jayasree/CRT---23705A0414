class Main {
    public static void main(String[] args) {
       int[] nums={25,75,100,125};
       int sum=0;
       for(int i=0;i<nums.length;i++){
           int values=nums[i];
           sum= sum+values;
       }
       System.out.println("sum of elements in an array:"+sum);
    }
}