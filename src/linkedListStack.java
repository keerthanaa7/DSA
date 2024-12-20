import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStack {
    LinkedList<Employee> linkedListStack;
    private int top;

    public LinkedListStack() {
        linkedListStack = new LinkedList<Employee>();
    }

    public void push(Employee employee){
        linkedListStack.push(employee);
    }

    public Employee pop(){
        if(linkedListStack.isEmpty()){
            System.out.println("nothing to pop, stack empty");
        }
        return linkedListStack.pop();
    }

    public Employee peek() {
        if(linkedListStack.isEmpty()){
            System.out.println("nothing to peek, stack empty");
        }
        return linkedListStack.peek();
    }

    public void printQueue() {
        Iterator<Employee> iterator = linkedListStack.iterator();
        while (iterator.hasNext()){
            System.out.println("items of the queue are " + iterator.next());
        }
    }

}
