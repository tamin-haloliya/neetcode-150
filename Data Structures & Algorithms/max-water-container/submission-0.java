class Solution {
    public int maxArea(int[] heights) {
      int start = 0;
        int end = heights.length - 1;

        int maxCap = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = end - start;
            int length = Math.min(heights[start], heights[end]);

            int cap = width * length;

            if(cap > maxCap){
                maxCap = cap;
            }

            if(heights[start] > heights[end]){
                end--;
            } else if(heights[start] < heights[end]){
                start++;
            } else {
                start++;
            }
        }
        return maxCap;  
    }
}
