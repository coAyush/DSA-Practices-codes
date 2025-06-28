package StackAndQueue;

import java.util.Arrays;

public class DynamicStack<T> extends CustomStack<T> {

    public void push(T item) {
        if(top==getSize()-1){
            System.out.println("Stack getting full");
            doubling(this.getSize());
        }
        stack[++top]=item;
    }

    private void doubling(int size) {

        stack=Arrays.copyOf(stack,2*size);
    }
    public T pop()throws Exception{
        if(top==-1)
            throw new Exception("Stack empty");
        return stack[top--];
    }
    public T peek()throws Exception{
        if(top==-1)
            throw new Exception("Stack empty");
        return stack[top];
    }
    public void display()throws Exception{
        if(top==-1)
            throw new Exception("Stack empty");
        int i=top;
        for(;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args)throws Exception {
            DynamicStack d=new DynamicStack();
        System.out.println(d.getSize());
            d.push(20);
            d.push(30);
            d.push(40);
            d.push(50);
            d.push(60);
            d.push(70);
            d.push(80);
            d.push(90);
            d.push(10);
            d.push(40);
            d.push(130);
            d.push(140);
       //     --------------------
        System.out.println("new size"+d.getSize());
        System.out.println(d.pop());
        d.display();

    }
}
