import java.util.Scanner;
public class 개미 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int T     = sc.nextInt();

        int timeX  = T % (2 * W);
        int currentX = P;
        int deltaX = 1;

        while( timeX-- > 0){
            if (currentX == W) deltaX = -1;
            else if (currentX == 0 ) deltaX = 1;
            currentX += deltaX;
        }
        
        int timeY  = T % (2 * H);
        int currentY = Q;
        int deltaY = 1;

        while( timeY-- > 0){
            if (currentY == H) deltaY = -1;
            else if (currentY == 0 ) deltaY = 1;
            currentY += deltaY;
        }

        System.out.println(currentX + " " + currentY);
    }    
    
    /*
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int currentX = sc.nextInt();
        int currentY = sc.nextInt();
        int time     = sc.nextInt();
        int deltaX = 1;
        int deltaY = 1;

        while(time>0){
            if(currentX + deltaX > X && deltaX == 1){
                deltaX = -1;
            } else if(currentX + deltaX < 0  && deltaX == -1) {
                deltaX = 1;
            }
            currentX += deltaX;

            if(currentY + deltaY> Y && deltaY == 1){
                deltaY = -1;
            } else if(currentY+ deltaY < 0  && deltaY == -1) {
                deltaY = 1;
            }
            currentY += deltaY;
            time--;
        }
        System.out.println(currentX + " " + currentY);
    }
     */
    
}
