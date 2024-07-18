package LinkedList;

public class _83_Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;  // Skip the duplicate
            } else {
                current = current.next;  // Move to the next node
            }
        }

        return head;
    }
}
