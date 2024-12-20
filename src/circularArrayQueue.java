public class circularArrayQueue {

    private Employee[] circularArrayQueue;
    private int front;
    private int back;
    private int size;

    public circularArrayQueue(int capacity) {
        circularArrayQueue = new Employee[capacity];
    }

    public void addItemsToCircularQueue(Employee employee) {
        int newBackPos = 0;

        // resize the array when there is only one spot left
        if (size == circularArrayQueue.length - 1) {
            System.out.println("resize array");
            Employee[] newCircularArrayQueue = new Employee[2 * circularArrayQueue.length];
            newBackPos = circularArrayQueue.length-1;
            System.out.println("back position is when array is resized " + back);
            System.out.println("front position is when array is resized " + front);
            System.arraycopy(circularArrayQueue, front, newCircularArrayQueue, 0, circularArrayQueue.length - front);
            System.arraycopy(circularArrayQueue, 0, newCircularArrayQueue, circularArrayQueue.length-front, back);
            circularArrayQueue = newCircularArrayQueue;
            front = 0;
            back=newBackPos;
        }
        circularArrayQueue[back] = employee;
        size++;
        if (back < circularArrayQueue.length - 1) {
            back++;
        } else {
            // wrap back value when there is one spot left
            System.out.println("wrap back");
            back = 0;
        }
        System.out.println("back position is " + back);
    }

    public Employee removeItemFromCircularQueue() {
        if(isCircularQueueEmpty()){
            System.out.println("nothing to print, queue is empty");
            return null;
        }
        System.out.println("front position is " + front);
        Employee popEmployee = circularArrayQueue[front];
        System.out.println("popped employee is " + popEmployee.toString());
        circularArrayQueue[front] =null;
        front++;
        size--;
        if(getSize() == 0){
            front=0;
            back=0;
        }else if(front ==circularArrayQueue.length){
            System.out.println("wrap front");
            front =0;
        }
        return popEmployee;
    }

    public boolean isCircularQueueEmpty() {
        return size==0;
    }

    public boolean isCircularQueuefull() {
        return size ==circularArrayQueue.length;
    }

    public int getSize() {
        if(front >=back){
           return (circularArrayQueue.length-front) + back;
        } else {
            return back-front;
        }
    }

    public void printCircularQueue() {
        if(front >= back){
            System.out.println("back is wrapped");
            for(int i = front;i <circularArrayQueue.length;i++){
                System.out.println("Elements of the circular array queue is " + circularArrayQueue[i]);
            }
            for(int i = 0;i<back;i++){
                System.out.println("Elements of the circular array queue is " + circularArrayQueue[i]);
            }
        } else{
            for(int i = front;i<back;i++){
                System.out.println("Elements of the circular array queue is " + circularArrayQueue[i]);
            }
        }
    }
}
