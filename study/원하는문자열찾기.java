class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        boolean result = myString.contains(pat);

        if(result==true){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}