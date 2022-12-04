// class Solution {
//     public int minimumAverageDifference(int[] nums) {
//         int totalsum = 0;
//         int prefixsum = 0;
//         int diff = 0;
//         TreeMap<Integer,Integer> tm= new TreeMap<>();
//         for(int i = 0; i < nums.length; i++){
//             totalsum += nums[i];
//         }
        
//         for(int i = 0; i < nums.length-1; i++){
//             prefixsum += nums[i];
//             totalsum -= nums[i];
//             diff = Math.abs((prefixsum/(i+1))-(totalsum / (nums.length - (i+1))));
//             // System.out.println(diff);
//             if(!tm.containsKey(diff)){
//                 tm.put(diff,i);
//             }
//         }
//         prefixsum+=nums[nums.length-1];
//         totalsum-=nums[nums.length-1];
//         diff = Math.abs((prefixsum/(nums.length))-0);
//         // System.out.println(diff);
//         if(!tm.containsKey(diff)){
//                 tm.put(diff,nums.length-1);
//             }
//         List<Integer> ans = new ArrayList<>();
//         for(int t:tm.keySet()){
//             ans.add(tm.get(t));
//         }
//         return ans.get(0);
//     }
// }
class Solution {
    public int minimumAverageDifference(int[] inp) {
        int n=inp.length;
        if(n==1)   return 0;
        long prefix=0,postfix=0;
        for(int i=0;i<n;i++) postfix+=inp[i];
        long min=Integer.MAX_VALUE;
        int ind=0;
        for(int i=0;i<n;i++){
            prefix+=inp[i];
            long temp=prefix/(i+1);
            if(i+1<n)   temp-=(postfix-prefix)/(n-i-1);
            temp=Math.abs(temp);
            if(temp<min){
                min=temp;
                ind=i;
            }
        }
        return ind;
    }
}