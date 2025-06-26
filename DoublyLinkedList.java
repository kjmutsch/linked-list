// Node class for the doubly linked list
class Node {
    int data;
    Node next;
    Node prev;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Doubly Linked List class
class DoublyLinkedList {
    Node head;

    // Add a node to the front of the list
    public void insertAtHead(int data) {
        // TODO
    }

    // Add a node in the given position
    public void insertAfter(Node prevNode, int data) {
        // TODO
    }

    // Add a node onto the end of the list
    public void insertAtTail(int data) {
        // TODO
    }

    public void deleteNode(Node delNode) {
      // TODO
    }

    // Traverse and print the list
    public void traverse() {
        // TODO
    }

    // Reverse the list
    public void reverseList() {
        // TODO
    }
}

// Main class to test the doubly linked list
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dllTester = new DoublyLinkedList();

    }
}
