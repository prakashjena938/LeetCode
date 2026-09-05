class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        String rev ="";
        s=s.toLowerCase();
        for(int i = s.length()-1; i>=0;i--){
            char f = s.charAt(i);
            if((f>='a'&& f<='z')||(f>='0'&& f<='9'))  rev+=f;
        }
        for(int j = 0; j<s.length();j++){
            char b = s.charAt(j);
            if((b>='a'&& b<='z')||(b>='0'&& b<='9'))  res+=b;
        }
        if(rev.equals(res)) return true;

        return false;
    }
}