import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 오름차순 정렬
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i; // 현재 논문의 H-Index 후보
            if (citations[i] >= h) { // h번 이상 인용된 논문이 h편 이상인지 확인
                return h;
            }
        }
        
        return 0; // 모든 논문이 0번 인용된 경우 H-Index = 0
    }
}
