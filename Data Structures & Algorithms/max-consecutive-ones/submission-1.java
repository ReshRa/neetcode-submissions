class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max =0;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == 1){
        //         count++;
        //     }else{
        //         max = Math.max(max,count);
        //         count =0;
        //     }
        // }

        for(int num :  nums){
            count = (num ==1 )?  count+1 :0;
max = Math.max(max,count);
        }

        
        return max;
    }
}