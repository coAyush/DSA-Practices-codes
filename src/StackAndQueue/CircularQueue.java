package StackAndQueue;

public class CircularQueue<T> {
    private static final int DEFAULT_SIZE = 5;
    int rear = -1, front = -1;
    public T[] queue;

    @SuppressWarnings("unchecked")
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    public CircularQueue(int size) {
        queue = (T[]) new Object[size];
    }

    public int getSize() {
        return queue.length;
    }

    public boolean isFull() {
        return (rear + 1) % getSize() == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(T element) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % getSize();
        }
        queue[rear] = element;
        System.out.println("Inserted: " + element);
    }

    public T deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return null;
        }

        T item = queue[front];

        if (front == rear) {
            // Only one element was present
            front = rear = -1;
            System.out.println("Queue becomes empty");
        } else {
            front = (front + 1) % getSize();
        }

        return item;
    }

    public void display() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");

        System.out.print("Queue contents: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + "\t");
            if (i == rear)
                break;
            i = (i + 1) % getSize();
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        CircularQueue<Integer> circular = new CircularQueue<>();
        circular.enQueue(5);
        circular.enQueue(10);
        circular.enQueue(15);
        circular.enQueue(20);
        circular.enQueue(25); // full now
        System.out.println("Size: " + circular.getSize());

        circular.display();

        System.out.println("\nDeleted = " + circular.deQueue());
        System.out.println("Deleted = " + circular.deQueue());

        circular.enQueue(30); // reuse position

        circular.display();
    }
}
