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

    IntegerNode newhead;
    public IntegerNode reverseListRecursive(IntegerNode head) {
        if(head == null)
            return null;

        IntegerNode last = recursiveReverse(head);
        last.setNext(null);
        head = newhead;
        return head;
    }

    public IntegerNode recursiveReverse(IntegerNode node) {
        if (node.getNext() == null) {
            newhead = node;
            return node;
        } else {
            IntegerNode last = recursiveReverse(node.getNext());
            last.setNext(node);
            return node;
        }
    }

    public IntegerNode mergeTwoSortedLists(IntegerNode head1, IntegerNode head2) {
        IntegerNode current1 = head1;
        IntegerNode current2 = head2;
        IntegerNode mergedHead = null;
        IntegerNode newNode = null;
        IntegerNode currentMerged = null;
        while (current1 != null || current2 != null) {
            if (current1 != null && current2 != null && current1.getData() <= current2.getData()) {
                newNode = new IntegerNode(current1.getData());
                current1 = current1.getNext();
            } else if (current1 != null && current2 != null && current1.getData() >= current2.getData()) {
                newNode = new IntegerNode(current2.getData());
                current2 = current2.getNext();
            } else if (current1 == null && current2 != null) {
                while (current2 != null) {
                    newNode = new IntegerNode(current2.getData());
                    current2 = current2.getNext();
                }
            } else if (current2 == null && current1 != null) {
                while (current1 != null) {
                    newNode = new IntegerNode(current1.getData());
                    current1 = current1.getNext();
                }
            }
            if (mergedHead == null) {
                mergedHead = newNode;
            } else {
                currentMerged = mergedHead;
                while (currentMerged.getNext() != null) {
                    currentMerged = currentMerged.getNext();
                }
                currentMerged.setNext(newNode);
                newNode.setNext(null);
            }
        }
        return mergedHead;
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

    // The last element of the linked list does not point to null and instead points
    // to another element
    public boolean hasCycle(IntegerNode head) {
        IntegerNode fast = head;
        IntegerNode slow = head;
        // there is 0 element or 1 element
        if(head == null || head.getNext() == null){
            return false;
        }
        while(slow != null && fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // find the position at which the cycle begins
    public IntegerNode findCycleStartPosition(IntegerNode head) {
        if(head == null || head.getNext() == null){
            return null;
        }
        IntegerNode slow = head;
        IntegerNode fast = head;
        while(slow != null && fast != null && fast.getNext() != null){
            fast = fast.getNext();
            slow = slow.getNext();
            if(fast == slow){
                IntegerNode third = head;
                while(third != fast){
                    fast = fast.getNext();
                    third = third.getNext();
                }
                return third;
            } else{
                return null;
            }
        }
        return null;
    }// O(N) time compelxity and two loops. One loop to reverse the list and another loop
    // to iterate again to find the intersection node.
    public IntegerNode getIntersectionNode(IntegerNode head1, IntegerNode head2){
        IntegerNode intersectionNode = null;
        IntegerNode reversehead1 = reverseListIterative1(head1);
        printLinkedList(reversehead1);
        IntegerNode reversehead2 = reverseListIterative1(head2);
        printLinkedList(reversehead2);
        IntegerNode current1 = reversehead1;
        IntegerNode current2 = reversehead2;
        while(current1 != null && current2 != null){
            if(current1.getData() == current2.getData()){
                intersectionNode = current1;
                current1 = current1.getNext();
                current2 = current2.getNext();
            } else{
                break;
            }
        }
        if(intersectionNode != null){
            System.out.println("intersection node is " + intersectionNode.getData());
            return intersectionNode;
        } else{
            return null;
        }
    }

    public IntegerNode findIntersectionNode1(IntegerNode head1, IntegerNode head2) {
        IntegerNode intersectionNode = null;
        IntegerNode current1 = head1;
        IntegerNode current2 = head2;
        int length1 = findTotalNUmberOfNodes(head1);
        int length2 = findTotalNUmberOfNodes(head2);
        if (length1 > length2) {
            int count = length1 - length2;
            while (current1 != null && count != 0) {
                current1 = current1.getNext();
                count--;
            }
        } else {
            int count = length2 - length1;
            while (current2 != null && count != 0) {
                current2 = current2.getNext();
                count--;
            }
        }
        while (current1 != null && current2 != null) {
            if (current1.getData() == current2.getData()) {
                intersectionNode = current1;
                while (current1 != null && current2 != null) {
                    if (current1.getData() != current2.getData()) {
                        intersectionNode = null;
                        break;
                    } else {
                        current1 = current1.getNext();
                        current2 = current2.getNext();
                    }
                }
            } else {
                current1 = current1.getNext();
                current2 = current2.getNext();
            }
        }

        System.out.println("intersection node " + intersectionNode.getData());
        return intersectionNode;
    }

    public IntegerNode addTwoLists(IntegerNode head1, IntegerNode head2) {
        IntegerNode sumHead = null;
        IntegerNode sumNode;
        IntegerNode current1 = head1;
        IntegerNode current2 = head2;
        int sum, carry = 0;
        IntegerNode sumCurrent;
        while (current1 != null & current2 != null) {
            sum = current1.getData() + current2.getData()+carry >= 10 ? (current1.getData() + current2.getData()+carry) % 10 : current1.getData() + current2.getData() + carry;
            carry = current1.getData() + current2.getData() +carry>= 10 ? (current1.getData() + current2.getData()+carry) / 10 : 0;
            sumNode = new IntegerNode(sum);
            if (sumHead == null) {
                sumHead = sumNode;
                sumNode.setNext(null);
            } else {
                sumCurrent = sumHead;
                while (sumCurrent.getNext() != null) {
                    sumCurrent = sumCurrent.getNext();
                }
                sumCurrent.setNext(sumNode);
            }
            current1 = current1.getNext();
            current2 = current2.getNext();
        }

        if (current1 != null) {
            while (current1 != null) {
                sum = current1.getData() + carry >= 10 ? (current1.getData() + carry) % 10 : current1.getData() + carry;
                carry = current1.getData() + carry >= 10 ? (current1.getData() + carry) / 10 : 0;
                sumNode = new IntegerNode(sum);
                if (sumHead == null) {
                    sumHead = sumNode;
                    sumNode.setNext(null);
                } else {
                    sumCurrent = sumHead;
                    while (sumCurrent.getNext() != null) {
                        sumCurrent = sumCurrent.getNext();
                    }
                    sumCurrent.setNext(sumNode);
                }
                current1 = current1.getNext();
            }
        } else if (current2 != null) {
            while (current2 != null) {
                sum = current2.getData() + carry >= 10 ? (current2.getData() + carry) % 10 : current2.getData() + carry;
                carry = current2.getData() + carry >= 10 ? (current2.getData() + carry) / 10 : 0;
                sumNode = new IntegerNode(sum);
                if (sumHead == null) {
                    sumHead = sumNode;
                    sumNode.setNext(null);
                } else {
                    sumCurrent = sumHead;
                    while (sumCurrent.getNext() != null) {
                        sumCurrent = sumCurrent.getNext();
                    }
                    sumCurrent.setNext(sumNode);
                }
                current2 = current2.getNext();
            }
        }
        if(carry > 0){
            sumNode = new IntegerNode(carry);
            sumCurrent = sumHead;
            while (sumCurrent.getNext() != null) {
                sumCurrent = sumCurrent.getNext();
            }
            sumCurrent.setNext(sumNode);
        }

        printLinkedList(sumHead);
        return sumHead;
    }

   /* public static boolean palindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode middle = findMiddle(head);
        System.out.println("middle " + middle.val);

        ListNode reverse = reverseLinkedList(middle);
        System.out.println("reverese head " + reverse.val);
        System.out.println("printling nodes of the second half reversed");
        ListNode tempReverse = reverse;
        while (tempReverse != null) {
            System.out.println(tempReverse.val + " ");
            tempReverse = tempReverse.next;
        }
        tempReverse = reverse;
        ListNode tempHead = head;
        while (tempHead != middle && tempReverse != null) {
            System.out.println("temphead val " + tempHead.val);
            System.out.println("temp reverese val" + tempReverse.val);
            if (tempHead.val != tempReverse.val) {
                return false;
            } else {
                tempHead = tempHead.next;
                tempReverse = tempReverse.next;
            }

        }

        return true;

    }

    public static ListNode findMiddle(ListNode headTemp) {
        if (headTemp == null) {
            return null;
        }
        ListNode fast = headTemp;
        ListNode slow = headTemp;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode reverseLinkedList(ListNode headTemp) {
        if (headTemp == null) {
            return null;
        }
        ListNode temp = headTemp;
        ListNode fast = headTemp;
        ListNode prev = null;
        while (fast != null) {
            temp = fast;
            fast = fast.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }
    */

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        // find cycle where fast moves 2 steps and slow moves 1 step. fast and slow move to the position
        // represented by that position
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(fast == slow){
                break;
            }
        }
        // cycle is detected. fast and slow meet at some intersection point not
        // necessarily the entry point
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }

  /*  public static int twinSum(ListNode head) {
        if(head == null){
            return -1;
        }
        ListNode slow = head;
        ListNode fast = slow;
        int sum =0;
        int length = findLinkedListLength(head);
        System.out.println("length of list " + length);
        for(int i =0;i<length/2;i++){
            int fastIndex = length - 1-i;
            fast = head;
            for(int j = 0;j<fastIndex;j++){
                fast = fast.next;
            }
            int tempSum = slow.val + fast.val;
            if(sum < tempSum){
                sum = tempSum;
            }
            slow = slow.next;
        }
        return sum;

    }

    public static int findLinkedListLength(ListNode headTemp){
        ListNode temp = headTemp;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
*/
 /* public static ListNode[] splitCircularLinkedList(ListNode head) {
      ListNode[] arraynode = new ListNode[2];
      ListNode head1 = head;
      ListNode head2 = head;
      ListNode slow = head;
      ListNode fast = head;
      while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
          if(fast == head || head.next == fast){
              break;
          }
      }
      head2 = slow;
      head1 = head;
      while(slow.next != head1){
          slow = slow.next;
      }
      slow.next = head2;
      slow = head1;
      while (slow.next != head2){
          slow = slow.next;
      }
      slow.next = head1;
      arraynode[0] = head1;
      arraynode[1] = head2;
      return arraynode;
  }*/
  /*public static int countCycleLength(ListNode head) {
      if(head == null){
          return 0;
      }
      ListNode fast = head;
      ListNode slow = head;
      while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
          if(fast == slow){
              int count = 1;
              slow = slow.next;
              while(slow != fast){
                  count++;
                  slow = slow.next;
              }
              return count;
          }
      }

      // Replace this placeholder return statement with your code

      return 0;
  }*/

}
