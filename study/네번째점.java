import java.util.Scanner;

public class 네번째점 {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);

        int [] arr1 = {sc.nextInt(),sc.nextInt()};
        int [] arr2 = {sc.nextInt(),sc.nextInt()};
        int [] arr3 = {sc.nextInt(),sc.nextInt()};

        int a = 0;
        int b = 0;

        if(arr1[0]==arr2[0]){
            a = arr3[0];
        }else if(arr2[0]==arr3[0]){
            a = arr1[0];
        }else{
            a = arr2[0];
        }

        if(arr1[1]==arr2[1]){
            b = arr3[1];
        }else if(arr2[1]==arr3[1]){
            b = arr1[1];
        }else{
            b = arr2[1];
        }

        
        System.out.println(a + " " + b);
    }
}