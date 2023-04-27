import java.util.*;
public class ATM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        int tmp = 0;
        int prev = 0;
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();        
        }
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            tmp += prev + arr[j];
            prev += arr[j];
        }
           
        System.out.println(tmp);
    }
}
