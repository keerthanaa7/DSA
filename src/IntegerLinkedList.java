public class IntegerLinkedList {
    private IntegerNode head;
    public void addNodeToFront(int data) {
        IntegerNode newNode = new IntegerNode(data);
        if(head == null){
            head = newNode;
            newNode.setNext(null);
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public IntegerNode deleteNodeAtFront() {
        if(head == null)
        {
         System.out.println("nothing to delete, head is empty");
         return null;
        } else{
            IntegerNode deletedNode = head;
            head = head.getNext();
            return deletedNode;
        }
    }

    public void printLinkedList(IntegerNode headInput) {
        if(headInput == null){
            System.out.println("Head is empty nothing to print");
            return;
        }
        System.out.println("Elements of the linked list are ");
        IntegerNode current = headInput;
        while(current != null){
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }

    public IntegerNode getHead() {
        System.out.println("Head " + head.getData());
        return head;
    }

    public IntegerNode addNodeAtEnd(int data, IntegerNode headInput){
        if(headInput == null){
            IntegerNode newNode = new IntegerNode(data);
            return newNode;
        }
        IntegerNode current = headInput;
        while(current.getNext() != null){
            current = current.getNext();
        }
        IntegerNode newNode = new IntegerNode(data);
        current.setNext(newNode);
        newNode.setNext(null);
        return headInput;
    }

    // O(N) time complexity and O(1) space. New nodes are created
    // new list is not created. existing list is reversed
    public IntegerNode reverseListIterative1(IntegerNode head) {
        IntegerNode prev = null;
        IntegerNode temp;
        IntegerNode current = head;
        while(current != null){
            temp = current.getNext();
            current.setNext(prev);
            prev =current;
            current= temp;
        }
        return prev;
    }

    // O(N) time complexity O(N) extra space. new list is created
    public IntegerNode reverseListIterative(IntegerNode head) {
        IntegerNode headReverse = null;
        IntegerNode current = head;
        IntegerNode reverseNode;
        while(current !=null){
            if(headReverse == null){
                headReverse = new IntegerNode(head.getData());
                headReverse.setNext(null);
            } else{
                reverseNode = new IntegerNode(current.getData());
                reverseNode.setNext(headReverse);
                headReverse = reverseNode;
            }
            current = current.getNext();
        }
        return headReverse;
    }

    // optimized solution. we need to delete the nth node from the end.
    // we let the fast pointer move fast by reaching the end node. we create a
    // gap between fast and slow for n+1 nodes because slow pointer needs to be
    // at the position before the nthnode from end that we want to delete.
    // so only once fast pointer will travel at n+1 speed . After that fast and slow
    // will iterate one step at a time
    public IntegerNode deleteNthNodeFromEnd(IntegerNode head, int nodePositionFromEnd) {
        IntegerNode fast = head;
        IntegerNode slow = head;
        int count = 0;
        if (fast.getNext() == null) {
            System.out.println("only one node and that is deleted");
            return null;
        } else if (fast.getNext().getNext() == null) {
            System.out.println("only two nodes");
            if (nodePositionFromEnd == 1) {
                fast.setNext(null);
                return fast;
            } else if (nodePositionFromEnd == 2) {
                fast = fast.getNext();
                return fast;
            }
        } else {
            slow = slow.getNext();
            while (count != nodePositionFromEnd + 1) {
                fast = fast.getNext();
                count++;
            }
            while (fast.getNext() != null) {
                slow = slow.getNext();
                fast = fast.getNext();
            }
            slow.setNext(slow.getNext().getNext());
        }
        return head;
    }

    // O(N) time complexity
    public IntegerNode retrieveNthnodeFromEnd(IntegerNode head, int nodePosition) {
        int totalNumberofNodes = findTotalNUmberOfNodes(head);
        int nodePositionFromFront = totalNumberofNodes - nodePosition +1;
        IntegerNode nthNodeFromEnd ;
        IntegerNode current = head;
        int count = 1;
        while(count != nodePositionFromFront){
            current = current.getNext();
            count++;
        }
        System.out.println("nth node frome end is " + current.getData());
        nthNodeFromEnd = current;
        return nthNodeFromEnd;
    }

    public IntegerNode getIntersectionNode(IntegerNode head1, IntegerNode head2){
        IntegerNode intersectionNode = null;
        return intersectionNode;
    }

    // 6 5 4 3 2 1 7 is the original list
    // new list should be take the first element followed by last element followed by second element followed
    // second last element
    // reorder list should be like this 6 7 5 1 4 2 3
    // 0(N) time complexity
    // o(2n) space complexity
    public IntegerNode reOrderList(IntegerNode head) {
        IntegerNode reverseHead = reverseListIterative(head);
        int currentCount = 0, currentReverseCount = 0;
        IntegerNode reOrderedListHead = null;
        IntegerNode reOrderedListNode = null;
        IntegerNode current, currentReverse, currentReorderedList = null;
        current = head;
        currentReverse = reverseHead;
        while (current.getData() != currentReverse.getData()) {
            if (reOrderedListHead == null) {
                reOrderedListNode = new IntegerNode(current.getData());
                reOrderedListHead = reOrderedListNode;
                currentCount++;
                current = current.getNext();
            } else {
                currentReorderedList = reOrderedListHead;
                while (currentReorderedList.getNext() != null) {
                    currentReorderedList = currentReorderedList.getNext();
                }
                if (currentCount > currentReverseCount) {
                    reOrderedListNode = new IntegerNode(currentReverse.getData());
                    currentReverse = currentReverse.getNext();
                    currentReverseCount++;
                } else {
                    reOrderedListNode = new IntegerNode(current.getData());
                    current = current.getNext();
                    currentCount++;
                }
                currentReorderedList.setNext(reOrderedListNode);
                reOrderedListNode.setNext(null);
            }
            currentReorderedList = reOrderedListHead;
            while (currentReorderedList.getNext() != null) {
                currentReorderedList = currentReorderedList.getNext();
            }
        }
        reOrderedListNode = new IntegerNode(current.getData());
        currentReorderedList.setNext(reOrderedListNode);
        reOrderedListNode.setNext(null);
        return reOrderedListHead;
    }

    // O(N) time complexity since we are finding the total count
    // middle node varies based on the size of the list if its odd or even .
    public IntegerNode findMiddleNode(IntegerNode head) {
        int middle = findTotalNUmberOfNodes(head) % 2 == 0 ? findTotalNUmberOfNodes(head) / 2 : findTotalNUmberOfNodes(head) / 2 + 1;
        IntegerNode middleNode;
        int count = 0;
        IntegerNode current = head;
        while (count != middle - 1) {
            current = current.getNext();
            count++;
        }
        middleNode = new IntegerNode(current.getData());
        System.out.println("middle node is " + middleNode.getData());
        return middleNode;
    }

    // optimized solution. fast is travelling twice as fast as slow and that is
    // why we are able to find out the middle node by this method.
    public IntegerNode findMiddleNode1(IntegerNode head) {
        IntegerNode slow = head;
        IntegerNode fast = head;
        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        System.out.println("middle node "+ slow.getData());
        return slow;
    }
    public int findMiddleNodePosition(IntegerNode head) {
        IntegerNode slow = head;
        IntegerNode fast = head;
        int count = 1;
        while(fast.getNext() != null && fast.getNext().getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            count++;

        }
        System.out.println("position of the middle node "+ count);
        return count;
    }


    public int findTotalNUmberOfNodes(IntegerNode head){
        int count = 0;
        IntegerNode current = head;
        while(current != null){
            current = current.getNext();
            count++;
        }
        System.out.println("count " + count);
        return count;
    }
}
