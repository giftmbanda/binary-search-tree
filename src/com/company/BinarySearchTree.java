package com.company;

public class BinarySearchTree {
    public Node root;

    // constructor
    public BinarySearchTree() {
        root = null;
    }

    // insert method
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // insert recursive method
    private Node insertRec(Node root, int data) {
        // tree is empty
        if (root == null) {
            return new Node(data);
        }

        // traverse the tree
        if (data < root.data) { // insert in the left subtree
            root.left = insertRec(root.left, data);
        } else if (data > root.data) { // insert in the right subtree
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // method for inorder traversal of BST
    public void inOrder() {
        traverseInOrder(root);
    }

    // recursively traverse the BST in order
    private void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    // method for pre-order traversal of BST
    public void preOrder() {
        traversePreOrder(root);
    }

    // recursively traverse the BST in pre-order
    private void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // method for post-order traversal of BST
    public void postOrder() {
        traversePostOrder(root);
    }

    // recursively traverse the BST in post-order
    private void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Returns whether this BST contains the given integer.
    public boolean contains(int data) {
        return containsRec(root, data);
    }

    // recursive contains method
    private boolean containsRec(Node root, int data) {
        if (root == null) {
            return false; // base case: not found here
        }

        if (data == root.data) {
            return true; // base case: found here
        } else if (data < root.data) {
            return containsRec(root.left, data); // root.data < value, so look in left subtree
        } else {
            return containsRec(root.right, data); // root.data > value, so look in right subtree
        }
    }

    // delete a node from a binary search tree
    public void delete(int data) {
        root = deleteRec(root, data);
    }

    // recursive delete method
    private Node deleteRec(Node root, int data) {
        if (root == null) {
            return root; // base case: not found here
        }

        if (data < root.data) { // root.data < value, so look in left subtree
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) { // root.data > value, so look in right subtree
            root.right = deleteRec(root.right, data);
        } else { // found the node to delete
            if (root.left == null) { // no left child
                return root.right;
            } else if (root.right == null) { // no right child
                return root.left;
            } else { // has two children
                root.data = findMinimum(root.right).data;
                root.right = deleteRec(root.right, root.data);
            }
        }
        return root;
    }

    public Node findMinimum() {
        Node node = root;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // find the minimum value in a BST
    private Node findMinimum(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public Node findMaximum() {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

}
