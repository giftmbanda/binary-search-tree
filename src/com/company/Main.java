package com.company;

public class Main {

    public static void main(String[] args) {

        // create a Binary Search Tree object
        BinarySearchTree bst = new BinarySearchTree();

        /* BST tree example
                8
              /   \
             3     10
           /  \      \
          1    6      14
              /  \    /
             4    7  13
        */
        // insert data into Binary Search Tree
        bst.insert(8);
        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(14);
        bst.insert(4);
        bst.insert(7);
        bst.insert(13);

        // print the BST
        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inOrder();

        System.out.println("\nThe BST Created with input data(root-Left-right):"); 
        bst.preOrder();

        System.out.println("\nThe BST Created with input data(Left-right-root):");
        bst.postOrder();

        // search a value in the BST
        // Node minimum = bst.findMinimum(); // return the node with minimum value
        // Boolean contains = bst.contains(8); // return the node found else returns null
        // System.out.println("\nfound is: " + minimum.data);
        // System.out.println("Minimum is: " + contains);

    }

}
