package LinkedList;



public class _2095_Delete_the_Middle_Node_of_a_Linked_List  {
   public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static int countOfNodes(ListNode head)
    {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    public ListNode deleteMiddleNode(ListNode head) {
        // Base cases
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
        ListNode copyHead = head;

        // Find the count of nodes
        int count = countOfNodes(head);

        // Find the middle node
        int mid = count / 2;

        // Delete the middle node
        while (mid-- > 1) {
            head = head.next;
        }

        // Delete the middle node
        head.next = head.next.next;

        return copyHead;
    }
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        _2095_Delete_the_Middle_Node_of_a_Linked_List solution = new _2095_Delete_the_Middle_Node_of_a_Linked_List();

        System.out.println("Original list:");
        printList(head);

        ListNode updatedHead = solution.deleteMiddleNode(head);

        System.out.println("List after deleting the middle node:");
        printList(updatedHead);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
