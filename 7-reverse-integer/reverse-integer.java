class Solution {
    public int reverse(int x) {
        // if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE){
        //     return 0;
        // }
        long result=0;
        if(x<0){
            int temp=-x;
            while(temp>0){
                int rem=temp%10;
                temp=temp/10;
                result=result*10+rem;
            }
            return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) ? 0 : -(int) result;
        }else{
            while(x>0){
                int rem=x%10;
                x=x/10;
                result=result*10+rem;
            }
            return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) ? 0 : (int) result;
        }
        
    }
}