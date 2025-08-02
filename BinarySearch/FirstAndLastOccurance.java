package BinarySearch;

public class FirstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        int ans[]= new int[2];
        ans[0]=firstIndex(nums, target);
        ans[1]=lastIndex(nums,target);
         
        return ans;
        }
        public int firstIndex(int nums[], int target){
         int start=0;
        int end=nums.length-1;
         int firstPos=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]<target){
                   start=mid+1;
                }
                else if(nums[mid]>=target){
                    end=mid-1;
                }
                else{
                  firstPos=mid;
                  end=mid-1;
                }
            }
             return firstPos;
           
        }
        public int lastIndex(int nums[], int target){
         int start=0;
        int end=nums.length-1;
             int lastPos=-1;
    
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]<target){
                   start=mid+1;
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                   lastPos=mid;
                   start=mid+1;
                }
            }
            return lastPos;
           
        }
}
