class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()<s.length() || goal==null) return false;
        s = s+s;
        if(s.contains(goal)) return true;
        return false;
    }
}