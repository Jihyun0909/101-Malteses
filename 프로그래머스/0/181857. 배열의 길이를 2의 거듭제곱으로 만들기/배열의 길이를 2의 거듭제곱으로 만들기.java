class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int targetLength = 1;
        while(targetLength < n){
            targetLength *= 2;
        }
        
        int[] answer = new int[targetLength];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        for(int i = n; i < answer.length; i++){
            answer[i] = 0;
        }

        return answer;
    }
}