class Solution {
    public String solution(String s) {
        int length = s.length();
        int middleIndex = length / 2;
        if (length % 2 == 0) {
            return "" + s.charAt(middleIndex - 1) + s.charAt(middleIndex);
        } else {
            return "" + s.charAt(middleIndex);
        }
    }
}