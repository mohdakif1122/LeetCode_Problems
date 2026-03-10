class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res = new Stack<>();
        int x,y;

        for(String tk : tokens){
            if(tk.equals("+")){
                res.push(res.pop() + res.pop());
            }
            else if (tk.equals("-")){
                y = res.pop();
                x = res.pop();
                res.push(x-y);
            }
            else if (tk.equals("/")){
                y = res.pop();
                x = res.pop();
                res.push(x/y);
            }
            else if (tk.equals("*")){
                res.push(res.pop() * res.pop());
            }
            else{
                res.push(Integer.parseInt(tk));
            }
        }
        return res.peek();
    }
}