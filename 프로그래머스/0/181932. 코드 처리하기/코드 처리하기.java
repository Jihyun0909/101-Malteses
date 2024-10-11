class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        for(int idx = 0; idx < code.length(); idx++){
        //mode가 0일 때
        if(mode == 0){
            if(code.charAt(idx) != '1'){
                if(idx%2 == 0)
                    ret += code.charAt(idx);}
             else if(code.charAt(idx) == '1')
                mode = 1;
        }
        //mode가 1일 때
        else if(mode == 1){
            if(code.charAt(idx) != '1'){
            if(idx%2 != 0)
                ret += code.charAt(idx);}
            else if(code.charAt(idx) == '1')
                mode = 0;
        }
    }
        if(ret.isEmpty())
            answer = "EMPTY";
        else
            answer = ret;
        return answer;
    }
}