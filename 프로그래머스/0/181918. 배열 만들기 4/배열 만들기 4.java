import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
        if(stk.isEmpty()){
            stk.add(arr[i]);
            ++i;
        }
        else if((!stk.isEmpty()) && stk.get(stk.size()-1)<arr[i]){
            stk.add((stk.size()),arr[i]);
            ++i;
        }
        else if((!stk.isEmpty()) && stk.get(stk.size()-1)>=arr[i]){
            stk.remove(stk.size()-1);
        }
        }
        int[] answer = new int[stk.size()];
        for(int j = 0; j < stk.size(); j++){
            answer[j] = stk.get(j);
        }
        return answer;
    }
}