import java.util.*;
class Solution {
    boolean solution(String s) {
        int pCount = 0, yCount = 0;
        String[] array = s.toLowerCase().split("");
        boolean answer = true;
        for(int i=0; i < array.length; i++){
            if ("p".equals(array[i])) { 
				pCount++;
			} else if ("y".equals(array[i])) {
				yCount++;
			}
        }
        if(pCount == yCount){
            answer = true;
        }else{
            answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java"+array);

        return answer;
    }
}