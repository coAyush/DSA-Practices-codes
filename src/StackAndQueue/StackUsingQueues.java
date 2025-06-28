package StackAndQueue;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueues {
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();
    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer>temp=q1;
        q1=q2;
        q2=temp;
    }
    public int pop() {
        if (q1.isEmpty()){
            System.out.println("queue is empty");
            return -1;
    }
        return q1.remove();
    }
    public int top(){
        if(q1.isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return q1.peek();
    }
    public static void main(String[] args) {
      StackUsingQueues stack=new StackUsingQueues();
      stack.push(20);
      stack.push(10);
      stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();
        stack.push(30);
        System.out.println(stack.top());
    }
}
