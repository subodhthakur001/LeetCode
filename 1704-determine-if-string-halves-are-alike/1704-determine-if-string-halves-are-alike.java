/*
T.C. -> O(N/2) + O(N/2)
S.C. -> O(N) for hashset
*/
/*class Solution {
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
        return count1 == count2;
    }
}*/

// class Solution {
//     public boolean isVowel(char c){
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'O' || c =='U' || c == 'I';
//     }
//     public boolean halvesAreAlike(String s) {
//         int i =0;
//         int j = s.length()-1;
//         int count =0;
//         while(i<j){
//             if(isVowel(s.charAt(i))) count++;
//             if(isVowel(s.charAt(j))) count--;
//             i++;
//             j--;
//         }
//         return count==0;
//     }
// }

class Solution {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'O' || c =='U' || c == 'I';
    }
    public boolean halvesAreAlike(String s) {
        int i =0;
        int j = s.length()-1;
        int count1=0;
        int count2=0;
        while(i<j){
            if(isVowel(s.charAt(i))) count1++;
            if(isVowel(s.charAt(j))) count2++;
            i++;
            j--;
        }
        return count1==count2;
    }
}