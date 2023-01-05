class Solution {
    public long solution(long n) {
        // Math.sqrt : 제곱근 보여줌
        long num = (long)Math.sqrt(n);
        long answer = 0;
        if(num*num == n){
            answer = (num+1)*(num+1);
        }else{
            answer = -1;
        }
        
        return answer;
    }
}