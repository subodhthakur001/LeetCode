/*class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int sum =nums[i];
            for(int j =i+1;j<nums.length;j++){
                  sum = sum + nums[j];
                if(sum % k ==0){
                    return true;
                }
            }
        }
        return false;
    }
}*/

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        for(int i =1;i<nums.length;i++){
            if(nums[i]==0 &&nums[i-1]==0)return true;
        }
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
            if(nums[i]%k==0)return true;
            int j=i;
            while(j>1 && nums[i]>k){
                if((nums[i]-nums[j-2])%k==0)return true;
                j--;
            }
        }
        return false;
    }
}