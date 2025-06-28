package LinkedList;

import java.util.Scanner;

class LinkedList{
    Scanner sc=new Scanner(System.in);
     Node head=null;
     Node tail=null;
     int size=0;
     public  void setSize(){
         size+=1;
     }
     public  int getSize(){
         return size;
     }
     public void insertFirst(int value){
         Node node=new Node(value);
         node.next=head;
         head=node;
         if(tail==null){
             tail=node;
         }
         size+=1;
     }
     public void insertEnd(int value){
         Node node=new Node(value);
         if(head==null){
             head=node;
             tail=node;
             node.next=null;
         }
         else {
             tail.next = node;
             node.next = null;
             tail=node;
         }
         size+=1;
     }
     public void insertAtAnyPos(int pos){
         if(pos<1 || pos>size+1)
         {
             System.out.println("invalalid positon");
             return;
         }
         if(pos==1){
             System.out.println("enter the data want to insert");
             insertFirst(sc.nextInt());
             return;
         }
         if(pos==size+1){
             System.out.println("enter the data want to insert");
             insertEnd(sc.nextInt());
             return;
         }
         int s=1;
         Node temp=head;

         while (s!=pos-1){
             temp=temp.next;
             s++;
         }
         Scanner sc=new Scanner(System.in);
         System.out.println("enter data");
         int val=sc.nextInt();
         Node node=new Node(val);
         node.next=temp.next;
         temp.next=node;
         size++;
     }
     public int deleteAtFirst(){
         int deleted=head.data;
         if (head.next==null){
             head=null;
             tail=null;
         }
         else {
           head=head.next;
         }
         size--;
         return deleted;
    }
    public int deleteAtEnd() {
        Node temp = head;
        int deleted;
        if (head.next == null) {
            deleted = temp.data;
            head = null;
            tail = null;
        } else {
            while (temp.next.next!=null) {
                temp = temp.next;
            }
            deleted = temp.next.data;
            temp.next = null;
            tail=temp;
        }
            size--;
            return deleted;
    }
    public int deleteAtpos(int pos) {
        int i = 1;
        int value;
        if(pos <1 || pos>size){
            System.out.println("invalid position ");
            return -1;
        }
        if (head == null) {
            System.out.println("deletion not possible");
            return -1;
        }
        if (pos == 1) {
            value = deleteAtFirst();
            return value;
        }
        if (pos == size){
            value=deleteAtEnd();
            return value;
    }
         Node temp=head;
         while(i<pos-1){
             temp=temp.next;
             i++;
         }
        value=temp.next.data;
         Node delete=temp.next;
         temp.next=delete.next;
         delete.next=null;
         size--;
         return value;
    }
     public void display(){
         Node temp=head;
         while (temp!=null){
             System.out.print(temp.data+" ->");
             temp=temp.next;
         }
         System.out.println("End");
     }
     public void recursiveInsertion(int pos,int val){
         Node node=new Node(val);
         Node tem=head;
         head=helper(pos,node,head,0,tem);
         size++;
     }

    private Node helper(int pos, Node node, Node head, int i, Node tem) {
         if(pos==0){
             node.next=head;
             return node;
         }
         if(i==pos-1){
             node.next=tem.next;
             tem.next=node;
             return head;
         }
         return helper(pos,node,head,i+1,tem.next);
    }
    //Remove duplicates from sorted linkedlist
    public void remove(){
         Node tem=head;
         while (tem!=null && tem.next!=null) {
             if (tem.data == tem.next.data) {
                 tem.next = tem.next.next;
                 size--;
             } else {
                 tem = tem.next;
             }
         }
     }
     public Node mergeSort(Node head){

         if(head==null || head.next==null){
             return head;
         }
         Node temp=mid(head);
         Node rightHead=temp.next;
         temp.next=null;
         Node left=mergeSort(head);
         Node right=mergeSort(rightHead);
         return merge(left,right);
     }

    private Node merge(Node left, Node right) {
         Node dummy=new Node();
         Node tail=dummy;
         while (left!=null && right!=null){
             if(left.data<=right.data){
                 tail.next=left;
                 left=left.next;
             }
             else {
                 tail.next=right;
                 right=right.next;

             }
             tail=tail.next;
         }
         while (left!=null){
             tail.next=left;
             left=left.next;
             tail=tail.next;
         }
         while (right!=null){
             tail.next=right;
             right=right.next;
             tail=tail.next;
         }
         return dummy.next;
    }


    private Node mid(Node head) {
         Node fast =head,slow=head;
         while (fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
         }
         return slow;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node(){

        }

    }
    public Node temp(int val){
         return new Node(val);
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        Scanner sc=new Scanner(System.in);
     //   list.insertFirst(5);
     list.insertEnd(1);
     list.insertEnd(1);
     list.insertEnd(1);
     list.insertEnd(2);
     list.insertEnd(2);

//       // list.display();
//        list.insertEnd(5);
//    //    System.out.println("enter position");
//      //  list.insertAtAnyPos(sc.nextInt());
//     //   list.display();
//     //   System.out.println(list.getSize());
//        list.display();
//        list.deleteAtpos(3);
//      //  System.out.println("deleted element = "+list.deleteAtFirst());
//        list.display();
//       // System.out.println(list.getSize());
////        System.out.println();
////        System.out.println();
////       // System.out.println(list.deleteAtEnd());
////       // list.display();
////        //System.out.println(list.getSize());
////        System.out.println(list.deleteAtpos(2));
////        list.display();
////        System.out.println(list.getSize());
//        InsertUsingRecursion recur=new InsertUsingRecursion();
//        System.out.println("enter value to insert");
//        int value= sc.nextInt();
//        System.out.println("enter position");
//        int pos=sc.nextInt();
//        System.out.println("before insertion");
//        System.out.print("Size = "+list.getSize()+" ");
//        list.display();
//        System.out.println("after insertion");
//        System.out.print("Size = "+list.getSize()+" ");
//         recur.insert(pos,list.temp(value), list.head);
//          list.display();
//        recur.getInstance(list);
//        list.recursiveInsertion(pos,value);
        list.display();
        list.head=list.mergeSort(list.head);
        System.out.println("after removing duplicates");
        list.remove();
        list.display();
    }
}


