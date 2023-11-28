package _test;

public class QueueEx {
    public static void main(String[] args) {
    CircularQueue queue = new CircularQueue();
    queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        queue.enqueue(30);
        System.out.println(queue.isEmpty());
       queue.enqueue(10);
        queue.enqueue(10);
        queue.enqueue(10);
        queue.enqueue(10);
        queue.enqueue(10);



    }
}
