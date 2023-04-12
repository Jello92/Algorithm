import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);


        if(array.length % 2 != 0){
            int a = array[array.length /2];
            answer = a;
        }

        return answer;
    }
}