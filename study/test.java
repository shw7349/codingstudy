public class test {
    public void DFS(int n){
        if(n==0) return;
        else{
            System.out.print(n%2+" ");
            DFS(n/2);
        }
    }

    public static void main(String[] args){
        test T = new test();
        T.DFS(11);
    }
    
}
