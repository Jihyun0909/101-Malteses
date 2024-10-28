import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        //범위 내에서 순회
        for(int i = l; i <= r; i++){
            int num = i;
            boolean bool=true;
            while(num > 0){
                int digit = num%10; 
                if(digit != 5 && digit != 0){
                    bool = false;
                    break;
                }
                num /= 10; //한자리 줄이기
            }
            if(bool){
                list.add(i);
            }
        }
        int[] answer = new int[list.size() == 0 ? 1 : list.size()];
        if(list.size() == 0){
            answer[0] = -1;
        } else {
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}