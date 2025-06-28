package StackAndQueue;

import java.util.Stack;

public class Queues_Stack {
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();
    public void enQueue(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int deQueue(){
        if(s1.isEmpty())
        {
            System.out.println("empty");
            return -1;
        }
        return s1.pop();
    }
    public int peek(){
        if(s1.isEmpty())
        {
            System.out.println("empty");
            return -1;
        }
        return s1.peek();
    }
    public static void main(String[] args) {
        Queues_Stack q=new Queues_Stack();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        System.out.println(q.deQueue());
        System.out.println();

        System.out.println(q.peek());
    }

}
