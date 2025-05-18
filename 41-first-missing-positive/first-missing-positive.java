class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>1){
            return 1;
        }
        
        if(nums[0]<=0 && nums[nums.length-1]<=0){
            return 1;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]){
            if(nums[i]>=0 &&  nums[i+1]!=nums[i]+1){
                return nums[i]+1;
            }else if(nums[i+1]>1 && nums[i+1]-nums[i]!=1 ){
                return 1;
            }
            }
        }
        return nums[nums.length-1]+1;
    }
}