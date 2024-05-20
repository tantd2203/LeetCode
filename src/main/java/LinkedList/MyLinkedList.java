package LinkedList;

public class MyLinkedList {
    Node head;
    int length;

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int get(int index) {
        if (index >= length) {
            return -1;
        }
        int counter = 0;
        Node temp = head;
        while (counter < index) {
            counter++;
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addAtTail(int value) {
        if (head == null) {
            addAtHead(value);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(value);
            temp.next = newNode;
            length++;
        }
    }

    public void addAtIndex(int index, int value) {
        if (index > length)
            return;
        if (index == 0) addAtHead(value);
        else {
            int counter = 1;
            Node temp = head;
            while (counter < index) {
                temp = temp.next;
                counter++;
            }
            Node newNode = new Node(value);
            Node next = temp.next;
            temp.next = newNode;
            newNode.next = next;
            length++;

        }

    }

    public void deleteAtIndex(int index) {
        if (index >= length)
            return;
        if (index == 0) {
            head = head.next;
            length--;
        } else {
            int counter = 1;
            Node temp = head;
            while (counter < index) {
                counter++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            length--;
        }
    }

    public void printNode() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }

        }

    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Add elements
        list.addAtHead(1);
        list.addAtTail(2);
        list.addAtTail(3);
        list.addAtIndex(1, 4); // List: 1->4->2->3
        list.printNode();

        // Get elements
        System.out.println("Element at index 2: " + list.get(2)); // Should print 2

        // Delete element
        list.deleteAtIndex(1); // List: 1->2->3
        list.printNode();

        // Delete head
        list.deleteAtIndex(0); // List: 2->3
        list.printNode();

        // Try to delete out of bounds
        list.deleteAtIndex(5); // List should remain the same: 2->3
        list.printNode();
    }
}
