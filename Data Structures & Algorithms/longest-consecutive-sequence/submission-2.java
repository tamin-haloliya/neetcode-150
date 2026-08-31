class Solution {
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        HashMap<Integer, Boolean> exploredMap = new HashMap<>();

        for(int num: nums){
            exploredMap.put(num, Boolean.FALSE);
        }

        for(int num: nums){
            int currLength = 1;

            int nextNum = num + 1;
            while(exploredMap.containsKey(nextNum) && !exploredMap.get(nextNum)){
                exploredMap.put(nextNum, Boolean.TRUE);
                currLength++;
                nextNum++;
            }
            
            int prevNum = num - 1;
            while (exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)){
                exploredMap.put(prevNum, Boolean.TRUE);
                currLength++;
                prevNum--;
            }
            
            longestSequence = Math.max(currLength, longestSequence);
        }
        return longestSequence;
    }
}
