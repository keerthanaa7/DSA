public class Heap {
    int[] heap;
    int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + heap[i]);
        }
    }

    public int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    public int getchildIndex(int parentIndex, boolean left) {
        return 2 * parentIndex + (left ? 1 : 2);
    }

    public int peek() {
        if(isEmpty()){
            System.out.println("nothing ot print , heap is empty");
            return 0;
        } else{
            return heap[0];
        }
    }

    public int delete(int index) {
        if(isEmpty())
        {
            System.out.println("nothing to delete");
        }
        int valueDeleted = heap[index];
        int lastUsedIndex = size-1;
        int parentIndex = getParentIndex(index);

        // assign the right most leaf node to the deleted position which is the last element in the array
        heap[index] = heap[lastUsedIndex];

        if(heap[index] < heap[parentIndex])
            // if the newly replaced value is less than its root fix heap below
            fixHeapBelow(index, lastUsedIndex);
        else
            // if newly replaced value is greater than parent fix heap above
            fixHeapAbove(index);
        size--;
        return valueDeleted;
    }

    public void fixHeapBelow(int index, int lastUsedIndex) {
        int childToSwap;
        while (index <= lastUsedIndex) {
            int value = heap[index];
            int leftChildIndex = getchildIndex(index, true);
            int rightChildIndex = getchildIndex(index, false);
            if (leftChildIndex < lastUsedIndex) {
                // node has only left child and does not have a right child
                // swap with the left child
                if (rightChildIndex > lastUsedIndex) {
                    childToSwap = leftChildIndex;
                } else {
                    // node has both children so swap with the greatest of both children.
                    childToSwap = heap[leftChildIndex] > heap[rightChildIndex] ? leftChildIndex : rightChildIndex;
                }

                heap[index] = heap[childToSwap];
                heap[childToSwap] = value;
                index = childToSwap;
            } else {
                break;
            }
        }
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.print("Heap is full, cannot insert");
            return;
        }
        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    public void fixHeapAbove(int index) {
        int insertedValue = heap[index];
        // traverse uowards until you find a root whose value is greater than the new value.
        while (index > 0 && insertedValue > heap[getParentIndex(index)]) {
            // keep bringing the parent down if its value is lesser than the new value
            heap[index] = heap[getParentIndex(index)];
            index = getParentIndex(index);
        }
        // finally insert the new value at its right position which is the node whose
        // value is lesser than its parent
        if (insertedValue > heap[0]) {
            heap[index] = heap[0];
            heap[0] = insertedValue;
        } else {
            heap[index] = insertedValue;
        }
    }

    // max heap. Root is at the top. Swap it with the last element. Fix the heap. Swap the root with the second
    // last element.
    public void heapSort() {
        int lastIndex = size-1;
        System.out.println("size  " + size);
        System.out.println("length of array  " + heap.length);
        for(int i = 0;i<size;i++){
            int temp = heap[0];
            heap[0] = heap[lastIndex-i];
            heap[lastIndex-i] = temp;
            // exclude the element which was placed in its correct sorted position.
            fixHeapBelow(0, lastIndex-i-1);
        }
    }
}
