import java.util.Arrays;
import java.lang.StringBuilder;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        Long[] list = new Long[str.length];
        
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder();
        for(int i = str.length-1; i >= 0; i--){
            sb.append(str[i]);
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}