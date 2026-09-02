class Solution {
    public char findTheDifference(String s, String t) {

        String g = t;

        for (int i = 0; i < s.length(); i++) {
            g = g.replaceFirst(String.valueOf(s.charAt(i)), "");
        }

        return g.charAt(0);
    }
}