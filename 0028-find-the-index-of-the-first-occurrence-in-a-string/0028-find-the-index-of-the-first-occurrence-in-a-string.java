class Solution {
    public int strStr(String haystack, String needle) {
        
        
        if(haystack.length()<needle.length()) return -1;
        int i =0;
        while(i<=haystack.length()-needle.length()){
            String res="";
            for(int j = i;j<=i+needle.length()-1;j++){
                res += haystack.charAt(j);
            }
            if(res.equals(needle)) return i;
            i++;

        }
        return -1;
    }
}