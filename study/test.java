public class test {
    public static void main(String[] args){    
        String myString = "AbCdEfG";
        String pat = "afc";
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        boolean result = myString.contains(pat);
        if(result==true){
            answer = 1;
        }else{
            answer = 0;
        }
        System.out.println(result);
        System.out.println(answer);
    }
}