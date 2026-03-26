import java.util.*;

class Solution {
    public int minInsertions(String s) {
        int fin_ans = 0;
        Stack<Character> stk = new Stack<>();
        StringBuilder ii = new StringBuilder(s);

        for (int i = 0; i < ii.length(); i++) {

            if (ii.charAt(i) == '(') {
                stk.push('(');
            } 
            else {

                if (i + 1 < ii.length() && ii.charAt(i + 1) == ')') {
                    i++;

                    if (!stk.isEmpty()) {
                        stk.pop();
                    } else {
                        fin_ans++;
                    }
                } 
                else {
                    fin_ans++;

                    if (!stk.isEmpty()) {
                        stk.pop();
                    } else {
                        fin_ans++;
                    }
                }
            }
        }
        while (!stk.isEmpty()) {
            stk.pop();
            fin_ans += 2;
        }

        return fin_ans;
    }
}