class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        String a;
        String b;
        answer  = new String[players.length];
        for(int i=0; i<players.length; i++){
            for(int j=0; j<callings.length; j++){
                if(players[i].equals(callings[j])){
                    a = players[i];
                    b = players[i-1];
                    players[i-1] = a;
                    players[i] = b;
                    
                }
            }
        }
        answer = players;
        return answer;
    }
}