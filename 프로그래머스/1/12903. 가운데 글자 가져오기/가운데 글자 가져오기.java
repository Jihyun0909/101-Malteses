class Solution {
    public String solution(String s) {
        String answer = "";
        //길이가 홀수인 경우
        if(s.length() % 2 != 0){
            answer += s.charAt(s.length()/2);
        }else{
            answer += s.charAt(s.length()/2-1);
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }
}