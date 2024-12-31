class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] arr = n_str.toCharArray();
        int idx = -1;
        for(int i = 0; i < n_str.length(); i++){
            if(arr[0] != '0'){
                answer = n_str;
                return answer;
            }else if(arr[i] == '0' && arr[i+1] != '0'){
                idx = i+1;
                break;
            } else if(arr[i] == '0' && arr[i+1] == '0'){
                idx = i;
            }
        }
        char[] result = new char[n_str.length()-idx];
        for(int i = 0; i < result.length; i++){
            result[i] = arr[idx+i];
        }
        answer = String.valueOf(result);
        return answer;
    }
}