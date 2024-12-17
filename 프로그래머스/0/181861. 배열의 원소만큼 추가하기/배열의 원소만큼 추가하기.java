import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int num = -1;
        for(int i = 0; i < arr.length; i++){
            num = arr[i];
            for(int j = 0; j < num; j++){
                answer.add(num);
            }
        }
        
        int[] list = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            list[i] = answer.get(i);
        }
        
        return list;
    }
}