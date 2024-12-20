public class SingleLinkedListEmployeeNode {

    private Employee employee;
    private SingleLinkedListEmployeeNode next;

    public SingleLinkedListEmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setNext(SingleLinkedListEmployeeNode next) {
        this.next = next;
    }

    public SingleLinkedListEmployeeNode getNext() {
        return next;
    }
}
