import java.util.regex.*;
class Solution {
    public String solution(String myString, String pat) {
        Pattern end;
        Matcher mat;
        String answer = "";

        end = Pattern.compile(".*"+pat);
        mat = end.matcher(myString);
        while(mat.find()){
            answer = mat.group();
        }
        
        return answer;
    }
}