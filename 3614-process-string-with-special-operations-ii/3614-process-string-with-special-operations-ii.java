// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// class Solution {
//     public char processStr(String s, long k) {
//         int n = s.length();
//         List<Character> result = new ArrayList<>();
//         String special = "#%*";

//         for (int i = 0; i < n; i++) {
//             char ch = s.charAt(i);

//             if (special.indexOf(ch) == -1) {
//                 result.add(ch);
//             } 
//             else {
//                 if (ch == '*') {
//                     if (!result.isEmpty()) {
//                         result.remove(result.size() - 1);
//                     }
//                 }
//                 else if (ch == '#') {
//                     List<Character> dup = new ArrayList<>(result);
//                     result.addAll(dup);
//                 }
//                 else if (ch == '%') {
//                     Collections.reverse(result);
//                 }
//             }
//         }
//         return (k >= 0 && k < result.size()) ? result.get((int) k) : '.'; 
//     }
// }

// ================== optimized =====================
class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] lens = new long[n];
        long len = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '*')
                len = Math.max(len - 1, 0L);
            else if (c == '#')
                len *= 2;
            else if (c != '%')
                len++;
            
            lens[i] = len;
        }

        if (k >= len) return '.';

        for (int i = n - 1; ; i--) {
            char c = s.charAt(i);
            switch (c) {
                case '*':
                    break;
                case '#':
                    if (k >= lens[i] / 2)
                        k -= lens[i] / 2;
                    break;
                case '%':
                    k = lens[i] - 1 - k;
                    break;
                default:
                    if (lens[i] == k + 1)
                        return c;
            }
        }
    }
}