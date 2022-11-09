class Pair{
    int first, second;
    Pair(int x, int y){
        first= x;
        second= y;
    }
}

class StockSpanner {
    Stack<Pair> st;
    int ans;
    int i;
    
    public StockSpanner() {
        st=new Stack<>();
        ans=0;
        i=0;
    }
    
    public int next(int price) {
         i++;
         while(!st.empty()&&price>=st.peek().first){
               st.pop();
         }
         if(st.empty()){
           ans= i;
             
         }
         else{
            ans= i-st.peek().second;
            
         }
          
          st.push(new Pair(price,i));
          
    
        return ans;
    }
}