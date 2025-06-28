package StackAndQueue;

import java.util.ArrayList;
import java.util.List;

class Pair{
    int min,val;
    public Pair(int val,int min){
        this.val=val;
        this.min=min;
    }
}
class MinStack {
    List<Pair> minStack;
    public MinStack() {
        minStack=new ArrayList<>();
    }

    public void push(int val){
        if(minStack.isEmpty()){
            minStack.add(new Pair(val,val));
        }
        else{
            if(val>minStack.getLast().min){
                minStack.add(new Pair(val,minStack.getLast().min));
            }
            else{
                minStack.add(new Pair(val,val));
            }
        }
    }

    public void pop() {
        if(minStack.isEmpty()){
            return;
        }
        minStack.removeLast();
    }

    public int top() {
        if(minStack.isEmpty()){
            return -1;
        }
        return minStack.getLast().val;
    }

    public int getMin() {
        if(minStack.isEmpty()){
            return -1;
        }
        return minStack.getLast().min;
    }

    public static void main(String[] args) {
        MinStack stack=new MinStack();
        stack.push(5);
        stack.push(-1);
        stack.push(3);
        stack.push(2);
        System.out.println("top ="+stack.top());
        System.out.println("min = "+stack.getMin());
        System.out.println("after popping out ");
        stack.pop();
        System.out.println("top ="+stack.top());
        System.out.println("min = "+stack.getMin());
    }
}
