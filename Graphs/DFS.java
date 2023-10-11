public class DFS {
    static int[][] am = { { 0, 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0 },
            { 1, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0 } };
    static int[] visited = new int[am.length];

    public static void dfs(int i) {
        System.out.print(i + " ");
        visited[i] = 1;
        for (int j = 0; j < am.length; j++) {
            if (am[i][j] == 1 && visited[j] == 0) {
                dfs(j);
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
