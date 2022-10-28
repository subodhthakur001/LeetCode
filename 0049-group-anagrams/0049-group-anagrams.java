/*class Solution {
    public boolean check(String f, String s){
        HashSet<Character> hs = new HashSet<>();
        for(char c : f.toCharArray()){
            hs.add(c);
        }
        for(char k : s.toCharArray()){
            if(!hs.contains(k))return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if(strs.length==1){
            List<String> l1 = new ArrayList<>();
            l1.add(strs[0]);
            ans.add(l1);
            return ans;
        }
        HashSet<String> hs = new HashSet<>();
         for(int i =0;i<strs.length;i++){
             List<String> l = new ArrayList<>();
             if(!hs.contains(strs[i])){
                     l.add(strs[i]);
                     hs.add(strs[i]);
             for(int j=i+1;j<strs.length;j++){
                 if(check(strs[i],strs[j])){
                     l.add(strs[j]);
                     hs.add(strs[j]);
                 }
             }
             } 
             if(l.size()>0)ans.add(l);
         }
        return ans;
     } 
}*/
class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        int n=str.length;
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            char [] ch=str[i].toCharArray();
            Arrays.sort(ch);
            String temp=new String(ch);
            if(hm.containsKey(temp)){
                hm.get(temp).add(str[i]);
            }
            else{
                ArrayList<String> t=new ArrayList<>();
                t.add(str[i]);
                hm.put(temp,t);
            }
        }
        
        for(String key:hm.keySet()){
            list.add(hm.get(key));
        }
        
        return list;
    }
}
 