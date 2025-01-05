import java.util.Arrays;
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for(int i = 0; i < answer.length; i++){
            Arrays.fill(answer[i], 0);
        }
        
        for(int i = 0; i < answer.length; i++){
            answer[i][i] = 1;
        }
        return answer;
    }
}