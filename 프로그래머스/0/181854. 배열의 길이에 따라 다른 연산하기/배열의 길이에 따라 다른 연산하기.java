class Solution {
    public int[] solution(int[] arr, int n) {
        
        //길이가 홀수인 경우
        if(arr.length % 2 != 0){
            for(int i = 0; i < arr.length/2+1; i++){
                arr[2*i] += n;
            }
        }
        //길이가 짝수인 경우
        else{
            for(int i = 0; i < arr.length/2; i++){
                arr[2*i+1] += n;
            }
        }
        return arr;
    }
}