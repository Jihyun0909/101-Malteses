import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[31];
        Arrays.fill(answer, 0);
        
        for(int i = 0; i < strArr.length; i++){
            int idx = strArr[i].length();
            answer[idx] += 1;
        }
        
        int max = 0;
        for(int i = 1; i < answer.length; i++){
            if(answer[i] > max){
                max = answer[i];
            }
        }
        
        return max;
    }
}