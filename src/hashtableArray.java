public class hashtableArray {
    private Employee[] hashArray;
    int capacity = 10;

    public hashtableArray() {
        this.hashArray = new Employee[capacity];
    }

    public void put(String key, Employee employee){
        int keyValue = getHashkey(key);
        //This table does not handle collision
        if(hashArray[keyValue] != null){
            System.out.println("sorry, there is already a value ");
        }
        hashArray[keyValue] = employee;
    }

    public int getHashkey(String key) {
        return key.length()%capacity;
    }

    public Employee getValue(String key) {
        int keyValue = getHashkey(key);
        return hashArray[keyValue];
    }

    public void printHashTable() {
        for(int i = 0 ; i<hashArray.length;i++){
            System.out.println("elements are " + hashArray[i]);
        }
    }
}
