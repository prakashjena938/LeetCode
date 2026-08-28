class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 1; 
        int i = 0;     

        for (int j = i + 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                count++;
            }
            else{
                continue;
            }
        }

        return count;
    }
}