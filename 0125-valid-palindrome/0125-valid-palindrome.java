class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        s = s.toLowerCase();
        for (int i = s.length() - 1; i >= 0; i--) {
            char f = s.charAt(i);
            if ((f >= 'a' && f <= 'z') || (f >= '0' && f <= '9')) {
                res.insert(0, f);
                rev.append(f);
            }
        }
        if (!rev.toString().equals(res.toString())) {
            return false;
        }
        return true;
    }
}