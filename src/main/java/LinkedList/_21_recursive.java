package LinkedList;

import org.w3c.dom.NodeList;

public class _21_recursive {
    public static class ListNode {
        int value;
        ListNode next;

        ListNode() {

        }

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

    }

    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.value < list2.value) {
            list1.next = mergeTwoList(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoList(list1, list2.next);

            return list2;
        }

    }

    public static void printLinkedList(ListNode nodeList) {
        while (nodeList != null) {
            System.out.print(nodeList.value + " ");
            nodeList = nodeList.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        _21_recursive solution = new    _21_recursive();
        // Example lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new  ListNode(4);

        ListNode mergedList = solution.mergeTwoList(l1,l2);
        printLinkedList(mergedList);
    }
}
