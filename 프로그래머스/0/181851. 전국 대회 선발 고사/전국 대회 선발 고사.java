// n명 중 높은 등수 3명 선발(참여 가능 학생만)
// rank의 인덱스가 학생 번호, 요소가 등수
// list에는 학생 번호 저장 -> 등수대로 정렬해야됨
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[i])
                list.add(i);
        }
        
        list.sort(Comparator.comparingInt(o -> rank[o]));
        
        answer = 10000*list.get(0) + 100*list.get(1) + list.get(2);
        return answer;
    }
}