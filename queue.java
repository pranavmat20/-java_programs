public class queue {
    
    //create a queue using array in java
    
    int[] queue = new int[5];
    int size;
    int front;
    int rear;



    public void enQueue(int data) {
        queue[rear] = data;
        rear++;
        size++;
    }

    //check if queue is empty

    public boolean isEmpty() {
        return size == 0;
    }

    //check if queue is full

    public boolean isFull() {
        return size == 5;
    }

}
