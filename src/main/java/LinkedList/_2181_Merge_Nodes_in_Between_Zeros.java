package LinkedList;

public class _2181_Merge_Nodes_in_Between_Zeros {

    public ListNode mergeNodes(ListNode head) {

        ListNode dumpy = new ListNode(0);
        ListNode current = dumpy;
        ListNode currentNode = head.next; //   vì bat dau sau node 0
        int tempSum = 0;

        while (currentNode != null) {
            if (currentNode.val == 0) {
                current.next = new ListNode(tempSum);
                tempSum = 0;
            } else {
                tempSum += currentNode.val;
            }
            currentNode = currentNode.next;
        }
        return dumpy.next;

    }
    // Helper function to create a linked list from an array of values
    public ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper function to print the linked list
    public void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        _2181_Merge_Nodes_in_Between_Zeros solution = new _2181_Merge_Nodes_in_Between_Zeros();

        int[] values = {0, 3, 1, 0, 4, 5, 2, 0};
        ListNode head = solution.createLinkedList(values);

        System.out.println("Original linked list:");
        solution.printLinkedList(head);

        ListNode mergedHead = solution.mergeNodes(head);

        System.out.println("Merged linked list:");
        solution.printLinkedList(mergedHead);
    }
}
