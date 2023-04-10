class Solution {
    public long solution(int a, int b) {
        // 입력: 2개의 정수가 주어집니다.
        // 목표: 정수 a, b 사이에 속한 모든 정수의 합을 리턴
        long answer = 0;
        
        // 반복문 횟수, 범위를 구하기 위한 최댓값과 최솟값
        int big, small;
        if ( a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }
            
        // 최솟값 ~ 최댓값 까지의 합을 구하는 반복문
        for(int i = 0; small <= big; i++) {
            answer += small;
            small++;
        }
        return answer;
    }
}