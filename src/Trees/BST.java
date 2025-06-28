package Trees;

import java.util.Scanner;

public class BST {
    private class Node {
        int height;
        Node right;
        Node left;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert() {
        int[] arr = {5, 4, 9, 4, 5, 7};
        for (int i : arr) {
            root = insert(i, root);
        }
    }

    private int getHeigth(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val <= node.value) {
            node.left = insert(val, node.left);
        }
        if (val >= node.value) {
            node.right = insert(val, node.right);
        }
        node.height = Math.max(getHeigth(node.right), getHeigth(node.left)) + 1;
        return node;
    }

    private boolean balance(Node node) {
        if (node == null)
            return true;
        return Math.abs(getHeigth(node.left) - getHeigth(node.right)) <= 1 && balance(node.left) && balance(node.right);
    }

    private void display(Node root) {
        display(root, "Root node" + root.value);
    }
    public boolean search(int target){
        return searchTree(target,root);
    }
    public int count(Node root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
       return count(root.left)+count(root.right);
    }
    private boolean searchTree(int target, Node root) {
        if(root==null){
            return false;
        }
        if(root.value==target)
            return true;
        if(target< root.value){
            return searchTree(target,root.left);
        }
        return searchTree(target,root.right);
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + ": " + node.value);
        display(node.left, "Left child of " + node.value);
        display(node.right, "Right child of " + node.value);
    }

    public static void main(String[] args) {
        BST b=new BST();
        b.insert();
        System.out.println(b.search(9));
        System.out.println(b.count(b.root));
    }
}