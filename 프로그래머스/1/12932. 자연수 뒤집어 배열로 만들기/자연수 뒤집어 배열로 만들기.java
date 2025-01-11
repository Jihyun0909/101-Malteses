class Solution {
    public int[] solution(long n) {
        String[] str = Long.toString(n).split("");
        int[] answer = new int[str.length];
        int idx = str.length-1;
        for(int i = 0; i < str.length; i++){
            answer[i] = Integer.parseInt(str[idx]);
            idx--;
        }
    
        return answer;
    }
}