import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> delList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        for(int i = 0; i < delete_list.length; i++){
            delList.add(delete_list[i]);
        }
        
        for(int i = 0; i < delList.size(); i++){
            if(list.contains(delList.get(i))){
                list.remove(delList.get(i));
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
            
        return answer;
        
    }
}