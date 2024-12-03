class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char target = alp.charAt(0);
        answer = my_string.replace(target, Character.toUpperCase(target));
        return answer;
    }
}