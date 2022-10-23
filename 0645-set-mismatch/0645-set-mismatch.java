class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            set.add(i);
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                arr[1]=i;
            }
        }
        for(int key:hm.keySet()){
            if(hm.get(key)>1)
                arr[0]=key;
        }
        
       return arr;
    }
}