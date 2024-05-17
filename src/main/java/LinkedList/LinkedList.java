package LinkedList;

import javax.swing.plaf.PanelUI;

public class LinkedList {
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    //    print list
    public static void printLinkedList(Node head) {

        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addAtHead(Node headNode, int value) {

        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addAtTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {
        Node newNode = new Node(value);
        if (index == 0) {
            return addAtHead(headNode, value);
        } else {
//            step 1 Find index need add  in Node
            Node curNode = headNode;
            int count = 0;
            while (curNode.next != null) {
                count++;
                if (count == index) {

                    newNode.next = curNode.next;
                    curNode.next = newNode;

                    break;
                }
                curNode = curNode.next;
            }
        }

        return headNode;
    }

    public static Node removeAtNodeHead(Node headNode) {

        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtNodeTail(Node headNode) {
        // Step 1 : Find last and previous
        Node lastNode = headNode;
        Node prevNode = null;
        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if (prevNode == null) {
            return null;
        } else {
            prevNode.next = lastNode.next;
        }

        return headNode;
    }

    public static int getValueNodeIndex(Node headNode, int index) {
        Node curNode = headNode;

        int count = 0;

        while (curNode != null) {
            count++;
            curNode = curNode.next;
            if (count == index) {
                return curNode.value;
            }
        }
        return -1;

    }

    public static Node removeAtIndex(Node headNode, int index) {

        if (index < 0 || headNode == null) {
            return null;
        }
        if (index == 0) {

            return removeAtNodeHead(headNode);

        }
        Node currNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean isFound = false;
        while (currNode.next != null) {
            if (count == index) {
//                remove curr index
                isFound = true;
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }
        if (isFound) {
            if (prevNode == null) {  //
                return null;
            } else {
                prevNode.next = currNode.next;
            }
        }

        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        addAtTail(n1, 2);
        addAtTail(n1, 3);
        addAtTail(n1, 4);

        printLinkedList(n1);
        n1 = removeAtIndex(n1, 0);
        printLinkedList(n1);


    }
}
