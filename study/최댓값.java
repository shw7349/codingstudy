import java.util.Scanner;
public class 최댓값 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[10][10];

        int max = 0;
		int x = 0, y = 0;

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();
                if (max < arr[i][j]){
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }    
}
