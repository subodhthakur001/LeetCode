class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int v1 =0;
        int v2 =0;
        for(String s : tokens){
            if(s.equals("+")){
               v1 = st.pop();
               v2 = st.pop();
            st.push(v1+v2);
            }
           else if(s.equals("-")){
               v1 = st.pop();
               v2 = st.pop();
            st.push(v2-v1);
            }
            else if(s.equals("*")){
               v1 = st.pop();
               v2 = st.pop();
            st.push(v1*v2);
            }
           else if(s.equals("/")){
               v1 = st.pop();
               v2 = st.pop();
            st.push(v2/v1);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}