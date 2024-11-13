class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        char[][] result = new char[my_string.length()/m][m];
        
            for(int i = 0; i < my_string.length()/m; i++){
                for(int j = 0; j < m; j++){
                    result[i][j] = my_string.charAt(index++);
                    }
            }
        for(int i = 0; i < my_string.length()/m; i++){
            answer.append(result[i][c-1]);
        }
        
        return answer.toString();
    }
}