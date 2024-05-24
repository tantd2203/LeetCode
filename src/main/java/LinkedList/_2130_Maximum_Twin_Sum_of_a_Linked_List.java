package LinkedList;

public class _2130_Maximum_Twin_Sum_of_a_Linked_List {

    public static class ListNode {
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

    public  static int pairSum(ListNode head) {


        if (head == null) {
            return 0;
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null, current = slow;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Step 3: Calculate the maximum twin sum
        ListNode firstHalf = head, secondHalf = prev;
        int maxTwinSum = 0;
        while (secondHalf != null) {
            int twinSum = firstHalf.val + secondHalf.val;
            maxTwinSum = Math.max(maxTwinSum, twinSum);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return maxTwinSum;
    }

    public static void printLinkedList(ListNode head) {

        if (head == null) {
            System.out.println("List is empty");
        } else {
            ListNode temp = head;
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
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printLinkedList(head1);
        System.out.println(pairSum(head1));
    }
}
