import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        int init = n;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1){
            if(n%2 == 0){
                n /= 2;
                list.add(n);
            }
            else if(n%2 != 0){
                n = n*3+1;
                list.add(n);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}