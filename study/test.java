import java.util.Scanner;

public class test {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        Long result = Long.parseLong(a);

        System.out.println(4 * a);
    }
}