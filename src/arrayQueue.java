// udemy implementation
public class ArrayQueue {

    private Employee[] arrayQueue;
    private int front;
    private int back;
    private int size;

    public ArrayQueue(int capacity) {
        arrayQueue = new Employee[capacity];
    }

    public void addItemToQueue(Employee employee) {
        if(isQueueFull()){
            Employee[] newArrayQueue = new Employee[2 * arrayQueue.length];
            System.arraycopy(arrayQueue, 0, newArrayQueue, 0, arrayQueue.length);
            arrayQueue = newArrayQueue;
        }
        arrayQueue[back] = employee;
        size++;
        back++;
    }

    public Employee removeItemFromQueue() {
        if(isQueueEmpty()){
            System.out.println("queue empty, nothing to remove");
            return null;
        } else {
            size--;
            Employee popEmployee =  arrayQueue[front];
            arrayQueue[front] =null;
            front++;
            return popEmployee;
        }
    }

    public Employee peekEmployeeFromQueue() {
        if(isQueueEmpty()){
            System.out.println("queue empty, nothing to peek");
            return null;
        } else {
            Employee peekEmployee =  arrayQueue[front];
            return peekEmployee;
        }
    }

    public void printQueueItems() {
        for(int i = front;i<back;i++) {
            System.out.println("queue elements are " + arrayQueue[i]);
        }
    }

    public boolean isQueueFull() {
        return back ==arrayQueue.length;
    }

    public boolean isQueueEmpty() {
        return size==0;
    }

    public int getQueueSize() {
        System.out.println("size of the queue " + size);
        return size;
    }
}
