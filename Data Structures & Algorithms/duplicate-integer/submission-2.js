class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {

        let map = new Map();

        for(var i =0;i < nums.length;i++){
            if(map.get(nums[i]) > 0){
                return true;
            }

            map.set(nums[i],1);
        }

        return false;
    }
}
