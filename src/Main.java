//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            // System.out.println("i = " + i);
        }
        Integer[] exampleArray = {3, -1, 10, 5, 2};
        int[] exampleArray1 = {20, 35, -15, 7, 55, 1, -22};
        int[] exampleArray2 = {10, 16, 8, 12, 15, 6, 3, 9, 5, 20, 18, 23};
        int[] exampleArray3 = {2, 5, 9, 8, 3, 8, 7, 10, 4, 3, 2, 4};
        Integer[] swapArray = {3, 8, 6, 7};
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
        String[] stringRadixArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        // bubbleSortArray(exampleArray);
        // swap(swapArray, 0, 3);
        // selectionSort(exampleArray);
        // insertionSort(exampleArray);
        //shellSort(exampleArray1);
        // factorial(6);
       /* mergeSort(exampleArray1, 0, 7);
        for(int i = 0; i < exampleArray1.length; i++) {
            System.out.println("Array elements after merge sort :" + exampleArray1[i]);
        }*/
        //int result = recursiveFactorial(6);
        //System.out.println("factorial recursive" + result);
    /*    quickSort(exampleArray1, 0, 7);
        for(int i = 0; i < exampleArray1.length; i++) {
            System.out.println("Array elements after quick sort :" + exampleArray1[i]);
        }
        quickSort(exampleArray2, 0, 12);
        for(int i = 0; i < exampleArray2.length; i++) {
            System.out.println("Array elements after quick sort :" + exampleArray2[i]);
        }*/
       /* countingSort(exampleArray3,2, 10 );
        for(int i = 0; i < exampleArray3.length; i++) {
            System.out.println("Array elements after counting sort :" + exampleArray3[i]);
        }*/
       /*   mergeSortDescending(exampleArray1, 0, 7);
        for(int i = 0; i < exampleArray1.length; i++) {
            System.out.println("Array elements after merge sort descending:" + exampleArray1[i]);
        }*/
        //radixSort(radixArray, 10, 4);
        // radixAlphabetSort(stringRadixArray, 26, 5);
        Employee janeJones = new Employee("Jane", "Jones", 1);
        Employee johnDoe = new Employee("John", "Doe", 2);
        Employee mariaWilson = new Employee("maria", "wilson", 3);
        Employee mikeSmith = new Employee("mike", "smith", 4);
        Employee jacobAbrahams = new Employee("Jacob", "Abrahams", 5);

        SingleLinkedList linkedList = new SingleLinkedList();
       /* linkedList.getSize();
        linkedList.addNodeToFront(janeJones);
        linkedList.addNodeToFront(johnDoe);
        linkedList.getSize();
        linkedList.printList();
        linkedList.deleteNode();
        linkedList.getSize();
        linkedList.deleteNode();
        linkedList.getSize();*/

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
       /* doubleLinkedList.addNodeToFront(janeJones);
        doubleLinkedList.getsize();
        doubleLinkedList.addNodeToFront(janeJones);
        doubleLinkedList.addNodeToFront(johnDoe);
        doubleLinkedList.addNodeToFront(mariaWilson);
        doubleLinkedList.addNodeToFront(mikeSmith);
        doubleLinkedList.printList();
        doubleLinkedList.getsize();
        DoubleLinkedListEmployeeNode node = doubleLinkedList.removeNode();
        System.out.println("deleted node is " + node.getEmployee().toString());
        DoubleLinkedListEmployeeNode node1 = doubleLinkedList.removeNode();
        System.out.println("deleted node is " + node1.getEmployee().toString());
        DoubleLinkedListEmployeeNode node2 = doubleLinkedList.removeNode();
        System.out.println("deleted node is " + node2.getEmployee().toString());
        doubleLinkedList.getsize();
        doubleLinkedList.printList();*/
      /*  doubleLinkedList.addToEnd(johnDoe);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addToEnd(mariaWilson);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addToEnd(janeJones);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.removeNode();
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addNodeToFront(johnDoe);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.removeNode();
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addToEnd(janeJones);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.removeNode();
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.removeFromEnd();
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addNodeToFront(mariaWilson);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.removeNode();
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
*/
       /* doubleLinkedList.addANodeBefore(jacobAbrahams, janeJones);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addNodeToFront(jacobAbrahams);
        doubleLinkedList.addANodeBefore(janeJones, jacobAbrahams);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addANodeBefore(mikeSmith, janeJones);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addANodeBefore(mariaWilson, mikeSmith);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addANodeBefore(johnDoe, mariaWilson);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addANodeBefore(mikeSmith, mariaWilson);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();

        doubleLinkedList.addANodeBefore(mariaWilson, janeJones);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addANodeBefore(mariaWilson, johnDoe);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.removeNode();
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addANodeBefore(mariaWilson, mariaWilson);
        doubleLinkedList.getsize();
        doubleLinkedList.printList();
        doubleLinkedList.addANodeBefore(johnDoe, jacobAbrahams);
        doubleLinkedList.printList();
        doubleLinkedList.getsize();*/
        /*linkedList.insertSorted(5);
        linkedList.getIntListSize();
        linkedList.printIntList();
        linkedList.insertSorted(1);
        linkedList.getIntListSize();
        linkedList.printIntList();
        linkedList.insertSorted(3);
        linkedList.getIntListSize();
        linkedList.printIntList();
        linkedList.insertSorted(10);
        linkedList.getIntListSize();
        linkedList.printIntList();*/
        /*ArrayStack stack = new ArrayStack(5);
        System.out.println("is stack empty " + stack.isStackEmpty());
        stack.push(jacobAbrahams);
        System.out.println("is stack empty " + stack.isStackEmpty());
        stack.printStack();
        stack.peek();
        stack.pop();
        System.out.println("is stack empty " + stack.isStackEmpty());
        stack.push(mariaWilson);
        stack.push(johnDoe);
        stack.push(janeJones);
        stack.printStack();*/

        Arrayqueue arrayqueue = new Arrayqueue(6);
        arrayqueue.getSize();
        arrayqueue.enqueue(jacobAbrahams);
        arrayqueue.isEmpty();
        arrayqueue.isFull();
        arrayqueue.printQueue();
        arrayqueue.getSize();

    }

    private static void bubbleSortArray(Integer[] bubbleSortArray) {
        int i, j, m;
        int n = bubbleSortArray.length;
        for(i = 0;i<n-1;i++){
            for(j=i+1; j<n;j++){
                m = bubbleSortArray[i];
                if(bubbleSortArray[i] > bubbleSortArray[j]){
                    bubbleSortArray[i] = bubbleSortArray[j];
                    bubbleSortArray[j] = m;
                }
            }
        }

        for(i=0;i<n;i++){
            System.out.println("bubble sort array elements are : "+bubbleSortArray[i]);
        }
    }

    private static void swap(Integer[] swaparray, int position1, int position2){
        if(swaparray.length== 0)
            return;
        int arrayLen = swaparray.length;
        for(int i = 0;i<arrayLen;i++){
            System.out.println("Array elements before swap :" + swaparray[i]);
        }
        int temp;
        temp = swaparray[position1];
        swaparray[position1] = swaparray[position2];
        swaparray[position2]= temp;
        for(int i = 0;i<arrayLen;i++){
            System.out.println("Array elements after swap :" + swaparray[i]);
        }
    }

    private static void selectionSort(Integer[] selectionSortArray) {
        if (selectionSortArray.length == 0)
            return;
        int smallestPos, temp;
        int length = selectionSortArray.length;
        for (int i = 0;i<length-1;i++) {
            smallestPos = i;
            for (int j = smallestPos+1;j<length;j++){
                if(selectionSortArray[smallestPos] < selectionSortArray[j]){
                }else{
                    smallestPos=j;
                }
            }
            temp = selectionSortArray[i];
            selectionSortArray[i] = selectionSortArray[smallestPos];
            selectionSortArray[smallestPos] = temp;
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Array elements after selection sort :" + selectionSortArray[i]);
        }
    }

    private static void insertionSort(Integer[] insertionSortArray){
        int i, j, length, smallestPos;
        Integer temp;
        if(insertionSortArray.length==0)
            return;
        length = insertionSortArray.length;
        for(i = 0;i<length;i++){
            smallestPos = i;
            for (j=smallestPos-1;j>=0;j--){
                if(insertionSortArray[smallestPos] < insertionSortArray[j]){
                    temp = insertionSortArray[smallestPos];
                    insertionSortArray[smallestPos] = insertionSortArray[j];
                    insertionSortArray[j] =temp;
                    smallestPos= j;
                }
                else {
                    break;
                }
            }
        }
        for (i = 0; i < length; i++) {
            System.out.println("Array elements after insertion sort :" + insertionSortArray[i]);
        }
    }

    private static void shellSort(Integer[] array) {
        if (array.length == 0)
            return;
        int length = array.length;
        int gap, smallestPos, j;
        Integer temp;
        for(gap=length/2;gap>0;gap=gap/2) {
            System.out.println("gap = " + gap);
            for (int i = gap; i < length; i++) {
                smallestPos = i;
                for (j = smallestPos - gap; j >= 0; j--) {
                    if (array[smallestPos] < array[j]) {
                        temp = array[smallestPos];
                        array[smallestPos] = array[j];
                        array[j] = temp;
                        smallestPos = j;
                    }
                    else{
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Array elements after shell sort :" + array[i]);
        }
    }private static void mergeSort(int[] array, int start, int end) {
        if(end-start==1)
            return;
        int mid = (start + end)/2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, end, mid);
    }

    private static void merge(int[] mergeSortArray, int start, int end, int mid) {
        int i = start, j = mid, tempindex = 0;

        //last element of left array is less than first element of right array. No need to sort. Array is already sorted
        if (mergeSortArray[mid - 1] < mergeSortArray[mid])
            return;

        // Temp array contains sorted elements after comparing left and right array. Some elements in left and right array
        // could remain after the end of comparision
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            if (mergeSortArray[i] < mergeSortArray[j]) {
                temp[tempindex] = mergeSortArray[i];
                i=i+1;
            } else {
                temp[tempindex] = mergeSortArray[j];
                j=j+1;
            }
            tempindex = tempindex+1;
        }

        //copy remaining elements in the left array back to the original array . Elements in right array need not be copied
        // as they are already in the correct position since right array elements are bigger than left array
        System.arraycopy(mergeSortArray,i, mergeSortArray, start+tempindex, mid-i);

        //copy temp array elements to the original array.
        System.arraycopy(temp, 0, mergeSortArray, start, tempindex);
    }

    private static int factorial(int num){
        int resultFacttorial = 1;
        for(int multiplier = 1;multiplier<=num;multiplier++){
            resultFacttorial = resultFacttorial * multiplier;

        }
        System.out.println("factorial = " + resultFacttorial);
        return resultFacttorial;
    }

    private static int recursiveFactorial(int num) {
       if(num ==0)
           return 1;
       return num * recursiveFactorial(num-1);
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end-start <2)
            return;
        int pivot = findpivot(array, start, end);
        quickSort(array, start, pivot);
        quickSort(array, pivot+1, end);
    }

    private static int findpivot(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start, j = end;
        // when i becomes less than j stop
        while (i < j) {
            // push smaller elements to the beginning of the array. so save pivot and replace the elements from start with
            // smaller valued elements
            while ((i < j) && (array[--j] > pivot)) ;
            array[i] = array[j];
            //push large elements to the end of the array
            while ((i < j) && (array[++i] < pivot)) ;
            array[j] = array[i];
        }
        array[i] = pivot;
        return i;
    }

    private static void countingSort(int[] array, int min, int max) {
        int tempSize = max - min + 1;
        int[] countingArray = new int[tempSize];
        for (int i = 0; i < array.length; i++) {
            countingArray[array[i] - min] = countingArray[array[i] - min] + 1;
        }
        for (int m = 0; m < tempSize; m++) {
            System.out.println("temp elements =" + countingArray[m]);
        }

        for (int i = 0, j = 0; i < array.length && j < tempSize; j++) {
            while (countingArray[j] > 0) {
                array[i] = min + j;
                countingArray[j] = countingArray[j] - 1;
                i++;
            }
        }
    }

    private static void mergeSortDescending(int[] array, int start, int end) {
        if (end - start <2)
            return;
        int mid = (start + end) / 2;
        mergeSortDescending(array, start, mid);
        mergeSortDescending(array, mid, end);
        mergeDescending(array, start, mid, end);
    }

    private static void mergeDescending(int[] array, int start, int mid, int end) {
        if (array[mid - 1] > array[mid])
            return;
        int tempsize = end-start;

        int[] temp = new int[tempsize];
        int tempindex = 0;
        int i = start;
        int j = mid;
        while (i < mid && j < end) {
            if (array[i] > array[j]) {
                temp[tempindex] = array[i];
                i++;
                tempindex++;
            } else {
                temp[tempindex] = array[j];
                j++;
                tempindex++;
            }
        }
        System.arraycopy(array,i,array, start+tempindex, mid-i);
        System.arraycopy(temp, 0, array, start, tempindex);
    }

    private static void radixAlphabetSort(String[] radixArray, int radix, int width) {
        int length = radixArray.length;
        // sort by each position ( ones, tens etc)
        for (int i = width - 1; i >= 0; i--) {
            System.out.println("each iteration");
            radixAlphabetSingleSort(radixArray, i, radix);
        }
        for (int n = 0; n < length; n++) {
            System.out.println("Array elements after radix sort is done  " + radixArray[n]);
        }
    }

    private static void radixAlphabetSingleSort(String[] radixArray, int position, int radix) {
        int numItems = radixArray.length;
        String[] temp = new String[numItems];
        int pos;
        int[] countingArray = new int[radix];
        for (String value : radixArray) {
            pos = getcharacter(value, position, radix) - 'a';
            countingArray[pos]++;
        }
        for (int i = 1; i < radix; i++) {
            countingArray[i] = countingArray[i] + countingArray[i - 1];
        }

        for (int n = numItems - 1; n >= 0; n--) {
            pos = getcharacter(radixArray[n], position, radix) - 'a';
            temp[--countingArray[pos]] = radixArray[n];
        }
        for (int k = 0; k < numItems; k++) {
            radixArray[k] = temp[k];
        }
    }

    private static char getcharacter(String value, int position, int radix) {
        return value.charAt(position);
    }


    private static void radixSort(int[] radixArray, int radix, int width) {
        int length = radixArray.length;
        // sort by each position ( ones, tens etc)
        for(int i =0;i< width;i++){
            radixSingleSort(radixArray, i, radix);
        }
        for(int n = 0 ; n<length;n++){
            System.out.println("Array elements after radix sort is done  " + radixArray[n]);
        }
    }
    private static void radixSingleSort(int[] radixArray, int position, int radix) {
        int numItems = radixArray.length;
        int[] temp = new int[numItems];
        int[] countingArray = new int[radix];
        // do the normal counting array
        for(int value : radixArray){
            countingArray[getDigit(position, value, radix)]++;
        }
        // fill up the counting array for a particular position by adding the previous position count. Eg
        // counting array for value 2 contains counting array value of 1. Each value contains the sum of its previous position's count
        for(int i = 1;i <radix;i++) {
            countingArray[i] = countingArray [i]+countingArray[i-1];
        }

        // find the correct position of an array value in the temp array by filling in stable order. duplicate values will be
        // filled from right to left
        for(int n = numItems-1;n >=0;n--){
            temp[--countingArray[getDigit(position,radixArray[n], radix)]] = radixArray[n];
        }
        // copy temp elements back to original array
        for(int m = 0; m <numItems;m++){
            radixArray[m] = temp[m];
        }
    }

    private static int getDigit(int position, int value, int radix) {
       return value/(int)Math.pow(radix,position) %radix;
    }


}
