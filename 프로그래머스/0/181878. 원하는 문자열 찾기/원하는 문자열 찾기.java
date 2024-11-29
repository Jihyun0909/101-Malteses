class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        if(myString.length() >= pat.length()){
            return myString.contains(pat)? 1 : 0;
        } else
            return 0;
    }
}