class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            hs.add(sentence.charAt(i));
        }
        for(Character c = 'a';c <= 'z'; c++){
            if(!hs.contains(c))return false;
        }
        return true;
    }
}