class Solution {
    public void dfs(int [][] isConnected, boolean[] visited, int u){
        for(int v=0;v<isConnected.length;v++){
            if(isConnected[u][v]==1 && !visited[v]){
                visited[v]=true;
                dfs(isConnected,visited, v);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited = new boolean[n];
        int count=0;
        for(int u=0;u<n;u++){
            if(!visited[u]){
                dfs(isConnected,visited,u);
                count++;
            }
        }
        return count;
    }
}