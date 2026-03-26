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
            else { // ')'

                // check if this is "))"
                boolean isPair = (i + 1 < s.length() && s.charAt(i + 1) == ')');

                if (isPair) i++; // consume next ')'
                else fin_ans++; // need one more ')'

                if (!open.isEmpty()) {
                    open.pop(); // match with '('
                } else {
                    fin_ans++; // need to insert '('
                }
            }
        }

        // remaining '(' need 2 ')'
        return fin_ans + (open.size() * 2);
    }
}