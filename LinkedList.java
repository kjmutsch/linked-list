public class LinkedList {
    // Node class representing an element in the linked list
    private static class Node {
        int data;
        Node next;
 
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
 
    // Head of the list
    private Node head;
 
    // Constructor
    public LinkedList() {
        this.head = null;
    }
 
    // Insert a new node at the beginning of the list
    public void insertAtHead(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
 
    // Insert a new node at the end of the list
    public void insertAtTail(int data) {
        // loop through entire list until you reach null
        Node temp = new Node(data);

        if(head == null) {
            head = temp;
            return;
        }

        Node current = head;
        while(current.next != null) current = current.next; // we've now reached the last node in the list

        current.next = temp;
    }
 
    // Delete a node with a specific value
    public void deleteNode(int data) {
        if(head.data == data) {
            head = head.next;
            return;
        }
        Node prev = head;
        Node current = head.next;
        while(current != null) {
            if(current.data == data) {
                // this means we found it
                prev.next = current.next;
                current = null; // this isn't necessary because of garbage collection I just like to explicitly set it
                return;
            }
            prev = current;
            current = current.next;
        }
        System.out.println("Could not find Node to delete");      
    }
 
    // Search for a node with a specific value
    public boolean search(int data) {
        Node current = head;
        while(current != null) {
            if(current.data == data) return true;
            current = current.next;
        }
        return false;
    }
 
    // Traverse and print all elements in the list
    public void traverse() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        // tail is always null
        System.out.println("null");
    }
 
    // Detect if there is a cycle in the list
    public boolean hasCycle() {
        // Implementation goes here
        return false; // Placeholder return value
    }
 
    // Reverse the linked list
    public Node reverseList() {
        // Implementation goes here
        return null; // Placeholder return value
    }
 
    // Merge two sorted linked lists
    public static Node mergeTwoLists(Node l1, Node l2) {
        // Implementation goes here
        return null; // Placeholder return value
    }
 
    // Main method for testing
    public static void main(String[] args) {
        // Test the LinkedList implementation here
    }
}
