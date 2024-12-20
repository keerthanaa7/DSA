public class SingleLinkedList {
    private SingleLinkedListEmployeeNode head;

    int size;

    public void addNodeToFront(Employee employee) {
        SingleLinkedListEmployeeNode newNode = new SingleLinkedListEmployeeNode(employee);
        newNode.setNext(head);
        head=newNode;
        size++;
    }

    public int getSize(){
        System.out.println("Size of the linked list is  " +size);
        return size;
    }

    public void printList() {
        SingleLinkedListEmployeeNode current = head;
        while(current != null) {
            System.out.println("Employee node " + current.getEmployee().toString());
            current = current.getNext();
        }
    }

    public void deleteNode() {
        SingleLinkedListEmployeeNode node = head;
        head.setNext(head.getNext());
        node.setNext(null);
        size--;
    }
}
