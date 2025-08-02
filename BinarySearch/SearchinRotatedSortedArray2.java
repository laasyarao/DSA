package BinarySearch;

public class SearchinRotatedSortedArray2 {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
           int mid=start+(end-start)/2;
           if(nums[mid]==target){
               return true;
           }
           if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
               start++;
               end--;
               continue;
           }
// if (4 < 4 && 4 < 7) { // false
// 🚨 This condition fails because 4 < 4 is false, so we move to the right half incorrectly (start = mid + 1).

// ❌ We lose the target because we skipped nums[start] (4), even though it was the answer!
           if(nums[start]<=nums[mid]){
               if(nums[start]<=target && target<=nums[mid]){
                   end=mid-1;
               }
               else{
                   start=mid+1;
               }
           }

           else{
               if(nums[mid]<=target && target<=nums[end]){
                   start=mid+1;
               }
               else{
                   end=mid-1;
               }
           }
        }
        return false;
   }
}
