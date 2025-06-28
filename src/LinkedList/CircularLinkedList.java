package LinkedList;

import java.util.Scanner;

class Circular{
    private Node head;
    private Node tail;
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public void insertFirst(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the data");
        Node node=new Node(sc.nextInt());
        if(head==null){
            head=node;
            tail=node;
            node.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=node;
        node.next=head;
        head=node;
        tail=temp;

    }
    public void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data+"->");//last node;
        System.out.print("HEAD  ");
    }
    public void insert(){
        System.out.println("enter the data");
        Scanner sc=new Scanner(System.in);
        Node node=new Node(sc.nextInt());
        if(head==null){
            head=node;
            tail=node;
            node.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        tail=temp;
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void delete(int data){
      if(head==null)
          return;
      if(head.data==data){
          tail.next=head.next;
          head=head.next;
      }
      Node temp=head;
     do{
         if(temp.next.data==data){
             temp.next=temp.next.next;
         }
         temp=temp.next;
     }while (temp!=head);
    }
}
public class CircularLinkedList {
    public static void main(String[] args) {
        Circular list=new Circular();
       // list.insertFirst();
        //list.insertFirst();
//        list.insertFirst();
//        list.insertFirst();
        list.insert();
        list.insert();
        list.insert();
        list.insert();
        list.display();
        System.out.println("enter the data to delete");
        Scanner sc=new Scanner(System.in);
        list.delete(sc.nextInt());
        list.display();
    }
}
