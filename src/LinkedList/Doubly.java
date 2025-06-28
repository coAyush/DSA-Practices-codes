package LinkedList;

import java.util.Scanner;

class DoublyLinkedList{
        Node head;
        Node tail;
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public void insertFirst(int data){
       //System.out.println("enter the data want to insert");
        // Scanner sc=new Scanner(System.in);
      Node node=new Node(data);
      node.next=head;
      node.prev=null;
      if(head!=null){
          head.prev=node;
      }
      head=node;
    }
    Node last=null;

    public void display(){
        Node temp=head;
        while(temp!=null){
            last=temp;
            System.out.print(temp.val+" ->");
            temp=temp.next;
        }
        System.out.print("End");
        System.out.println();
    }
    public void insertLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            insertFirst(data);
            return;
        }

        Node temp1 = head;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        node.prev = temp1;
        temp1.next = node;
        node.next = null;
    }
        public void reverse(){
        while (last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
      System.out.print("Start");
  }
  public void insertRandom(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        Node temp2=head;
        while (true){
            if(temp2.val==value)
                break;
            temp2=temp2.next;
        }
        Node node=new Node(10);
        node.prev=temp2;
        node.next=temp2.next;
        temp2.next.prev=node.next;
        temp2.next=node;
  }
}
public class Doubly {
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        System.out.println("after reversing");
        list.reverse();
        list.insertLast(5);
        System.out.println();
        list.display();
        System.out.println();
        list.reverse();
        System.out.println();
        System.out.println("enter value after which to insert");
        Scanner sc=new Scanner(System.in);
        int pos=sc.nextInt();
        list.insertRandom(pos);
        list.display();
    }
}
