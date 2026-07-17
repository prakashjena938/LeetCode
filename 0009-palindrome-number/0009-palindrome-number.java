class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int num=0;
        while(temp>0){
            int y = temp % 10;
             num = (num * 10) + y ;
            temp/=10;
        }
        if(num == x) return true;
        else return false;
        
    }
}