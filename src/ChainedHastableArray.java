import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHastableArray {
    private LinkedList<StoredEmployee>[] chainedHastableArray;

    public ChainedHastableArray() {
        chainedHastableArray = new LinkedList[10];
        for (int i = 0; i < chainedHastableArray.length; i++) {
            chainedHastableArray[i] = new LinkedList<StoredEmployee>();
        }
    }

    public int getKey(String key) {
        return key.length() % chainedHastableArray.length;
    }

    public void put(String key, Employee employee) {
        int hashkey = getKey(key);
        chainedHastableArray[hashkey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashkey = getKey(key);
        ListIterator<StoredEmployee> listIterator = chainedHastableArray[hashkey].listIterator();
        while (listIterator.hasNext()) {
            StoredEmployee employee = listIterator.next();
            if (employee.getKey().equals(key)) {
                return employee.getEmployee();
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashkey = getKey(key);
        int index = 0;
        StoredEmployee employee = null;
        ListIterator<StoredEmployee> listIterator = chainedHastableArray[hashkey].listIterator();
        while (listIterator.hasNext()){
             employee = listIterator.next();
            if(employee.getKey().equals(key))
                break;
            else
                index++;
        }
        if(employee != null ){
            chainedHastableArray[hashkey].remove(index);
            return employee.getEmployee();
        } else {
            return null;
        }
    }

    public void print() {
        for (int i = 0; i < chainedHastableArray.length; i++) {
            ListIterator<StoredEmployee> listIterator = chainedHastableArray[i].listIterator();
            if (chainedHastableArray[i].isEmpty()) {
                System.out.println("Element is null at index " + i);
            } else {
                System.out.println("linked list elements are -> ");
                while (listIterator.hasNext()) {
                    StoredEmployee employee = listIterator.next();
                    System.out.println(employee.getEmployee().toString());
                }
            }
        }
    }

}
