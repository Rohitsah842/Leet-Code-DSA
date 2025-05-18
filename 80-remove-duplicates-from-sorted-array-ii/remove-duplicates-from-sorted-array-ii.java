class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> tempMap= new LinkedHashMap<>();
        for(int num:nums){
            if(tempMap.containsKey(num)){
            tempMap.put(num, tempMap.get(num)+1 );
            }else{
               tempMap.put(num, 1 ); 
            }
        }
        int i=0;
        for(Map.Entry<Integer, Integer> entry: tempMap.entrySet()){
            // System.out.println(entry.getKey()+" "+ entry.getValue());
           if(entry.getValue()>=2){
            nums[i++]=entry.getKey();
            nums[i++]=entry.getKey();
           }else if(entry.getValue()==1){
            nums[i++]=entry.getKey();
           }
        }

        return i;
        
    }
}