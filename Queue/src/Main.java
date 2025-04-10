public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        // Thêm phần tử vào queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("\nDequeued: " + queue.dequeue());
        queue.display();

        System.out.println("\nPeek: " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}