import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        
        int possible = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i=i+2) {

            possible =possible+nums[i];

        }
        return possible;

    }
}