/*
    첫째 줄에 행렬의 크기 N 과 M이 주어진다. 
    둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. 
    N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 */
import java.util.Scanner;
public class 행렬덧셈 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] arr = new int[A][B];

        for (int i = 0; i < 2; i++) {
			for (int j = 0; j < A; j++) {
				for (int j2 = 0; j2 < B; j2++) {
					arr[j][j2] += sc.nextInt();
				}
			}
		}

		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
    }    
}
