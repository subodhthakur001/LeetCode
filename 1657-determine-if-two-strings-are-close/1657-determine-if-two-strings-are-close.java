// class Solution {
//     public boolean closeStrings(String word1, String word2) {
//         int freq1[]=new int [26];
//         int freq2[]=new int [26];
//         for(int i=0;i<word1.length();i++){
//             freq1[word1.charAt(i)-'a']++;
//         }
//         for(int i=0;i<word2.length();i++){
//             freq2[word2.charAt(i)-'a']++;
//         }
//         for(int i=0;i<26;i++){
//             if((freq1[i]==0&&freq2[i]!=0)||(freq1[i]!=0&&freq2[i]==0))return false;
//         }
//         Arrays.sort(freq1);Arrays.sort(freq2);
//         for(int i=0;i<26;i++){
//             if(freq1[i]!=freq2[i])return false;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hs = new HashMap<>();
        for(char c: word1.toCharArray()){
             hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char e: word2.toCharArray()){
             hs.put(e,hs.getOrDefault(e,0)+1);
        }
        for(char c: hm.keySet()){
            if(!hs.containsKey(c)){
                return false;
            }
        }
        List<Integer> l1=new ArrayList<>();
         List<Integer> l2=new ArrayList<>();
        for(int c: hm.values()){
            l1.add(c);
        }
        for(int c: hs.values()){
            l2.add(c);
        }
        System.out.println(l1);
        System.out.println(l2);
       Collections.sort(l1);
        Collections.sort(l2);
        return l2.equals(l1);
    }
}