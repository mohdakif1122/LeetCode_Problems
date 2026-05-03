class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();

        if (n != m) return false;
        if (s.equals(goal)) return true;

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < n; i++) {
            char first = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(first);

            if (sb.toString().equals(goal)) {
                return true;
            }
        }

        return false;
    }
}