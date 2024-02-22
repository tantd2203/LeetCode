package Stack_and_Queue;

public class MyArrayQueue implements IStackQueue {

    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    MyArrayQueue(int size) {
        this.SIZE = size;
        array = new int[SIZE];
        headIndex = tailIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!IsFull()) {

            if (IsEmpty()) {
                headIndex++;
            }

            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!IsEmpty()) {
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1;
            }
        }
        return value;
    }

    @Override
    public boolean IsFull() {
        return tailIndex == SIZE - 1;
    }

    @Override
    public boolean IsEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }

    public int count() {
        if (IsEmpty()) {
            return 0;
        }
        return tailIndex - headIndex + 1;
    }

    @Override
    public void print() {
        if (IsEmpty()){
            System.out.println("Queue is Empty!");
        }else {
            for (int i = headIndex; i  <= tailIndex ; i++) {
                System.out.print(array[i] +" ") ;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        MyArrayQueue queue = new MyArrayQueue(3);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.print();
        queue.pop();
        queue.print();
    }
}
