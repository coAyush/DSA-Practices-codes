package Trees;

import java.util.Scanner;

public class BinaryTree {
    public static class Node{
        int value;
        Node right;
        Node left;
        public  Node(int value){
            this.value=value;
        }
    }
    Node root;
    public void populate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the root value");
        int val=sc.nextInt();
        root= new Node(val);
        populateMore(root,sc);
    }
    public void populateMore(Node node,Scanner sc){
        System.out.println("do you want to insert left of "+node.value);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("enter the value");
            int value=sc.nextInt();
            node.left= new Node(value);
            populateMore(node.left,sc);
        }
        System.out.println("Want to insert right of "+node.value);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("enter the value");
            int value=sc.nextInt();
            node.right= new Node(value);
            populateMore(node.right,sc);
        }
    }
    public  void display(Node node,int level,String indent){
        if(node==null){
            return;
        }
        for(int i=0;i<level;i++){
            System.out.print("   ");
        }
        System.out.println();
        System.out.println(indent+node.value+"\t");
        display(node.left,level+1,"<--|");
        display(node.right,level+1,"|-->");
    }
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.populate();
        bt.display(bt.root,0,"");
    }

}
