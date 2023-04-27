import java.util.Scanner;
public class 진법변환 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        int tmp = 1;
		int ans = 0;

        for (int i = a.length()-1; i >= 0; i--) {
			char c = a.charAt(i);
			
			if('A'<= c && c <= 'Z') {
				ans += (c-'A'+10)*tmp;
			}else {
				ans += (c-'0')*tmp;
			}
			tmp *= b;
		}
		
		System.out.println(ans);
        
        
    }
    
}
