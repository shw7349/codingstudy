import java.util.*;

public class dfs정리 {
    public static void dfs(int v, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        
        for (int i : graph.get(v)) {
            if (!visited[i]) {
                dfs(i, graph, visited);
            }
        }
    }

    public static void bfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            
            for (int i : graph.get(v)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
        
        boolean[] visited = new boolean[n + 1];
        dfs(start, graph, visited);
        System.out.println();
        
        Arrays.fill(visited, false);
        bfs(start, graph, visited);
    }
}
