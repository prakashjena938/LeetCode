class Solution {
    int multiple=1;
    public int missingMultiple(int[] nums, int k) {

        
        
        for (int i = 1; i <= nums.length+1; i++) {

             multiple = k * i;
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (multiple == nums[j]) {
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }

            if (found == false) {
                break;
            }
        }
        return multiple;
    }
}