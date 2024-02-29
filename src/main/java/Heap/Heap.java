package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Heap {
    public static void main(String[] args) {
//        Min heap
        Queue<Integer> minHeap = new PriorityQueue<>(); //  thêm Comparator.reverseOrder() Thành tăng dần
        minHeap.add(10);
        minHeap.add(100);
        minHeap.add(12);
        minHeap.add(11);

        while (minHeap.isEmpty() == false) {
            System.out.println(minHeap.poll());
        }

    }
}
