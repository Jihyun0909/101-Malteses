//자릿수의 합으로 나눈 나머지 0
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int original = x;
        
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        
        if(original%sum != 0){
            answer = false;
        }
        return answer;
    }
}