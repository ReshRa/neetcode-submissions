class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int size = nums.length;
        int equals = size/3;
        ArrayList<Integer> a = new ArrayList<>();
        for(int nums1 : map.keySet()){

            int value = map.get(nums1);

            if(value > equals){
                a.add(nums1);
            }

        }

        return a;
        
    }
}