class Solution {
    public String reverseVowels(String s) {
      HashSet<Character> hm = new HashSet<>();
        hm.add('A');
        hm.add('E');
        hm.add('I');
        hm.add('O');
        hm.add('U');
        hm.add('a');
        hm.add('e');
        hm.add('i');
        hm.add('o');
        hm.add('u');
        
        char[] characters = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        while(i<=j){
            while(i<j && !hm.contains(characters[i]))i++;
            while(i<j && !hm.contains(characters[j]))j--;
            char temp = characters[i];
            characters[i]=characters[j];
            characters[j]=temp;
            i++;
            j--;
        }
        
        return new String(characters);
    }
}