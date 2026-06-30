import java.math.*;

class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger  num = BigInteger.ZERO;
        for (int i = 0; i<digits.length;i++){

            num= (num.multiply(BigInteger.TEN)).add(BigInteger.valueOf(digits[i]));    
                
        }
        num=num.add(BigInteger.ONE);

        String s = num.toString(); 
        int finalInt[]=new int[s.length()];
        
        for(int i = s.length() - 1; i>=0; i--){
            finalInt[i] =num.mod(BigInteger.TEN).intValue();
            num = num.divide(BigInteger.TEN);
        
        }
        

        return finalInt;
        
    }
}