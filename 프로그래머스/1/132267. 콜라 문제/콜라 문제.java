//a개를 가져다주면 콜라 b병을 주는
//빈 병 n개를 가져다주면 몇 병
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = n;
        while(tmp >= a){
            int newCoke = (tmp/a) * b; //교환한 콜라 수
            answer += newCoke;
            tmp = newCoke + (tmp%a);
            
        }
        return answer;
    }
}