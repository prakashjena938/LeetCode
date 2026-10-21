class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            for (int i = 0; i < haystack.length(); i++) {
                for (int j = i + needle.length(); j <= haystack.length(); j++) {
                    String s = haystack.substring(i, j);
                    if (needle.equals(s))
                        return i;
                }
            }
        }
        return -1;
    }
}