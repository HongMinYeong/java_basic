package _test;

public class CircularQueue {
    private int[] queueArray = new int[10];
    private int queueSize = 5;
    private int front = 0;
    private int rear = 0;

    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("꽉참요");
            return;
        }
        queueArray[rear] = num;
        rear++;
        rear %= queueSize;
    }

    public boolean isFull() {
        if ((rear + 1) % queueSize == front) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (rear == front) {
            return true;
        } else {
            return false;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("empty");
        }

        int tmp = queueArray[front];
        front++;
        front %= queueSize;
        return tmp;
    }
}

