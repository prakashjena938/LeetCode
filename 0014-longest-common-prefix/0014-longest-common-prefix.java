class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String s = strs[0];
        String result="";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            char common =' ';
               
            for(int j = 1;j<strs.length;j++){
                String a = strs[j];
                
                if (i < a.length() && a.charAt(i) == ch) common = a.charAt(i);
                else{ 
                    common = ' ';
                    break;
                }
            }
            if(common == ' ') break;
           else if(i==0) result = ""+common;
           else  result = result+common;

        }
        return result;
    }

}