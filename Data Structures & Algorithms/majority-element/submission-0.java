class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num : nums){

            map.put(num,map.getOrDefault(num,0)+1);
        }
        // int max = 0;
//         int output = 0;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//     if (entry.getValue() > max) {
//         max = entry.getValue();
//         output = entry.getKey();
//     }
// }

//         return output;
int[] max = {0};
int[] output = {0};
map.forEach((key, value) -> {
    if(value > max[0]){
        max[0] = value;
        output[0] = key;
    }
});
return output[0];
    }
}