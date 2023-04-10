class Solution {
    public double solution(int[] arr) {
        int r = 0;
        for(int i = 0; i < arr.length; i++){
            r += arr[i];
        }
        return (double) r / arr.length;
    }
}