package BinarySearch;

import java.util.ArrayList;

public class CountArrayRotations {
     public int findKRotation(ArrayList<Integer> nums) {
      int start=0;
      int end=nums.size();
      int minimum=Integer.MAX_VALUE;
      int rotationCount=0;
      if(nums.get(start)<=nums.get(end)){
        return rotationCount;
      }
      while(start<=end){
        int mid=start+(end-start)/2;
        if(nums.get(start)<=nums.get(mid)){
            if(nums.get(start)<minimum){
                minimum=nums.get(start);
                rotationCount=start;
                
            }
            start=mid+1;
        }
        else if(nums.get(mid)<=nums.get(end)){
            if(nums.get(mid)<minimum){
                minimum=mid;
                rotationCount=mid;
            }
            end=mid-1;
        }
      }

      return rotationCount;
    }
}
