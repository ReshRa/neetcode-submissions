class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // 2. Sort distinct values by count, descending
        List<Integer> distinct = new ArrayList<>(map.keySet());
        distinct.sort((a, b) -> map.get(b) - map.get(a));

        // 3. Take the top k
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = distinct.get(i);
        }
        return res;
    }
}