// i행 -> n열 -> n행 역순 -> i번째 열 역순
// i+1행 -> n-1 열 - > n - 1행 역순 -> i+2번째 열 역순 
// i+2행 -> n-2 열..
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = n-1;
        while(startRow <= endRow){
        //첫번째 행
        for(int i = startCol; i <= endCol; i++)
            answer[startRow][i] = num++;
        startRow++;
        //n-1번째 열
        for(int i = startRow; i <= endRow ; i++)
            answer[i][endCol] = num++;
        endCol--;
        //n-1번째 행
        for(int i = endCol; i >= startCol; i--)
            answer[endRow][i] = num++;
        endRow--;
        //첫번째 열
        for(int i = endRow; i >= startRow; i--)
            answer[i][startCol] = num++;
        startCol++;
        }
        

        
        return answer;
    }
}