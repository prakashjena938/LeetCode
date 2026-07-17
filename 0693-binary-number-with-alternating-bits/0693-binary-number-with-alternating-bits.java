class Solution {
    public boolean hasAlternatingBits(int n) {
        int temp = n;
        int iter = 1;
        int pev = -1;
        boolean reasult = true;
        while(temp>0){
            int remender =temp % 2;
            if (pev != -1 && remender == pev) {
        reasult = false;
        break;
    }
            pev = remender;
            iter *= 10;
            temp /= 2;
        }

        return reasult;

        
    }
}