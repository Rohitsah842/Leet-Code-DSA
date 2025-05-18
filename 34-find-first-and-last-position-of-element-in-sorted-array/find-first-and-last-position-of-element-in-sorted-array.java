class Solution {
    public int[] searchRange(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;

        while(start<=end){
            if(nums[start]==target && nums[end]==target){
                return new int[]{start, end};
            }else if(nums[start]==target){
                end--;
            }else if(nums[end]==target){
                start++;
            }else{
                start++;
            end--;
            }
            

        }
        return new int[]{-1,-1};
        
    }
}