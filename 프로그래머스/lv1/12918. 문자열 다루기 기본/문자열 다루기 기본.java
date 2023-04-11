class Solution {
    public boolean solution(String s) { //a234
        int length = s.length();
        if (length == 4 || length == 6){
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c < '0' || c > '9') {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}