// class Solution {
//     public int numberOfSubstrings(String s) {
//         int n = s.length();
//         char[] ch = s.toCharArray();
//         int count = 0;

//         for (int i = 0; i < n - 2; i++) {
//             List<Character> check = new ArrayList<>();

//             for (int j = i; j < n; j++) {
//                 check.add(ch[j]);

//                 if (check.contains('a') &&
//                     check.contains('b') &&
//                     check.contains('c')) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3]; // a -> 0, b -> 1, c -> 2
        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += s.length() - right;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}