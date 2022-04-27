package com.company;

//Class node having Generic data-type <T>
public class Node {
    public int data; //Data to store (could be int, string, Object etc)
    public Node right; //Pointer to child right node in
    public Node left; //Pointer to child left node in

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
