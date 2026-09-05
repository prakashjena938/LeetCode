class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        s = s.toLowerCase();
        while(right>left){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!((l>='a'&& l<='z')||(l >= '0' && l <= '9'))) {
                left++;
                continue;
            }
            if(!((r>='a'&& r<='z')||(r >= '0' && r <= '9'))) {
                right--;
                continue;
            }
            if(!(l==r)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}