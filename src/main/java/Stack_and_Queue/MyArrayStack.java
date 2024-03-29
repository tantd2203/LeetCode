package Stack_and_Queue;

public class MyArrayStack implements  IStackQueue{

    public  class  Node {
        int value ;
        Node next;
        Node (int value){
            this.value= value;
        }
    }

    private   int[] array;
    private  int SIZE;

    private  int topIndex;
    MyArrayStack(int size){
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;


    }
    @Override
    public boolean push(int value) {
        if (!IsFull()){
            topIndex++;
            array[topIndex] = value;
            return  true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!IsEmpty()){
            int value = array[topIndex];
            topIndex --;
            return  value;
        }
        return -1;
    }

    @Override
    public boolean IsFull() {

        return topIndex == SIZE-1;
    }

    @Override
    public boolean IsEmpty() {

        return topIndex < 0;
    }

    @Override
    public void print() {
        if (IsEmpty()){
            System.out.println("Stack is Empty!");
        }else {
            for (int i = 0; i <=topIndex ; i++) {
                System.out.print(array[i] +" ") ;
            }
            System.out.println();

        }
    }
}
