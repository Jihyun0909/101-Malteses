import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                int index = query[i] + 1;
                for(int j = list.size() - 1; j >= index ; j--){
                    list.remove(j);
                }
            }
            else{
                int index = query[i] - 1;
                for(int j = index; j >= 0; j--){
                    list.remove(j);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}