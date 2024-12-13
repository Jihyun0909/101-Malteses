class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String temp = myString.replace('A','X').replace('B','A').replace('X','B');
        
        if(temp.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}