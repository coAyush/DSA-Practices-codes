package StackAndQueue;
public class Link_Stack {
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
        }
        Node head=null;
        public void push(int x) {
            Node newnode = new Node(x);
            if(head==null)
            {
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }

        public int pop() {
            if(head==null){
                return -1;
            }
            Node temp=head;
            int x=head.data;
            head=head.next;
            temp.next=null;
            return x;
        }

        public int top() {
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty() {
            return head==null;
        }

    public static void main(String[] args) {
        Link_Stack l = new Link_Stack();
        l.push(10);
        l.push(20);
        System.out.println(l.top());
        System.out.println(l.pop());
        System.out.println(l.top());
    }
}
