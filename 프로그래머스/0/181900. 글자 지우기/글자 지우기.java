class Solution {
    public String solution(String my_string, int[] indices) {
        char[] list = my_string.toCharArray();
        for(int i = 0; i < indices.length; i++){
            list[indices[i]] = ' ';
        }
        return new String(list).replaceAll(" ","");
    }
}