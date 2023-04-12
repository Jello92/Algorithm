import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] array = numbers;
        int size = array.length;
        Arrays.sort(array);

        int max1 = array[size-1];
        int max2 = array[size-2];

        answer = max1 * max2;

        return answer;
    }
}