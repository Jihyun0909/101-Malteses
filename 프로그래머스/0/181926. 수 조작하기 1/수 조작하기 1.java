class Solution {
    public int solution(int n, String control) {
        int answer = n;  // Initialize answer with the value of n
        for( int i = 0; i < control.length(); i++){
        switch(control.charAt(i)) {
            case 'w': 
                answer = ++n;  // Increment n
                break;
            case 's':
                answer = --n;  // Decrement n
                break;
            case 'd':
                answer = (n += 10);  // Add 10 to n
                break;
            case 'a':
                answer = (n -= 10);  // Subtract 10 from n
                break;
        }
        }
        return answer;
    }
}
