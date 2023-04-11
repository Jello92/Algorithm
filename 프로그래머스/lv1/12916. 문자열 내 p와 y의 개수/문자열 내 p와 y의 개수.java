class Solution {
    boolean solution(String s) {
        int countY = 0;
        int countP = 0;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                countP++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                countY++;
            }
        }

        boolean a;
        if (countP == countY){
            a = true;
        } else {
            a= false;
        }
        
        return a;
    }
}
