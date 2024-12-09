import java.util.ArrayList;
class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                answer.add(i-idx);
                idx = i+1;
            }
        }
        
        answer.add(myString.length() - idx);
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}