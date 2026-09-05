class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char f = s.charAt(i);
            if (f >= 'A' && f <= 'Z') {
                f = (char) (f + 32);
            }
            if ((f >= 'a' && f <= 'z') || (f >= '0' && f <= '9')) {
                res.append(f);
            }
        }
        rev.append(res);
        rev.reverse();
        return res.toString().equals(rev.toString());
    }
}