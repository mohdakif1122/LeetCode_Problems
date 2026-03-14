class node{
    int price,span;
    node next;
    node(int price,int span){
        this.price=price;
        this.span=span;
        this.next=null;
    }
}
class StockSpanner {
    node top;
    public StockSpanner() {
        top=null;
    }
    
    public int next(int price) {
        node nn;
        int span=1;
        while(top!=null&&top.price<=price){
            span+=top.span;
            top=top.next;
        }
        nn=new node(price,span);
        nn.next=top;
        top=nn;
        return top.span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */