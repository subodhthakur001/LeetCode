class Pair implements Comparable<Pair>{
    int st;
    int et;
    public Pair(int st, int et){
        this.st=st;
        this.et=et;
    }
    public int compareTo(Pair other){
        if(this.st!=other.st){
            return this.st-other.st;
        }
        else{
            return this.et-other.et;
        }
        
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Pair[] pair = new Pair[n];
        for(int i=0;i<n;i++){
            pair[i]=new Pair(intervals[i][0],intervals[i][1]);
            
        }
        Arrays.sort(pair);
        Stack<Pair> st = new Stack<>();
        st.push(pair[0]);
        for(int i=1;i<pair.length;i++){
            Pair top = st.peek();
            if(pair[i].st>top.et){
                st.push(pair[i]);
            }
            else{
                top.et = Math.max(pair[i].et,top.et);
            }
        }
        int[][] res = new int[st.size()][2];
        for(int i=res.length-1;i>=0;i--){
            Pair temp = st.pop();
            res[i][0]=temp.st;
            res[i][1]=temp.et;
        }
        return res;
    }
}