class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int[] c = new int[a.length]; // 길이를 a.length만큼 주는 것


        for(int i = 0; i < a.length; i++){
                c[i] = a[i] * b[i];
        }

        for(int i = 0; i < c.length; i++){
            answer += c[i];
        }
        return answer;
    }
}