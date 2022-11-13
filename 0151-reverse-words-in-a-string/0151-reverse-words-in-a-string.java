class Solution {
    public String reverseWords(String s) {
        String ans = "";
        List<String> ls = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ls.add(ans);
                ans ="";
            }
            else{
                ans +=s.charAt(i);
            }
            
        }
        ls.add(ans);
        for(int i=ls.size()-1;i>=0;i--){
        if(ls.get(i).equals("")){
            ls.remove(i);
        }
    }
    
    Collections.reverse(ls);
    ans="";
    for(int i=0;i<=ls.size()-2;i++){
        ans+=ls.get(i)+" ";
    }
    ans = ans + ls.get(ls.size()-1);
    return ans;
    
    }
    
}