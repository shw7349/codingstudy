class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int ans = 0;
        if(!(s.length()==4||s.length()==6)) answer = false;
        for(int i=0; i<s.length(); i++){
            String c = s.substring(i,i+1);
            if (c.matches("^[a-zA-Z]*$")) {
                answer = false;
            }
        }
        return answer;
    }
}