class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<int[]> stk = new Stack<>();
        char[] c_arr = s.toCharArray();

        for (int x = 0; x < c_arr.length; x++) {
            if (Character.isLetter(c_arr[x])) continue;

            else if (c_arr[x] == '(') stk.push(new int[]{0, x});
            else if (c_arr[x] == ')' && !stk.isEmpty()) {
                if (stk.peek()[0] == 0) stk.pop();
                else stk.push(new int[]{1, x});
            }

            else stk.push(new int[]{1, x});
        }
        // for (int[] x : stk) System.out.println(Arrays.toString(x));
        int[] members;

        while (!stk.isEmpty()) {
            members = stk.pop();
            sb.setCharAt(members[1], ' ');
        }

        return sb.toString().replaceAll(" ", "");
    }
}