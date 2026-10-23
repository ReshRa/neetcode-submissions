class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0;
        int need =0;
        map.put(0,1);
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            need = sum-k;

            if(map.containsKey(need)){
                count+=map.get(need);
            }

            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}