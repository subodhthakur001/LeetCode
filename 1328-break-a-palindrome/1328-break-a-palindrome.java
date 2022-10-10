/*
t.c->O(N)
s.c.->O(N)
*/
class Solution {
     public boolean palindrome(StringBuilder s){
         int i = 0;
         int j = s.length()-1;
         while(i<j){
             if(s.charAt(i++)!=s.charAt(j--))return true;
         }
         return false;
     }
    public String breakPalindrome(String palindrome) {
        StringBuilder sb = new StringBuilder(palindrome);
        if(sb.length()==1)return "";
        
        for(int i=0;i<sb.length()/2;i++){
            if(sb.charAt(i)!='a'){
                sb.setCharAt(i,'a');
                break;
            }

        }
        if(palindrome(sb)==false){
            sb.setCharAt(sb.length()-1,'b');
        }
      return sb.toString();  
    }
 }
    


/*class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() < 2) return "";
        char[] p = palindrome.toCharArray();
        int  n = p.length;
        for(int i=0;i<n/2;i++){
            // if any char at half part of string is not equal to 'a' then replace with a
            if(p[i] != 'a'){
                p[i] = 'a';
                String str = String.valueOf(p);
                return str;
            }            
        }
        //if all element is equal to 'a' then replace last element to 'b'
        p[n-1] = 'b';
        String str = String.valueOf(p);
        return str;
    }
}*/