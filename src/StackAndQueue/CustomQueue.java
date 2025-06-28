package StackAndQueue;

public class CustomQueue<T>{
    private static final int DEFAULT_SIZE=10;
    int rear=-1,front=-1;
    public T[]queue;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        queue=(T[]) new Object[size];
    }
    public int getSize(){
        return queue.length;
    }
    public void enQueue(T element)throws Exception{
        if(rear==getSize()-1)
            throw new Exception("Queue is full!!");
        queue[++rear]=element;
        front=0;
    }
    public T deQueue()throws Exception{
        if(front==-1 || front>rear)
            throw new Exception("Queue's empty!!");
        T item=queue[front];
        for(int i=front+1;i<=rear;i++) {
            queue[i - 1] = queue[i];

        }
        rear--;
        if(front>rear){
            front=-1;
            rear=-1;
            System.out.println("queue becomes empty");
        }
        return item;
    }
    public void display()throws Exception{
        if(front==-1)
            throw new Exception("queue is empty");
        for (int i=front;i<=rear;i++)
            System.out.println(queue[i]);
    }
    public static void main(String[] args)throws Exception {
        CustomQueue<Integer>queue=new CustomQueue<>();
        queue.enQueue(25);
        queue.enQueue(30);
        queue.enQueue(35);
        queue.enQueue(45);

        System.out.println("size="+queue.getSize());


        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println();
        System.out.println(queue.getSize());
        System.out.println();
        queue.display();
    }
}
