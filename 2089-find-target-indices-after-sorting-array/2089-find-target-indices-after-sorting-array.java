class Solution {
     List<Integer> a = new ArrayList<Integer>();
    public List<Integer> targetIndices(int[] nums, int target) {
       
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    //swap
                    int temp =nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
            if(nums[nums.length-1-i]==target) a.addFirst(nums.length-1-i);
        }
        
        return a;
    }
}