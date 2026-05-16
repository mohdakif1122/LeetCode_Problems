class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        Set<Character> set = new HashSet<>();

        int longest = 0;

        for (int i = 0; i < n; i++) {
            set.clear();

            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);
                
                if (set.contains(ch)) {
                    break;
                }

                set.add(ch);
                longest = Math.max(longest, set.size());
            }
        }

        return longest;
    }
}