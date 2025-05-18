class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        for(int k:nums2){
            nums1[i++]= k;
        }
        Arrays.sort(nums1);
        
    }
}