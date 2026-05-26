class Solution {
    public int numberOfSpecialChars(String word) {
        // Step 1: Store every character seen in the word
        Set<Character> set = new HashSet<>();
        for (char ch : word.toCharArray()) {
            set.add(ch);
        }

        int count = 0;
        // Step 2: Iterate through lowercase letters 'a' through 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // A character is special if the set contains 'a' AND 'A'
            if (set.contains(ch) && set.contains(Character.toUpperCase(ch))) {
                count++;
            }
        }
        
        return count;
    }
}