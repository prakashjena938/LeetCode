class Solution {
    int sum;
    public boolean checkPerfectNumber(int num) {
        if(num==1||num<1) return false;

        for(int i = 1; i<=num/2;i++){
            if(num % i == 0)  sum += i; 
        }
        
        return sum == num ? true : false;
        
    }
}