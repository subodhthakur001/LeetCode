/*
T.C. -> O(N/2) + O(N/2)
S.C. -> O(N) for hashset
*/
class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 =0;
        int count2=0;
        int mid = s.length()/2;
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('o');
        hs.add('i');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        for(int i=0;i<mid;i++){
            if(hs.contains(s.charAt(i))){
                count1++;
            }
        }
        for(int i=mid;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                count2++;
            }
        }
        return count1 ==count2;
    }
}