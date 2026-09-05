class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        String rev ="";
        s=s.toLowerCase();
        for(int i = s.length()-1; i>=0;i--){
            char f = s.charAt(i);
            if((f>='a'&& f<='z')||(f>='0'&& f<='9')){  
                res=f+res;
                rev=rev+f;
            }
            if(!rev.equals(res)&& i == 0) return false;
        }
                

        return true;
    }
}