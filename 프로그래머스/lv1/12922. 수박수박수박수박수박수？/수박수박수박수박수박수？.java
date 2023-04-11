class Solution {
    public String solution(int n) {
        int[] arr = new int[n];
        String[] x = {"수","박"};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2; // fill array with 0s and 1s in a repeating pattern
        }

        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += x[arr[i]]; // append "수" or "박" to the answer string based on the value of arr[i]
        }
        return answer;
    }
}
