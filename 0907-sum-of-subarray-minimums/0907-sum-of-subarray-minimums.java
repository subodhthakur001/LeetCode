class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] lsmaller = new int[n];
        int[] rsmaller = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.empty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                lsmaller[i]=i+1;
            }
            else{
                lsmaller[i] = i-st.peek();
            }
            st.push(i);
        }
        while(!st.empty()){
            st.pop();
        }
     for(int i=arr.length-1;i>=0;i--){
         while(!st.empty() && arr[i]<=arr[st.peek()]){
             st.pop();
         }
         if(st.empty()){
             rsmaller[i]=arr.length-i;
         }
         else{
             rsmaller[i]=st.peek()-i;
         }
         st.push(i);
     }
      long ans = 0;
        int r = (int)Math.pow(10,9)+7;
        for(int i=0;i<arr.length;i++){
            long p = (lsmaller[i]*rsmaller[i])%r;
            ans = (ans+arr[i]*p)%r;
        }
        return (int)ans;
        
    }
}