import java.util.Scanner;
public class 개수세기 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int length  = sc.nextInt();
        int arr[] = new int[length];
        int count = 0;

        for(int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();			 // 배열에 입력한 정수들 넣어주기
        }

        int b = sc.nextInt();

        for (int j = 0; j < arr.length; j++) {
            if(b == arr[j]){
                count++;
            }
        }

        System.out.println(count);
    }
}
