class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.compute(num, (key, value) -> (value == null) ? 1 : value + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);

        for (int i = 0; i < nums.length + 1; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num : freqMap.keySet()) {
            buckets.get(freqMap.get(num)).add(num);
        }

        List<Integer> result = new ArrayList<>();

        outer:
        for (int freq = nums.length; freq > 0; freq--) {
            for (Integer num : buckets.get(freq)) {
                result.add(num);
                if(result.size() == k){
                    break outer;
                }
            }
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}