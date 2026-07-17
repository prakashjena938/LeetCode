class Solution {
    public int maxNumberOfBalloons(String text) {
        int a = 0;
        int b = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        
        String word = text.toLowerCase();
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i)=='a'){
                a=a+1;
            }
           else if(word.charAt(i)=='b'){
                b=b+1;
            }
           else if(word.charAt(i)=='l'){
                l=l+1;
            }
           else if(word.charAt(i)=='o'){
                o=o+1;
            }
           else if(word.charAt(i)=='n'){
                n=n+1;
            }

        }       
        l=l/2;
        o=o/2 ;

        return min(min(min(min(o,l),n),a),b);
         
    }

    public static int min(int a , int b){
        return (a>b)?b:a;
    }
}