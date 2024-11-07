/*my_string의 s~e 부분 문자열 저장*/

import java.util.ArrayList;
class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < parts.length; i++ ){
            int s = parts[i][0];
            int e = parts[i][1];
            list.add(my_strings[i].substring(s,e+1));
        }
        
        String answer = "";
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}