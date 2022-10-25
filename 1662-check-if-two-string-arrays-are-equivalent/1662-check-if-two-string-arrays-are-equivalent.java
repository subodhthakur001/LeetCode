/*class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        int i =0;
        int j =0;
        boolean check1 = false;
        boolean check2 = false;
        if(word1.length==1){
            s1 = word1[0];
            check1 = true;
        }
        if(word2.length==1){
            s2 = word2[0];
            check2 = true;
        }
        while(check1==false && i < word1.length){
            s1 += word1[i]; 
            i++;
        }
        while(check2==false && j < word2.length){
            s2 += word2[j];
            j++;
        }
       return s1.equals(s2);
    }
}*/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 ="";
        String s2 = "";
        
        for(String s : word1){
            s1 += s;
        }
        for(String k : word2){
            s2 += k;
        }
        return s1.equals(s2);
    }
}