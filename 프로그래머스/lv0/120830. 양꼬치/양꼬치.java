class Solution {
    public int solution(int n, int k) { // 10, 3
        int price = n * 12000; // 120000
        int freeDrinks = n / 10; // 3/10 = 0.3 = 0
        int drinkPrice = k > freeDrinks ? (k - freeDrinks) * 2000 : 0; //3-0 = 3 *2000 = 6000
        return price + drinkPrice;
    }
}