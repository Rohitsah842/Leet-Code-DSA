class Solution {
    public int findJudge(int n, int[][] trust) {

        int res=-1;
       int[] visit= new int[n+1];
       int[] visited= new int[n+1];


        for(int i=0;i<trust.length;i++){
           visit[trust[i][0]]++;
           visited[trust[i][1]]++;
        }

        for(int i=1; i<=n; i++){
            if(visit[i]==0 && visited[i]== n-1){
                res=i;
            }
        }

       return res; 
    }
}