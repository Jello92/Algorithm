class Solution {
    public long solution(long n) {
        long answer = 0;
        Double a = Math.sqrt(n);

        if(a == a.intValue()){  //만약 a가 맞아떨어지면...
            answer = (long) ((a + 1) * (a + 1));
        } else {
            answer = -1;
        }



        return answer;
    }
}
