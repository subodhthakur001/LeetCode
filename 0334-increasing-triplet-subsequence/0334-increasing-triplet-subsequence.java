/*class Solution {
    public boolean increasingTriplet(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[i]<nums[j]&&nums[j]<nums[k])return true;
                else{
                    if(nums[j]<nums[k])j++;
                    else k--;
                }
            }
        }
      return false;
    }
}*/
/*
t.c. -> o(n)
s.c. -> o(1)
*/
class Solution {
    public boolean increasingTriplet(int[] nums) {
       int max1 = Integer.MAX_VALUE;
       int max2 = Integer.MAX_VALUE;
       for(int n : nums) {
           if(n <= max1) max1 = n;
           else if(n <= max2) max2 = n;
           else return true;
       }
       return false;
    }
}