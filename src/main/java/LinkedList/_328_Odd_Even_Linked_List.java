package LinkedList;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class _328_Odd_Even_Linked_List {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        // Test case 1: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.print("Test case 1: ");
        printList(head1);
        head1 = oddEvenList(head1);
        System.out.print("Reordered: ");
        printList(head1);  // Expected: 1 -> 3 -> 5 -> 2 -> 4 -> None

        // Test case 2: 2 -> 1 -> 3 -> 5 -> 6 -> 4 -> 7
        ListNode head2 = new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(7)))))));
        System.out.print("Test case 2: ");
        printList(head2);
        head2 = oddEvenList(head2);
        System.out.print("Reordered: ");
        printList(head2);  // Expected: 2 -> 3 -> 6 -> 7 -> 1 -> 5 -> 4 -> None

    }
}
