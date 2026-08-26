class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];

            if(hmap.containsKey(sub)){
                return new int[]{hmap.get(sub), i};
            } else {
                hmap.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
