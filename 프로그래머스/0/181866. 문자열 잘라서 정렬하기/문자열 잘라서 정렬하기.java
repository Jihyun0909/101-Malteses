import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] list = myString.split("x");
        ArrayList<String> result = new ArrayList<>();
        for(String str:list){
            if(!str.isEmpty())
                result.add(str);
        }
        
        String[] answer = result.toArray(new String[0]);
        Arrays.sort(answer);
    
        return answer;
    }
}