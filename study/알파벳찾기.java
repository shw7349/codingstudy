import java.util.Scanner;

public class 알파벳찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();
        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        for(int i = 0; i < alphabet.length(); i++){
            char ch = alphabet.charAt(i);

            if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
            System.out.println("ch::"+ch + "  arr[ch - 'a']:::"+arr[ch - 'a']);

        }
        System.out.println(arr);

        for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}


    }    
    
}
