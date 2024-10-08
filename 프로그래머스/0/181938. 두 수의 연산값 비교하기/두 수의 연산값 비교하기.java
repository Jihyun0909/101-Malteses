class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aText = Integer.toString(a);
        String bText = Integer.toString(b);
        String result1 = aText + bText;
        int result2 = 2*a*b;
        
        if(Integer.parseInt(result1)>=result2)
            answer = Integer.parseInt(result1);
        else
            answer = result2;
        return answer;
    }
}