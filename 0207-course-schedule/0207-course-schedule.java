class Solution {
    public boolean canFinish(int n, int[][] p) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i =0; i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<p.length;i++){
            int u = p[i][1];
            int v = p[i][0];
            adj.get(u).add(v);
        }
        int state[] = new int[n];
        for(int i=0;i<n;i++){
            if(state[i] ==0){
                if(dfs(i,adj,state)){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean dfs(int node,
                       ArrayList<ArrayList<Integer>> adj,
                       int[] state) {

        state[node] = 1;

        for (int nbr : adj.get(node)) {

            if (state[nbr] == 0) {

                if (dfs(nbr, adj, state)) {
                    return true;
                }

            } else if (state[nbr] == 1) {

                return true; // cycle
            }
        }

        state[node] = 2;

        return false;
    }
}
