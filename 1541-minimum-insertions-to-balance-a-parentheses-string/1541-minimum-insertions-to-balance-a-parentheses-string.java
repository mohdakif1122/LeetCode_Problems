import java.util.*;

class Solution {
    public int minInsertions(String s) {

        int fin_ans = 0;
        Stack<Character> open = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                open.push('(');
            } 
            else {

                boolean isPair = (i + 1 < s.length() && s.charAt(i + 1) == ')');

                if (isPair) i++; 
                else fin_ans++;

                if (!open.isEmpty()) {
                    open.pop();
                } else {
                    fin_ans++;
                }
            }
        }
        return fin_ans + (open.size() * 2);
    }
}