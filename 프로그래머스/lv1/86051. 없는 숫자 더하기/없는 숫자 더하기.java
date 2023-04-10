class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        boolean[] box = new boolean[10];
        for (int i = 0; i < numbers.length; i++) {
            box[numbers[i]] = true;
        }
        for (int i = 0; i < 10; i++) {
            if (!box[i]) {
                sum += i;
            }
        }
        return sum;
    }
}
