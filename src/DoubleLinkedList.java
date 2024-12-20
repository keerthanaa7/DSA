public class DoubleLinkedList {
    private DoubleLinkedListEmployeeNode head;
    private DoubleLinkedListEmployeeNode tail;
    int size;

    public void addNodeToFront(Employee employee) {
        DoubleLinkedListEmployeeNode newNode = new DoubleLinkedListEmployeeNode(employee);
        newNode.setNext(head);
        newNode.setPrev(null);
        if(head == null) {
            tail = newNode;
        } else{
            head.setPrev(newNode);
        }
        head = newNode;
        size++;
    }

    public int getsize(){
       System.out.println("size of the double linked list is " + size);
       return size;
    }

    public void printList() {
        DoubleLinkedListEmployeeNode current = head;
        while(current != null) {
            System.out.println("Double linked list nodes are " + current.getEmployee().toString());
            current =current.getNext();
        }
    }

    public DoubleLinkedListEmployeeNode removeNode() {
        DoubleLinkedListEmployeeNode removedNode = head;
        if (head == null)
            tail = null;
        else {
            head.getNext().setPrev(null);
        }
        head = removedNode.getNext();
        head.setPrev(removedNode);
        size--;
        removedNode.setPrev(null);
        return removedNode;
    }

    public void addToEnd(Employee employee) {
        DoubleLinkedListEmployeeNode node = new DoubleLinkedListEmployeeNode(employee);
        if(head == null){
            head = node;
        } else{
            tail.setNext(node);
        }
        node.setPrev(tail);
        node.setNext(null);
        tail = node;
        size++;
    }

    public DoubleLinkedListEmployeeNode removeFromEnd() {
        size--;
        DoubleLinkedListEmployeeNode removedNode = tail;
        if(tail.getPrev() == null) {
            head = null;
        } else{
            tail.getPrev().setNext(null);
        }
        removedNode.setPrev(null);
        removedNode.setNext(null);
        tail = tail.getPrev();
        return removedNode;
    }

    public void addANodeBefore(Employee newEmployee, Employee existingEmployee) {
        DoubleLinkedListEmployeeNode newEmployeenode = new DoubleLinkedListEmployeeNode(newEmployee);
        DoubleLinkedListEmployeeNode existingNode = new DoubleLinkedListEmployeeNode(existingEmployee);
        DoubleLinkedListEmployeeNode current;
        if (getsize() == 0) {
            return;
        } else {
            current = head;
            while (current != null) {
                if (current.getEmployee().equals(existingNode.getEmployee())) {
                    break;
                } else
                    current = current.getNext();
            }
            System.out.println("current node is " + current.getEmployee().toString());
            newEmployeenode.setNext(current);
            newEmployeenode.setPrev(current.getPrev());
            current.setPrev(newEmployeenode);
            if (head==current) {
                head = newEmployeenode;
                tail = current;
            } else {
                newEmployeenode.getPrev().setNext(newEmployeenode);
            }
        }
        size++;
    }
}


