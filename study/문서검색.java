import java.util.Scanner;
class 문서검색 {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String doc  = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        int startIndex = 0;
        while (true) {
            int findIndex = doc.indexOf(word, startIndex);
            if (findIndex < 0)
                break;
            count++;
            startIndex = findIndex + word.length();    
        }
        System.out.println(count);
    }

    /*
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String doc  = sc.nextLine();
        String word = sc.nextLine();

        String replaced = doc.replace(word, "");
        int length = doc.length() - replaced.length();
        int count = length / word.length();
        System.out.println(count);
    }
    */
}
