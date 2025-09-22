class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length;
        int[] visited= new int[n+2];

        for(int i=0; i<n; i++){
            visited[edges[i][0]]++;
            visited[edges[i][1]]++;
        }

        for(int i=1; i<=n+1;i++){
            if(visited[i]==n){
                return i;
            }
        }
        return 0;
    }
}