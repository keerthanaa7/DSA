import java.util.*;

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
        //  DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
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
       /* ArrayQueue arrayqueue = new ArrayQueue(6);
        arrayqueue.addItemToQueue(jacobAbrahams);
        arrayqueue.addItemToQueue(johnDoe);
        arrayqueue.getQueueSize();
        arrayqueue.printQueueItems();
        System.out.println("peek employee is " + arrayqueue.peekEmployeeFromQueue());
        arrayqueue.getQueueSize();
        arrayqueue.printQueueItems();
        System.out.println("pop employee is " + arrayqueue.removeItemFromQueue());
        arrayqueue.getQueueSize();
        arrayqueue.printQueueItems();
        arrayqueue.addItemToQueue(mariaWilson);
        arrayqueue.addItemToQueue(mikeSmith);
        arrayqueue.getQueueSize();
        arrayqueue.printQueueItems();
        System.out.println("peek employee is " + arrayqueue.peekEmployeeFromQueue());
        arrayqueue.getQueueSize();
        arrayqueue.printQueueItems();
        System.out.println("pop employee is " + arrayqueue.removeItemFromQueue());
        arrayqueue.getQueueSize();
        arrayqueue.printQueueItems();*/

        circularArrayQueue arrayQueue = new circularArrayQueue(5);
       /* arrayQueue.addItemsToCircularQueue(mariaWilson);
        arrayQueue.addItemsToCircularQueue(mikeSmith);
        arrayQueue.addItemsToCircularQueue(jacobAbrahams);
        arrayQueue.addItemsToCircularQueue(johnDoe);
        System.out.println("is circular queue empty " + arrayQueue.isCircularQueueEmpty());
        System.out.println("is circular queue full " + arrayQueue.isCircularQueuefull());
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.addItemsToCircularQueue(mariaWilson);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.removeItemFromCircularQueue();
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.removeItemFromCircularQueue();
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.addItemsToCircularQueue(mikeSmith);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();*/
        //  arrayQueue.addItemsToCircularQueue(mariaWilson);
       /* arrayQueue.addItemsToCircularQueue(mariaWilson);
        arrayQueue.addItemsToCircularQueue(mikeSmith);
        arrayQueue.removeItemFromCircularQueue();
        arrayQueue.addItemsToCircularQueue(mariaWilson);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.removeItemFromCircularQueue();
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.addItemsToCircularQueue(jacobAbrahams);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.removeItemFromCircularQueue();
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.addItemsToCircularQueue(mikeSmith);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.addItemsToCircularQueue(jacobAbrahams);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.addItemsToCircularQueue(jacobAbrahams);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();

        arrayQueue.addItemsToCircularQueue(mariaWilson);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();*/

      /*  LinkedListStack stack = new LinkedListStack();
        stack.push(johnDoe);
        stack.push(jacobAbrahams);
        stack.push(mariaWilson);
        stack.push(mikeSmith);
        stack.printQueue();
        System.out.println("peek employee is " + stack.peek());
        System.out.println("pop employee is " + stack.pop());
        stack.printQueue();*/
        LinkedListCharStack charStack = new LinkedListCharStack();
        //System.out.println("is palindrome " + charStack.checkPalindrome("rac,ecari"));
        // System.out.println("is the input a palindrome " + charStack.checkPalindromUsingStackandQueue("race,cari"));
       /* arrayQueue.addItemsToCircularQueue(mikeSmith);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.addItemsToCircularQueue(jacobAbrahams);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();
        arrayQueue.addItemsToCircularQueue(jacobAbrahams);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();

        arrayQueue.addItemsToCircularQueue(mariaWilson);
        System.out.println("size of the circular queue " + arrayQueue.getSize());
        arrayQueue.printCircularQueue();*/
      /*  hashtableArray hashtableArray = new hashtableArray();
        hashtableArray.put("Smith", mikeSmith);
        hashtableArray.put("Abrahams", jacobAbrahams);
        hashtableArray.put("Doe" , johnDoe);
        System.out.println("Employee value is " + hashtableArray.getValue("Abrahams"));
        hashtableArray.printHashTable();
        int[] bucketArray = {54, 46, 83, 66, 95, 92, 43};
        bucketSort(bucketArray);

        int[] searchArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("value searched " + linearSearch(36, searchArray));

        int[] binarySearchArray = {-22, -15, 1, 7, 20, 35, 55};
        System.out.println("value searched " + binarySearch(-15, binarySearchArray));

        System.out.println("value searched " + binaryRecursiveSearch(0, binarySearchArray.length, 11, binarySearchArray));*/
      /*  Tree binarySearchTree = new Tree();
        binarySearchTree.insert(25);
        binarySearchTree.insert(20);
        binarySearchTree.insert(15);
        binarySearchTree.insert(27);
        binarySearchTree.insert(30);
        binarySearchTree.insert(29);
        binarySearchTree.insert(26);
        binarySearchTree.insert(22);
        binarySearchTree.insert(32);
        binarySearchTree.insert(17);
        binarySearchTree.inOrderTraversal();
        binarySearchTree.delete(17);
        System.out.println();
        binarySearchTree.inOrderTraversal();
        binarySearchTree.inOrderTraversal();
        System.out.println("get a node value " + binarySearchTree.getNodeValue(33));
        System.out.println("the min value node is " + binarySearchTree.getMin());
        System.out.println("the max value node is " + binarySearchTree.getMax());
*/
        /*Heap heap = new Heap(10);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);
        heap.printHeap();
        System.out.println();
        heap.insert(95);
        heap.printHeap();
        heap.delete(1);
        heap.printHeap();
        heap.heapSort();
        heap.printHeap();*/

        leetCodePractice practice = new leetCodePractice();
        int[] exampleProductArray1 = {2, 3, -2, 4};
        int[] exampleProductArray2 = {-2, 0, -1};
        int[] exampleProductArray3 = {-2, 6, -3, -10, 0, 2};


        System.out.println("max product of a subarray is " + practice.findMaxProduct(exampleProductArray3));
       /* int[] exampleArray1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] exampleArray2 = {1};
        int[] exampleArray3 = {5, 4 , -1, 7, 8};
        System.out.println("largest sum of a sub array is " + leetCodePractice.findSubArrayMax2(exampleArray1));
        System.out.println("largest sum of a sub array is " + leetCodePractice.findSubArrayMax(exampleArray2));*/

      /*  int[] exampleArray1 = {7, 1, 5, 3, 6, 4};
        int[] exampleArray2 = {7, 6, 4, 3, 1};
        System.out.println("max profit is " + leetCodePractice.findMaxProfit1(exampleArray1));*/

       /* int[] exampleArrayProduct1 = {2, 3, -2, 4};
        int[] exampleArrayProduct2 = {-2, 0, -1};
        int[] exampleArrayProduct3 = {-2, 6, -3, -10, 0, 2};
        System.out.println("max product of the sub array is " + leetCodePractice.findMaxProduct(exampleArrayProduct3));*/

       /* int[] exampleProductSelfArray = {5, 2, 3, 4};
        leetCodePractice.findSubArrayProductExceptforSelf1(exampleProductSelfArray);*/

      /*  int[] exampleProductRotateArray = {1, 2, 3, 4, 5, 6, 7};
        leetCodePractice.rotateArray1(exampleProductRotateArray, 3);*/

       /* int[] exampleReverseArray = {1, 2, 3, 4, 5, 6, 7};
        int[] reversedArray = leetCodePractice.reverseArray(exampleReverseArray, 0, exampleReverseArray.length);
        System.out.println("reversed array elements are ");
        for(int i =0;i<reversedArray.length;i++){
           System.out.print(reversedArray[i]+ " ");
        }*/

       /* int[] binaryArray = {1, 1, 0, 1,1, 1};
        int[] binaryArray1 = {1, 0, 1, 1, 0, 1};
        System.out.println("max consecutive ones are " + leetCodePractice.findMaxConsecutiveOnes(binaryArray1));*/

        /*List<String> inputStringList1 = new ArrayList<>(5);
        inputStringList1.add("Hello");
        inputStringList1.add("World");

        List<String> inputStringList2 = List.of("");
        List<String> inputStringList3 = List.of("Hel/lo", "w;orld");
        List<String> inputStringList4 = List.of("Hel/;lo", "w;orld");
        System.out.println("encoded string is " + leetCodePractice.encodeString(inputStringList1));
        List<String> decodedStringList = leetCodePractice.decodeStrings(leetCodePractice.encodeString(inputStringList4));

        for (String decodedString : decodedStringList) {
            System.out.println("strings in the list are " + decodedString);
        }*/

       /* int[] moveZeroesInputArray = {0, 11, 0, 3, 12};
        leetCodePractice.moveZeroestoEnd2(moveZeroesInputArray);*/

      /*  IntegerLinkedList linkedList2 = new IntegerLinkedList();
        IntegerLinkedList linkedList1 = new IntegerLinkedList();
        IntegerLinkedList linkedlist = new IntegerLinkedList();
        linkedlist.addNodeToFront(1);
        linkedlist.addNodeToFront(2);
        linkedlist.addNodeToFront(3);
        linkedlist.addNodeToFront(4);
        linkedlist.addNodeToFront(5);
        linkedlist.addNodeToFront(6);

        linkedlist.printLinkedList(linkedlist.getHead());
        IntegerNode reverseHead = linkedlist.reverseListRecursive(linkedlist.getHead());
        linkedlist.printLinkedList(reverseHead);*/
      /*  IntegerNode headReverse = linkedlist.reverseListIterative(head1);
        linkedlist.printLinkedList(headReverse);*/
     /*   linkedList1.addNodeToFront(4);
        linkedList1.addNodeToFront(2);
        linkedList1.addNodeToFront(1);

        linkedList2.addNodeToFront(4);
        linkedList2.addNodeToFront(3);
        linkedList2.addNodeToFront(1);

        IntegerNode mergedListHead = linkedlist.mergeTwoSortedLists(linkedList1.getHead(), linkedList2.getHead());
        linkedlist.printLinkedList(mergedListHead);*/
       /* IntegerLinkedList integerLinkedList1 = new IntegerLinkedList();
        integerLinkedList1.addNodeToFront(1);
        integerLinkedList1.addNodeToFront(2);
        integerLinkedList1.addNodeToFront(3);
        integerLinkedList1.addNodeToFront(4);
        integerLinkedList1.addNodeToFront(5);
        integerLinkedList1.printLinkedList(integerLinkedList1.getHead());
        IntegerNode head1 = integerLinkedList1.getHead();

        IntegerLinkedList integerLinkedList2 = new IntegerLinkedList();
        integerLinkedList2.addNodeToFront(1);
        integerLinkedList2.addNodeToFront(2);
        integerLinkedList2.addNodeToFront(3);
        integerLinkedList2.addNodeToFront(14);
        integerLinkedList2.addNodeToFront(15);
        integerLinkedList2.addNodeToFront(16);
        integerLinkedList2.printLinkedList(integerLinkedList2.getHead());
        IntegerNode head2 = integerLinkedList2.getHead();*/

      //  integerLinkedList1.findIntersectionNode1(head1, head2);
      /* IntegerLinkedList list1 = new IntegerLinkedList();
        list1.addNodeToFront(3);
        list1.addNodeToFront(4);
        list1.addNodeToFront(2);
        list1.printLinkedList(list1.getHead());

        IntegerLinkedList list2 = new IntegerLinkedList();
        list2.addNodeToFront(9);
        list2.addNodeToFront(6);
        list2.addNodeToFront(5);
        list2.printLinkedList(list2.getHead());

        IntegerLinkedList listSum = new IntegerLinkedList();
        listSum.addTwoLists(list1.getHead(), list2.getHead());*/

       /*  IntegerLinkedList list1 = new IntegerLinkedList();
        list1.addNodeToFront(9);
        list1.addNodeToFront(5);
        list1.addNodeToFront(8);
        list1.printLinkedList(list1.getHead());

        IntegerLinkedList list2 = new IntegerLinkedList();
        list2.addNodeToFront(6);
        list2.addNodeToFront(2);
        list2.printLinkedList(list2.getHead());

        IntegerLinkedList listSum = new IntegerLinkedList();
        listSum.addTwoLists(list1.getHead(), list2.getHead());*/

        LeetCodePracticeHashTable leetCodePracticeHashTable = new LeetCodePracticeHashTable();
       /* int numsArray[] = {2, 7, 1, 5};
        int[] indicesArray = leetCodePracticeHashTable.twoSumUsingHashTable(numsArray, 6);
        for(int i = 0;i<indicesArray.length;i++){
            System.out.println("indices "+ indicesArray[i]);
        }*/

       /* Integer[] array = {1,2,3,4, 6, 7, 8};
        System.out.println("contains duplicates " +leetCodePracticeHashTable.containsDuplicates(array));*/

       /* String s1 = "act";
        String s2 = "cat";
        System.out.println("is anagram "+ leetCodePracticeHashTable.isAnagram1(s1, s2));

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
       //leetCodePracticeHashTable.groupAnagrams(input);

        Integer[] inputThreesum = {-1,0,1,2,-1,-4,3};
        leetCodePracticeHashTable.threeSum(inputThreesum, 0);

        int[] longestSequenceInput = {100, 4, 200, 1, 3, 2};
        int[] longestSequenceInput1 = {0,3,7,2,5,8,4,6,0,1};
        int[] longestSequenceInput2 = {2,3,4,6,9,10,11,12,13,14,17};
        // hastableLeetcode.findLongestConsecutiveSeq(longestSequenceInput);
        System.out.println("count of longest sequence " +  leetCodePracticeHashTable.findLongestConsecutiveSeq1(longestSequenceInput2));*/

        int[] inputArray = {1, 2, 0};
        int[] inputArray1 = {3, 4, -1, 1};
        int[] inputArray2 = {7,8,9,11,12};
        int[] inputArray3 = {2,1,4,8,5};
      //  leetCodePracticeHashTable.firstMissingPositive(inputArray1);

        MinStack minStack = new MinStack();
      /*  minStack.push(1);
        minStack.push(5);
        minStack.push(7);
        minStack.push(3);
        minStack.getSize();
        minStack.printStack();
        minStack.pop();
        minStack.getSize();
        minStack.printStack();*/
       /* minStack.push(5);
        minStack.push(7);
        minStack.push(2);
        minStack.push(10);
        minStack.push(1);
        minStack.push(9);
        minStack.printStack();
        minStack.getMinStackSize();
        minStack.printMinValStack();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();*/
        int[] input1 = {1,3,2,4};
        int[] input2 ={6,8,0,1,3};
        int[] input3 = {50,40,30,10};
        int[] input4 = {5,4,7,6,1,3};
        leetCodePractice leetCodePractice = new leetCodePractice();
        leetCodePractice.findNextGreaterElement2(input4);
        String[] input = {"2", "1", "+", "3", "*"};
        String[] inputReversePolish = {"4", "13", "5", "/", "+"};
        //leetCodePractice.reversePolishNotation(input);int[] array = {2,1,5,8,9,4,6};
        int[] array = {2,1,5,8,9,4,6};
        // leetCodePractice.sumOfSubArray1(array, 3);
         /*   int[] array = {2,1,5,8,9,4,6};
        leetCodePractice.sumOfSubArray1(array, 3);
        String input1 = "abcabcbb";
        String input2 = "bbbb";
        String input3 = "pwwkew";
        leetCodePractice.longestSubstringWithoutRepetition(input3);*/
      /*  int[] inputHeight1 = {2,3,5,1};
        int[] inputHeight2 = {1,8,6,2,5,4,8,3,7};
        leetCodePractice.findLargestArea(inputHeight2);*/
       /* String input1 = "noon";
        String input2 = "A man, a plan,  canal: Panama";
        String input3 = "race a car";
        System.out.println(leetCodePractice.isPalindrome(input2));*/

       /* int[] input1 = {2,7,11,15};
        int[] input2 ={2,3,4};
        leetCodePractice.twoSumTwo(input1, 18);*/
       /* int[][] matrix2 = {{2,3,1,5}, {4,0,3,2},{8,9,0,9},{6,4,1,8}};

        leetCodePractice.setZeroes2(matrix2,4, 4);*/
       /* int[][] rotateMatrix1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        leetCodePractice.transposeMatrix(rotateMatrix1);*/
       /* String input1 = "ABAB";
        String input2 = "AABABBA";
        String input3 = "ABBCCBB";
        leetCodePractice.longestRepeatCharReplacement(input3, 2);*/
        double x1 = 2.00000;
        int n1 = 5;
        double x2 = 2.10000;
        int n2 = 3;
        double x3 = 2.00000;
        int n3 = -2;
        //  leetCodePractice.calculatePow(x3, n3);
        System.out.println("power " + leetCodePractice.calculatePow1(x3, n3));
        int[][] matrix3 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix4 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        //  leetCodePractice.transposeMatrix(matrix4);
        // leetCodePractice.rotateByColumns(matrix4, 4, 4);
        leetCodePractice.rotateMatrixBy90(matrix4,4,4);

    }

    public static int binaryRecursiveSearch(int start, int end , int value, int[] searchArray) {
        if(end<=start){
            return -1;
        }
        int mid = (start+end)/2;
        if(searchArray[mid] == value) {
            return value;
        } else if(value > searchArray[mid]) {
            return binaryRecursiveSearch(mid+1, end, value, searchArray);
        } else {
            return binaryRecursiveSearch(start, mid, value, searchArray);
        }
    }

    public static int binarySearch(int value, int[] searchArray) {
        int start = 0;
        int end = searchArray.length;
        int mid;
        while(start < end) {
            mid = (start + end )/2;
            System.out.println("mid " + mid);
            if(value == searchArray[mid]){
                return value;
            } else if(value > searchArray[mid]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return -1;
    }

    public static int linearSearch(int value, int[] searchArray) {
        for (int i = 0; i < searchArray.length; i++) {
            if (searchArray[i] == value)
                return value;
        }
        return -1;
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


    public static void bucketSort(int[] inputArray) {
        // we are creating 10 buckets for integer (0-9)
        List<Integer>[] bucketlist  = new List[10];
        for(int i = 0;i<bucketlist.length;i++){
            bucketlist[i] = new ArrayList<>();
        }
        // add the input values to right bucket
        for(int i = 0;i<inputArray.length;i++) {
            bucketlist[findHashValue(inputArray[i])].add(inputArray[i]);
        }
        //sort each bucket
        for(int i = 0;i<bucketlist.length;i++){
            Collections.sort(bucketlist[i]);
        }
        //copy elements in ascending order
        for(int i = 0, j= 0;i<bucketlist.length;i++){
            for(int value:bucketlist[i]){
                inputArray[j++] = value;
            }
        }
        //finally the sorted array
        for(int i = 0;i<inputArray.length;i++){
            System.out.println("array element is " + inputArray[i]);
        }
    }

    public static int findHashValue(int value) {
        return value/10;
    }

    private void sortArray() {
        // sort 2D array in ascending order based on the first element of each row. If the first elements are the same, sort it in descending order by the second element of those two rows that are compared.
        int[][] input = {{1, 2},
                {10, 9},
                {11, 5},
                {1, 7}
        };

        for (int i = 0; i < input.length; i++) {
            int[] interval = input[i];
            System.out.println("interval " + interval[0] + " " + interval[1] + " ");
        }
        Arrays.sort(input, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            } else {

                return a[0] - b[0];
            }
        });
        for (int i = 0; i < input.length; i++) {
            int[] interval = input[i];
            System.out.println("interval " + interval[0] + " " + interval[1] + " ");
        }
    }

    private void  sort2dArray() {
        // sort 2D array in descending order based on the second element of each row.

        int[][] input = {{1,2},
                {10,9},
                {11,5}
        };

        for(int i = 0;i<input.length;i++){
            int[] interval = input[i];
            System.out.println("interval " + interval[0] + " " + interval[1] + " ");
        }
        Arrays.sort(input, (a,b) -> {
            System.out.println("a[0]" + a[0]);
            System.out.println("a[1]" + a[1]);
            System.out.println("b[0]" + b[0]);
            System.out.println("b[1]" + b[1]);
            return b[1]-a[1];
        });
        for(int i = 0;i<input.length;i++){
            int[] interval = input[i];
            System.out.println("interval " + interval[0] + " " + interval[1] + " ");
        }
    }

    private void sort2darray1(){
        // sort 2D array in descending order based on the first element of each row.
        int[][] input = {{1,2},
                {10,9},
                {11,5}
        };

        for(int i = 0;i<input.length;i++){
            int[] interval = input[i];
            System.out.println("interval " + interval[0] + " " + interval[1] + " ");
        }
        Arrays.sort(input, (a,b) -> {
            System.out.println("a[0]" + a[0]);
            System.out.println("a[1]" + a[1]);
            System.out.println("b[0]" + b[0]);
            System.out.println("b[1]" + b[1]);
            return b[0]-a[0];
        });
    }

    private void sort2darray2() {
        // sort 2D array in ascending order based on the second element of each row.
        int[][] input = {{1,2},
                {10,9},
                {11,5}
        };

        for(int i = 0;i<input.length;i++){
            int[] interval = input[i];
            System.out.println("interval " + interval[0] + " " + interval[1] + " ");
        }
        Arrays.sort(input, (a,b) -> {
            System.out.println("a[0]" + a[0]);
            System.out.println("a[1]" + a[1]);
            System.out.println("b[0]" + b[0]);
            System.out.println("b[1]" + b[1]);
            return a[1]-b[1];
        });
        for(int i = 0;i<input.length;i++){
            int[] interval = input[i];
            System.out.println("interval " + interval[0] + " " + interval[1] + " ");
        }
    }

    private void sort2darray3() {
// sort 2D array in ascending order based on the first element of each row.
int[][] input = {{1,2},
        {10,9},
        {4,5}
    };

        for(int i = 0;i<input.length;i++){
        int[] interval = input[i];
        System.out.println("interval " + interval[0] + " " + interval[1] + " ");
    }
        Arrays.sort(input, (a,b) -> {
        System.out.println("a[0]" + a[0]);
        System.out.println("a[1]" + a[1]);
        System.out.println("b[0]" + b[0]);
        System.out.println("b[1]" + b[1]);
        return a[0]-b[0];
    });
         for(int i = 0;i<input.length;i++){
        int[] interval = input[i];
        System.out.println("interval " + interval[0] + " " + interval[1] + " ");
    }
    }

   // Try to solve the Logger Rate Limiter problem.

    class RequestLogger {
        private int time;
        private HashMap<String, Integer> requestMap;

        public RequestLogger(int timeLimit) {
            requestMap = new HashMap<>();
            time = timeLimit;
        }

        public boolean messageRequestDecision(int timestamp, String request) {
            if(!requestMap.containsKey(request)){
                requestMap.put(request, timestamp);
                return true;
            } else {
                System.out.println("time " + requestMap.get(request) + "new time " + timestamp);
                if((timestamp-requestMap.get(request)) >= time) {
                    requestMap.put(request, timestamp);
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> greaterElement = new HashMap<>();
        Stack<Integer> minstack = new Stack<>();
        int[] ans = new int[nums1.length];

        for(int current : nums2){
            while(!minstack.isEmpty() && current > minstack.peek()){
                greaterElement.put(minstack.pop(), current);
            }

            minstack.push(current);
        }
        if(!minstack.isEmpty()){
            while(!minstack.isEmpty()){
                greaterElement.put(minstack.pop(), -1);
            }
        }

        for(int i = 0;i<nums1.length;i++){
            ans[i] = greaterElement.get(nums1[i]);
        }

        return ans;
    }

    public static int[] findMaxSlidingWindow(int[] nums, int w) {
        List<Integer> output = new ArrayList<>();
        int length = nums.length;
        System.out.println("length " + length);
        List<Integer> numslist = new ArrayList<>();
        for(int j = 0;j<w;j++){
            numslist.add(nums[j]);
        }
        int firstmax = Collections.max(numslist);
        System.out.println("first max " + firstmax);
        output.add(firstmax);
        for(int i = 1;i<=length-w;i++){
            numslist.remove(0);
            numslist.add(nums[i+w-1]);
            int max = Collections.max(numslist);
            System.out.println(" max " + max);
            output.add(max);
        }
        int[] outputarray = new int[output.size()];
        for(int k = 0;k<outputarray.length;k++){
            outputarray[k] = output.get(k);
        }

        return outputarray ;
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> output = new ArrayList<>();
        HashMap<String, Integer> stringmap = new HashMap<>();
        String initial = s.substring(0, 10);
        System.out.println("initial " + initial);
        stringmap.put(initial, 1);
        int length = s.length();
        for(int i = 1;i < length-10;i++){
            String sub = s.substring(i, i+10);
            if(stringmap.containsKey(sub)){
                int count = stringmap.get(sub);
                stringmap.put(sub, count+1);
            } else {
                stringmap.put(sub, 1);
            }
        }

        for(String key : stringmap.keySet()){
            System.out.println("key " + key + "value " + stringmap.get(key));
        }
        for(String key : stringmap.keySet()){
            if(stringmap.get(key) > 1){
                output.add(key);
            }
        }
        return output;

    }
}
