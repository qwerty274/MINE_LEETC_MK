class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length, n = mat[0].length;
        Queue<int[]> q = new LinkedList<>();

        // Add all 0s, mark 1s as unvisited
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0)
                    q.offer(new int[]{i, j});
                else
                    mat[i][j] = -1;
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] p = q.poll();

            for (int k = 0; k < 4; k++) {
                int r = p[0] + dr[k];
                int c = p[1] + dc[k];

                if (r >= 0 && r < m && c >= 0 && c < n
                        && mat[r][c] == -1) {

                    mat[r][c] = mat[p[0]][p[1]] + 1;
                    q.offer(new int[]{r, c});
                }
            }
        }

        return mat;
    }
}