import java.util.*;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer = 0;
        while(true){
        if(a%5==0){
            System.out.println(a/5 + answer);
            break;
        }else if(a < 0){
            System.out.println(-1);
            break;
        }
        a = a-3;
        answer ++;
        }
        
        
        
        
    }


}
