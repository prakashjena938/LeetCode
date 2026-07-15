class Solution {

    public int romanToInt(String s) {

        String t = s.toUpperCase();

        int I;
        int V;
        int X;
        int L;
        int C;
        int D;
        int M;

        int sum = 0;

        for (int i = t.length()-1; i >= 0; i--) {
        
            if (t.charAt(i) == 'I') {
                I = 1;
                sum +=I;
            }

            if (t.charAt(i) == 'V') {
                V = 5;

                if (i>0 &&t.charAt(i - 1) == 'I' && t.charAt(i) == 'V') {
                    V = 3;
                }

                sum +=V;
            }

            if (t.charAt(i) == 'X') {
                X = 10;

                if (i>0 &&t.charAt(i - 1) == 'I' && t.charAt(i) == 'X') {
                    X = 8;
                }

                sum +=X;
            }

            if (t.charAt(i) == 'L') {
                L = 50;

                if (i>0 &&t.charAt(i - 1) == 'X' && t.charAt(i) == 'L') {
                    L = 30;
                }

                sum +=L;
            }

            if (t.charAt(i) == 'C') {
                C = 100;

                if (i>0 &&t.charAt(i - 1) == 'X' && t.charAt(i) == 'C') {
                    C = 80;
                }

                sum +=C;
            }

            if (t.charAt(i) == 'D') {
                D = 500;

                if (i>0 &&t.charAt(i - 1) == 'C' && t.charAt(i) == 'D') {
                    D = 300;
                }

                sum +=D;
            }

            if (t.charAt(i) == 'M') {
                M = 1000;

                if (i>0 &&t.charAt(i - 1) == 'C' && t.charAt(i) == 'M') {
                    M = 800;
                }

                sum +=M;
            }
        }
        return sum ;
    }
}