class Solution {
    public String removeDuplicates(String s) {
        String ans ="";
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!st.empty()&&st.peek()==s.charAt(i))st.pop();
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.empty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}