class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        if(x1||x2){
            if(x3||x4)
                answer = true;
            else
                answer = false;
        }
        else if(!(x1||x2))
            answer = false;
            
        return answer;
    }
}