class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<int[]> st = new Stack<>();

        for(int i = 0 ; i < logs.size() ; i++){
            String s = logs.get(i);
            String[] brew = s.split(":");

            int fun_id = Integer.parseInt(brew[0]);
            String task = brew[1];
            int time = Integer.parseInt(brew[2]);

            if(task.equals("start") && !st.isEmpty()){
                int[] curr = st.peek();
                curr[2] += time - curr[1];
                st.push(new int[]{fun_id, time, 0});
            }
            else if(task.equals("start") && st.isEmpty()){
                st.push(new int[]{fun_id, time, 0} );
            }
                else if(task.equals("end")){
                   int[] curr = st.pop();
                   curr[2] += time - curr[1] + 1;
                   res[curr[0]] += curr[2];

                    if (!st.isEmpty()) {
                        st.peek()[1] = time + 1;
                    }
                }
        }
        return res;

    }
}