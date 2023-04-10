class Solution {
    public String solution(String my_string, String letter) {
        char[] chars = my_string.toCharArray();
        char l = letter.charAt(0);

        for(int i =0; i < chars.length; i++){
            if(chars[i] == l){
                chars[i] = ' '; // replace the letter with a space
            }
        }
        String answer = new String(chars).replaceAll(" ", ""); // convert the modified char array to a string and remove the space
        return answer;
    }
}