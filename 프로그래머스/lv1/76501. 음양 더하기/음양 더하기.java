class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) { 
            int value = absolutes[i];
            if(signs[i]){    
                   sum += value; 
               } else { 
                   sum -=value; 
               }
            }
        return sum;
    }
}