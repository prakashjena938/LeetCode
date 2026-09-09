class Solution {
    public int heightChecker(int[] heights) {
        int a[] = heights.clone();
        int count =0;
         for(int i = 0;i<heights.length;i++){
            for(int j = 0; j<heights.length-1-i;j++){
                if(heights[j]>heights[j+1]){
                    //swap
                    int temp =heights[j];
                    heights[j]= heights[j+1];
                    heights[j+1]= temp;
                }
            }
            if(a[heights.length-1-i]!=heights[heights.length-1-i]) count++;
         }
         
         return count;
        
    }
}