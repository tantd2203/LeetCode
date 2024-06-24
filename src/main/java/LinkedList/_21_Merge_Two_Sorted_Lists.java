package LinkedList;

public class _21_Merge_Two_Sorted_Lists {
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


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur = new ListNode(0);
        ListNode temp = cur;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
                cur = cur.next;
            }
        }
        if (list1 != null) {
            cur.next = list1;
            list1 = list1.next;
            cur = cur.next;
        }
        if (list2 != null) {
            cur.next = list2;
            list2 = list2.next;
            cur = cur.next;
        }


        return temp.next;
    }

    public static void printLinkedList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        _21_Merge_Two_Sorted_Lists solution = new _21_Merge_Two_Sorted_Lists();
        // Example lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedList = solution.mergeTwoLists(l1, l2);
        printLinkedList(mergedList);

    }
}
