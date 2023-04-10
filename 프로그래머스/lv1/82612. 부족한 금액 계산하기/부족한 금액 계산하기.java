class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long[] cost = new long[count];

        for(int i=0; i <count; i++){
            cost[i] = (long)price * (i +1);
            answer += cost[i];
        }

        if(answer > money){
            return answer - money;
        } else {
            return 0;
        }

    }
}