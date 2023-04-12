class Solution {
    public int[] solution(long n) {
        char[] array = String.valueOf(n).toCharArray();
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        
        String reversed = new String(array);
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = Character.getNumericValue(reversed.charAt(i));
        }
        return answer;
    }
}