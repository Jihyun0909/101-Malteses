class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;
        for(int i = 1; i <= count; i++){
            totalPrice += price*i;
        }
        
        if(money < totalPrice)
            answer = (long)totalPrice - money;
        else
            return 0;

        return answer;
    }
}