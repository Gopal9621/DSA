class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

    int n = graph.length;
    int[] vis =new int[n];
    List<Integer> ans = new ArrayList<>();

    for(int i =0;i<n;i++)
        if(dfs(i, graph,vis)) ans.add(i);
        return ans;
    }
    boolean dfs(int node, int[][] graph, int[] vis){
        if(vis[node]==1) return false;
        if(vis[node]==2) return true;

        vis[node] = 1;

        for(int next : graph[node]){
            if(!dfs(next, graph, vis))
            return false;
        }
        vis[node] = 2;
        return true;
    }
    

}