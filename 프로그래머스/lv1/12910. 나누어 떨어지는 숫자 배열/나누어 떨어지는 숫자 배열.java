import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[index] = arr[i];
                index++;
            }
        }

        if(index == 0) { 
            return new int[]{-1}; // Return an array with -1 as the only element
        } else {
            int[] result = new int[index];
            for (int i = 0; i < index; i++) {
                result[i] = answer[i];
            }
            Arrays.sort(result); // Sort the array in ascending order
            return result; // Return the sorted array with only the added elements
        }
    }
}

