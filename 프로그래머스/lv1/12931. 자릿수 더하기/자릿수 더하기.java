import java.util.*;

public class Solution {
      public int solution(int n) {
        int answer = 0;
        String temp = Integer.toString(n);
        int[] numbers = new int[temp.length()];

        for(int i=0; i < temp.length(); i++) {
            numbers[i] = Character.getNumericValue(temp.charAt(i));

            answer += numbers[i];
        }

        return answer;
    }
}