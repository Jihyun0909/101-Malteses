import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1); // 공백 포함 분리 (연속된 공백도 유지)

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(word.charAt(j))); // 짝수 인덱스 대문자
                } else {
                    answer.append(Character.toLowerCase(word.charAt(j))); // 홀수 인덱스 소문자
                }
            }
            if (i < words.length - 1) {
                answer.append(" "); // 마지막 단어 이후에는 공백 추가 안 함
            }
        }

        return answer.toString();
    }
}
