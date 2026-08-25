// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isAnagram(String s, String t) {
        {
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {
                map.compute(c, (key, value) -> (value == null) ? 1 : value + 1);
            }

            for (char c : t.toCharArray()) {
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    map.replace(c, count, count - 1);
                } else {
                    return false;
                }
            }

            for (int count : map.values()) {
                if (count != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
