import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;

            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    if (digits[k] % 2 != 0) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    set.add(num);
                }
            }
        }

        int[] ans = new int[set.size()];
        int idx = 0;

        for (int num : set) {
            ans[idx++] = num;
        }

        return ans;
    }
}