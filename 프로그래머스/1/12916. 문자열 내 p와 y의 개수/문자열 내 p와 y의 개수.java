class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] split = s.split("");
        int pNum = 0; int yNum = 0;
        for(int i = 0; i < split.length; i++){
            if(split[i].contains("p")||split[i].contains("P"))
                pNum++;
            else if(split[i].contains("y")||split[i].contains("Y"))
                yNum++;
        }
        
        answer = (pNum == yNum) ? true : false;

        return answer;
    }
}