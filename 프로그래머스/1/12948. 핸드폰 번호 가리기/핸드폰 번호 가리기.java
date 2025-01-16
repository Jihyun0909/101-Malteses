class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length(); i++){
            if(i == phone_number.length() - 4){
                while(i < phone_number.length()){
                    answer += phone_number.charAt(i);
                    i++;
                }
            }else
            answer += '*';
        }
        
        return answer;
    }
}