// 스택이 LIFO 
import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("Z")){
                stack.pop();
                continue;
            }
            stack.push(Integer.parseInt(str[i]));
        }
        
        while(!stack.empty()){
            answer += stack.peek();
            stack.pop();
        }
        
        return answer;
    }
}