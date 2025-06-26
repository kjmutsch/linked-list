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
    // edge cases I'd use to test: single node that is a cycle, null list, single node that is not a cycle, even numbered
    // list, odd numbered list
    public boolean hasCycle() {
        if(head == null || head.next == null) return false;
        Node fast = head.next;
        Node slow = head;

        while(fast != null && fast.next != null) {
            if(fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return false;
    }
 
    // Reverse the linked list, time complexity is O(n) and space complexity is O(1) because it's only storing pointers
    public Node reverseList() {
        Node curr = head;
        Node prev = null;
        while (curr != null) { // ex. 1, 2, 3, 4, all comments are for first iteration only
            Node saveOld = curr; // save old list (1, 2, 3, 4)
            curr.next = prev; // set current node's next value to previous value (1 => null)
            prev = curr; // prev is now 1
            curr = saveOld.next; // now contains entire list starting at 2, 2 => 3 => 4 => null
        }
        return prev;
    }
 
    // Merge two sorted linked lists into a new sorted linked list
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node listBuilder = new Node(-1);
        Node headStorage = listBuilder; // points to same place as listBuilder

        while(l1 != null && l2 != null) {
            // find which list has the smallest value
            if(l1.data <= l2.data) {
                listBuilder.next = l1;
                l1 = l1.next; // move onto next value for l1
            } else {
                listBuilder.next = l2;
                l2 = l2.next; // move onto next value for l2
            }
            listBuilder = listBuilder.next; 
        }
        if(l1 == null) {
            listBuilder.next = l2;
        } else if (l2 == null) {
            listBuilder.next = l1;
        }
        return headStorage.next; // return the temp value head's next
    }
 
    // Main method for testing
    public static void main(String[] args) {
        // Test the LinkedList implementation here
        LinkedList tester = new LinkedList();
        tester.insertAtHead(1);
        tester.insertAtHead(5);

        tester.traverse();
    }
}
