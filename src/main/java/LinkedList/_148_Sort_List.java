package LinkedList;

public class _148_Sort_List {
    public static class ListNode {
        int value;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    static void swap(ListNode l1, ListNode l2) {

        int temp = l2.value;
        l2.value = l1.value;
        l1.value = temp;
    }

    static ListNode insertToHead(ListNode node, int data) {
        ListNode listNode = new ListNode(data);
        listNode.next = node;
        node = listNode;
        return node;
    }

    public static ListNode sortList(ListNode head) {


        return null;
    }

    public static void main(String[] args) {

    }
}
