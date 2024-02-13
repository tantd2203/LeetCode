package LinkedList;

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

    public static Node addToHead(Node headNode, int value) {

        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static  Node addToTail(Node headNode, int value){
        Node  newNode =  new Node(value);
        if (headNode == null){
            return  newNode;
         }
        else{
            Node lastNode = headNode;
            while (lastNode.next !=null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        return  headNode;
    }

    public static  Node addToIndex(Node headNode, int value, int index){
        Node newNode =new Node(value);
        if (index == 0){
          return addToHead(headNode,value);
        }else {
//            step 1 Find index need add  in Node
            Node curNode = headNode;
            int count  =0;
            while (curNode.next !=null){
                count ++;
                if (count == index){

                    newNode.next = curNode.next;
                    curNode.next = newNode;

                    break;
                }
                curNode= curNode.next;
            }
        }

        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        printLinkedList(n1);
        Node newNode = addToHead(n1,0);
        printLinkedList(newNode);
        Node addToTail = addToTail(newNode,3);
        printLinkedList(addToTail);
        Node addToIndex = addToIndex(addToTail,2,2);
        printLinkedList(addToIndex);


    }
}
