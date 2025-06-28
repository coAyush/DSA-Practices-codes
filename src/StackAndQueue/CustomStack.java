package StackAndQueue;

public class CustomStack<T> {
    private static final int DEFAULT_SIZE=10;
    T [] stack;
    int top;

    public CustomStack(int size) {
        stack=(T[])new Object[size];
        top=-1;
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public int getSize(){
        return stack.length;
    }

    public void push(T item)throws Exception{
        if(top==getSize()-1){
            throw new Exception("Out of bound");
        }
               stack[++top]=item;
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

    public static void main(String[] args) throws Exception {
        CustomStack<Integer>c=new CustomStack<>();
        c.push(25);
        c.push(30);
        c.push(35);
        c.push(45);

        c.display();
        System.out.println("topmost value is ="+c.peek());

        System.out.println("deleted value =" +c.pop());
        System.out.println("length ="+c.getSize());
    }
}
