package BinarySearch;

public class Floor {
    static int floor(int nums[], int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        //what if target is greater than greatest element in array
        if(target>nums[nums.length-1]){
            return -1;
        }
        //Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){
                ans=nums[mid];
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
        }
        return ans;
    }
}
