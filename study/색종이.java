import java.util.*;
public class 색종이 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total = 0;
        boolean [][] square = new boolean[101][101];

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!square[j][k]) {
                        square[j][k] = true;
                        total++;
                    }
                }
            }

        }
        System.out.print(total);
        
    }

}
