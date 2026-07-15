class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean result = true;
        if(nums.length>1){
            for(int i = 0; i<=nums.length-2; i++){
                if((nums[i] % 2 == 0 && nums[i+1] % 2 != 0) || (nums[i+1] % 2 == 0 && nums[i] % 2 != 0)){
                    result = true;
                }
                else {
                    result = false;
                    break;
                }
            }
            return result;
            
        }
        else{
            return result;
        }
        
    }
}