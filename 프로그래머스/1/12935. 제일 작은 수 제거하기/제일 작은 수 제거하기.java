import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int[] copy = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        
        if(arr.length == 1){
            int[] empty = {-1};
            return empty;
        }
        
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != copy[0]){
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        
        
        return answer;
    }
}