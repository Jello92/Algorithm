class Solution {
       public String solution(int a, int b) {
        // create an array of days in each month
        int[] daysInMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        // create an array of days of the week
        String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // add up the number of days in all the previous months
        int totalDays = 0;
        for (int i = 0; i < a-1; i++) {
            totalDays += daysInMonth[i];
        }
        
        // add the number of days in the current month
        totalDays += b-1;
        
        // determine the day of the week and return it as a string
        int dayIndex = totalDays % 7;
        String dayOfWeekString = dayOfWeek[dayIndex];
        return dayOfWeekString;
    }
}