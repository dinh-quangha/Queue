public class ArrayQueue {
    private Node front, rear;

    public ArrayQueue() {
        this.front = this.rear = null;
    }

    // Thêm phần tử vào hàng đợi
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) { // Nếu hàng đợi rỗng
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Xóa phần tử khỏi hàng đợi
    public int dequeue() {
        if (front == null) { // Nếu hàng đợi rỗng
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = front.data; // Giá trị phần tử đầu tiên
        front = front.next; // Cập nhật front
        if (front == null) { // Nếu sau khi xóa hàng đợi trở thành rỗng
            rear = null;
        }
        return value;
    }

    // Xem phần tử đầu tiên của hàng đợi
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    // Kiểm tra hàng đợi có rỗng không
    public boolean isEmpty() {
        return front == null;
    }

    // Hiển thị hàng đợi
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}