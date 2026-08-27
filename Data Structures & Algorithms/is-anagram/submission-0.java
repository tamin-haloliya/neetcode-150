class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<Character> list = new ArrayList<>(s.length());
        for (char c : s.toCharArray()) {
            list.add(c);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (list.contains(c)) {
                list.remove(Character.valueOf(c));
            } else {
                return false;
            }
        }
        return true;
    }
}
