class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr= s.toCharArray();
        int longest= 0;
        for(int i=0; i<arr.length;i++){
            List<Character> temp= new ArrayList();
            for(int j=i; j<arr.length;j++){
                if(!temp.contains(arr[j])){
                    temp.add(arr[j]);
                }else{
                   break; 
                }
            }
            longest=Math.max(longest, temp.size());
            temp.clear();
        }
        return longest;
        
    }
}