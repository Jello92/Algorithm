class Solution {
    public String solution(String my_string) {
        int len = my_string.length();
        char[] reversedArr = new char[len];

        for (int i = 0; i < len; i++) {
            reversedArr[i] = my_string.charAt(len - i - 1);
        }

        return new String(reversedArr);
    }
}
