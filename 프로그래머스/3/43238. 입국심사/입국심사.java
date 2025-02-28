import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long answer = 0;
        long left = 0;
        long right = (long) times[times.length-1] * n;
        while(left <= right){
            long mid = (left + right) / 2;
            long complete = 0;
            //심사대 별 심사 가능 사람 수 합산
            for(int i = 0; i < times.length; i++)
                complete += mid / times[i];
            //해당 시간동안 모든 사람 검사가 불가능한 경우
            if(complete < n)
                left = mid + 1;
            else{
                answer = mid;
                right = mid - 1;
            }
        }
        
        return answer;
    }
}