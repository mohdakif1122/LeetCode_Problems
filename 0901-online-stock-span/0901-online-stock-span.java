class StockSpanner {
    Stack<int[]> stk;   //declare
    public StockSpanner() {
        stk = new Stack<>();    //initialize

    }
    
    public int next(int price) {
        int count = 1;
        if(stk.isEmpty()){
            stk.push(new int[]{price , count});
            return count;
        }
        else{
            while(!stk.isEmpty() && stk.peek()[0] <= price){
                count += stk.peek()[1];
                // count++;
                stk.pop();
            }
            stk.push(new int[]{price , count});
            return count;
        }
        
    }
}
