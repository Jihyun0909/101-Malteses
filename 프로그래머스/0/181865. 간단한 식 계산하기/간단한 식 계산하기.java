class Solution {
    public int solution(String binomial) {
        String expr = binomial.replaceAll(" ","");
        int answer = 0;
        int num1 = 0; int num2 = 0;
        char op = ' ';
        for(int i = 0; i < expr.length(); i++){
            if(expr.charAt(i) == '+' || expr.charAt(i)=='-' || expr.charAt(i)=='*'){
                op = expr.charAt(i);
                num1 = Integer.parseInt(expr.substring(0,i));
                num2 = Integer.parseInt(expr.substring(i+1,expr.length()));
            }
        }
        switch(op){
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1*num2;
                break;
        }
    
        return answer;
    }
}