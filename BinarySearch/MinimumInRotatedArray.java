package BinarySearch;

public class MinimumInRotatedArray {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int n=nums.length;
        int minimum=Integer.MAX_VALUE;
        if(nums[start]<=nums[end]){
          return nums[start];
        }
        while(start<=end){
          int mid=start+(end-start)/2;
          if(nums[start]<=nums[mid]){
              minimum=Math.min(nums[start], minimum);
              start=mid+1;
          }
          else if(nums[mid]<=nums[end]){
              minimum=Math.min(nums[mid], minimum);
              end=mid-1;
          }
        }
  
        return minimum;
      }
}
