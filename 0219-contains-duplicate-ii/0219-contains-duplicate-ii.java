/*class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(Math.abs(i-j)<=k)return true;
                }
            }
        }
        return false;
    }
}
*/
/*
T.C. -> o(n)
S.C. -> o(n)
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            if(hm.containsKey(nums[i]) && i - hm.get(current) <=k)return true;
            else{
                hm.put(current,i);
            }
        }
        return false;
    }
}