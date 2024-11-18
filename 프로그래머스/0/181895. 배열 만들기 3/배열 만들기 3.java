class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int s1 = intervals[0][0]; int e1 = intervals[0][1]; 
        int s2 = intervals[1][0]; int e2 = intervals [1][1];
        int[] answer = new int[(e1-s1+1)+(e2-s2+1)];
        int idx = 0;
        for(int j = s1; j <= e1; j++){
            answer[idx] = arr[j];
            idx++;
            }
        for(int j = s2; j <= e2; j++){
            answer[idx] = arr[j];
            idx++;
        }
        
        return answer;
    }
}