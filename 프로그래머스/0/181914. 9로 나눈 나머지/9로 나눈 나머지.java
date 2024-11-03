class Solution {
    public int solution(String number) {
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < number.length(); i++){
            temp += Character.getNumericValue(number.charAt(i));
        }
        answer = temp%9;
        return answer;
    }
}