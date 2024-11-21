class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        
        //앞에 붙이기
        for(int i = n; i < num_list.length; i++){
            answer[idx++] = num_list[i];
        }
        //이어 붙이기
        for(int i = 0; i < n; i++){
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}