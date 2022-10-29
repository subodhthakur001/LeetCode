class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        int[][] mat  = new int[n][2];
        //fill the 2d array
        for(int i=0;i<n;i++){
           mat[i][0] = plantTime[i];
           mat[i][1] = growTime[i];
        }
        //sort in decresing order
        Arrays.sort(mat, (a,b) -> b[1]-a[1]);
        
        int bloomday = 0;
        int seedplantingday = 0;
        for(int i=0;i<n;i++){
            int ptime = mat[i][0];
            int gtime = mat[i][1];
            bloomday = Math.max(bloomday,seedplantingday+ptime+gtime);
            seedplantingday += ptime;
        }
        return bloomday;
    }
}