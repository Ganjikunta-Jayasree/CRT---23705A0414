class Main {
    public static void main(String[] args) {
       int[] nums={1,2,3,8,9,10,19,20};
       int target=19;
       int left=0;
       int index=-1;
       int right=nums.length-1;
       while(left<=right){
           int mid=(left+right)/2;
           if(target>nums[mid]){
               left=mid+1;
           }
           else if(target<nums[mid]){
               right = mid-1;
           }
           else{
               index=mid;
           break;
           }
       }
       System.out.println(index==-1?"Elements is not found":"Elements is found at index:"+index);
}
}