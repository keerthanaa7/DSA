public class MinStack {
    int size;
    int top = 0;
    int min = -1;
    int[] minstack;
    int[] minValuesStack;
    int minStackSize;
    int minStackTop = 0;
    int capacity = 10;

    public MinStack(){
        minstack = new int[capacity];
        minValuesStack = new int[capacity];
    }

    public void push(int val) {
        if(isFull()){
            System.out.println("stack is full, cant push");
        } else {
            minstack[top] = val;
            top++;
            size++;
            if(getSize() == 1 || val < min){
                min = val;
                minValuesStack[minStackTop] = min;
                minStackTop++;
                minStackSize++;
            }
        }
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("stack is empty, cant pop");
            return 0;
        } else {
            top--;
            size--;
            int poppedVal = minstack[top];
            System.out.println("popped val is " + poppedVal);
            if(poppedVal == min){
                if(minStackSize != 0){
                    System.out.println("min stack top " + minStackTop);
                    minStackSize--;
                    minStackTop--;
                    if(minStackTop != 0){
                        minStackTop--;
                    }
                    min = minValuesStack[minStackTop];
                    System.out.println("minp " + min);
                }
            }
            return poppedVal;
        }
    }
    public int peek() {
        if(isEmpty()) {
            System.out.println("stack is empty, cant pop");
            return 0;
        } else {
            int poppedVal = minstack[top];
            return poppedVal;
        }
    }

     public int getMin() {
        System.out.println("get min " + min);
       return min;

     }
    public int getSize() {
        //System.out.println("size of the stack is " + size);
        return size;
    }
    public int getMinStackSize() {
        System.out.println("size of the min stack is " + minStackSize);
        return minStackSize;
    }
    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void printStack() {
        for(int i = top-1;i>=0;i--){
            System.out.println(minstack[i] + " ");
        }
    }
    public void printMinValStack() {
        if(minStackSize == 0){
            return;
        }
        for(int i = minStackTop-1;i>=0;i--){
            System.out.println(minValuesStack[i] + " ");
        }
    }
}

