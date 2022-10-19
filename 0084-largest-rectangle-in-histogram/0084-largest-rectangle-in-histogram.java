//T.C. - o(n)+o(n)+o(n)+o(n)+o(n)
// S.C. - O(4N)
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] lb  = new int[n];
        int[] rb = new int[n];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        // first i will find the previous smaller element using bhaiya wala algo
        for(int i=0;i<=n-1;i++){
            while(!st1.empty() && heights[i]<=heights[st1.peek()]){
                st1.pop();
            }
            //for handling the first element of heights
            if(st1.empty()){
                lb[i] = -1;
            }
            else{
                lb[i]=st1.peek();
            }
            st1.push(i);
        }
        // then i will find the next smaller element 
        for(int i=n-1;i>=0;i--){
            while(!st2.empty() && heights[i]<=heights[st2.peek()]){
                st2.pop();
            }
            //for handling the last element of heights
            if(st2.empty()){
                rb[i]=heights.length;
            }
            else{
                rb[i]=st2.peek();
            }
            st2.push(i);
        }
        int maxarea=0;
        for(int i=0;i<n;i++){
            int width = rb[i]-lb[i]-1;
           int area = width * heights[i];
            if(area>=maxarea){
                maxarea =area;
            }
            
        }
        return maxarea;
    }
}