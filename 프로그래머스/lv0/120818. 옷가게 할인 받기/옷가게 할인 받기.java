class Solution {
    public int solution(int price) {
        int x = price;
        double y = x;

        int answer = 0;
        if(x >= 100000 && x < 300000){
            y = x * 0.05;
        } else if(x >= 300000 && x < 500000){
            y = x * 0.1;
        }else if(x >= 500000){
            y = x * 0.2;
        } else {
            y = 0;
        }
        answer = (int) (x - y);


        return answer;
    }
}