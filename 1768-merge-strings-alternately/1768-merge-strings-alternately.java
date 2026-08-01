class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length = word1.length() + word2.length();
        StringBuilder s = new StringBuilder();
        int j =0;
        int k =0;
        for (int i = 0; i < length; i++) {
            if (word1.length() > j && word2.length() > k) {
                if (i % 2 == 0) {
                    s.append(word1.charAt(j));
                    j++;
                } else {
                    s.append(word2.charAt(k));
                    k++;

                }
            } else {
                if ( k< word2.length()) {
                    s.append(word2.charAt(k));
                    k++;
                }
                if (j< word1.length()) {
                    s.append(word1.charAt(j));
                    j++;
                }
            }
            
        }

        return s.toString();
    }
}