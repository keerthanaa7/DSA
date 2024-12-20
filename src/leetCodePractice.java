import java.util.*;

public class leetCodePractice {

    // find the subarray with max sum of its elements
    public int findSubArrayMax(int[] inputArray) {
        int tempSum = 0, subArraySum;
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("iteration " + i);
            subArraySum = 0;
            for (int j = i; j < inputArray.length; j++) {
                subArraySum = subArraySum + inputArray[j];
                System.out.println("sub array sum is " + subArraySum);
                if (subArraySum < 0) {
                    j = j + 1;
                    break;
                }
                if (subArraySum > tempSum)
                    tempSum = subArraySum;
            }
            System.out.println("temp sum is " + tempSum);
        }
        return tempSum;
    }

    // Best solution in O(N)
    public int findSubArrayMax2(int[] inputArray) {
        int tempSum = 0, subArraySum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            subArraySum = subArraySum + inputArray[i];
            if (subArraySum < 0) {
                subArraySum = 0;
            } else if (subArraySum > tempSum) {
                tempSum = subArraySum;
            }
        }
        return tempSum;
    }

    // find the subarray with max sum of its elements
    public int findSubArrayMax1(int[] inputArray) {
        int tempSum, subArraySum;
        int[] subArray = new int[inputArray.length];
        int[] sumArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            tempSum = 0;
            for (int k = 0; k < subArray.length; k++) {
                subArray[k] = 0;
            }
            for (int j = i; j < inputArray.length; j++) {
                subArray = Arrays.copyOfRange(inputArray, i, j);
                subArraySum = Arrays.stream(subArray).sum();
                if (subArraySum > tempSum)
                    tempSum = subArraySum;
            }
            sumArray[i] = tempSum;
        }
        return Arrays.stream(sumArray).max().getAsInt();
    }

    // you only sell after you purchase. So the first number in the array will also be the purchasing stock
    // second number will be the selling stock O(N2)
    public int findMaxProfit(int[] inputArray) {
        int maxProfit = 0, tempProfit = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++)
                if ((inputArray[j] > inputArray[i])) {
                    tempProfit = inputArray[j] - inputArray[i];
                    if (tempProfit > maxProfit) {
                        maxProfit = tempProfit;
                    }
                }
        }
        return maxProfit;
    }

    // you only sell after you purchase. So the first number in the array will also be the purchasing stock
    // second number will be the selling stock O(N)
    public int findMaxProfit1(int[] inputArray) {
        int maxProfit = 0, tempProfit, minPUrchaseValue = 0;
        maxProfit = inputArray[1] - inputArray[0] > 0 ? inputArray[1] - inputArray[0] : 0;
        for (int i = 2; i < inputArray.length; i++) {
            System.out.println("min value  " + Arrays.stream(Arrays.copyOfRange(inputArray, 0, i - 1)).min().getAsInt());
            minPUrchaseValue = Arrays.stream(Arrays.copyOfRange(inputArray, 0, i - 1)).min().getAsInt();
            if (inputArray[i] > minPUrchaseValue) {
                tempProfit = inputArray[i] - minPUrchaseValue;
                if (tempProfit > maxProfit) {
                    maxProfit = tempProfit;
                }
            }
        }
        return maxProfit;
    }

    // find the subarray with maximum product value. We need to keep builing sub array that has a positive high value
    // in maxnumber. If we encounter a negative value, we need to ignore the previous subarray and start from the next index.
    // similarly we need to store the most negative value in min number and ignore the subarray if we encounter a positive number.
    // this will help storing max positive value in max number when we multiply min number with a negative value since we
    // interchange min and max numbers.

    // Best solution
    public int findMaxProduct(int[] inputArray) {
        int maxProduct = inputArray[0];
        int tempProduct = 1;
        int maxNumber = inputArray[0];
        int minNumber = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] >= 0) {
                maxNumber = Integer.max(inputArray[i], inputArray[i] * maxNumber);
                minNumber = Integer.min(inputArray[i], inputArray[i] * minNumber);
            } else {
                tempProduct = maxNumber;
                maxNumber = Integer.max(inputArray[i], minNumber * inputArray[i]);
                minNumber = Integer.min(inputArray[i], tempProduct * inputArray[i]);
            }
            maxProduct = Integer.max(maxProduct, maxNumber);
        }
        return maxProduct;
    }

    // find the sub array with the maximum product
    public int findmaxProduct1(int[] inputArray) {
        int tempProduct = 0, maxProduct = 1;
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("iteration " + i);
            maxProduct = 1;
            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[j] == 0) {
                    break;
                }
                maxProduct = maxProduct * inputArray[j];
                if (maxProduct > tempProduct) {
                    System.out.println("max product " + maxProduct);
                    tempProduct = maxProduct;
                }
            }

        }
        return tempProduct;
    }

    // find product of the sub array ignoring the ith element.
    // O(N2)
    public void findSubArrayProductExceptforSelf(int[] inputArray) {
        int product;
        int[] productArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            product = 1;
            for (int j = 0; j < inputArray.length; j++) {
                if (i != j) {
                    product = product * inputArray[j];
                }
            }
            productArray[i] = product;
        }
        for (int i = 0; i < productArray.length; i++) {
            System.out.println("products are " + productArray[i]);
        }
    }

    public static void findSubArrayProductExceptforSelf1(int[] inputArray) {
        int[] subArrayProduct = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            subArrayProduct[i] = recursiveSpiltArray(inputArray, i, 0);

        }
        for (int i = 0; i < subArrayProduct.length; i++) {
            System.out.println("sub array products are " + subArrayProduct[i]);
        }
    }

    private static int recursiveSpiltArray(int[] inputArray, int i, int count) {
        int product = 1;
        if (inputArray.length == 1) {
            return inputArray[0];
        } else if (inputArray.length == 0) {
            return product;
        }
        int[] leftArray;
        int[] rightArray;
        if (count == 0) {
            leftArray = Arrays.copyOfRange(inputArray, 0, i);
        } else {
            leftArray = Arrays.copyOfRange(inputArray, 0, 1);
        }
        if (count == 0) {
            rightArray = Arrays.copyOfRange(inputArray, i + 1, inputArray.length);
        } else {
            rightArray = Arrays.copyOfRange(inputArray, 1, inputArray.length);
        }
        count++;
        product = product * recursiveSpiltArray(leftArray, i, count);
        product = product * recursiveSpiltArray(rightArray, i, count);
        return product;
    }

    // Best solution in O(N)
    public void findSubArrayProductExceptforSelf2(int[] inputArray) {
        int[] leftArray = new int[inputArray.length];
        int[] rightArray = new int[inputArray.length];
        int[] product = new int[inputArray.length];
        int length = inputArray.length;
        leftArray[0] = 1;
        rightArray[length - 1] = 1;
        // basically you are filling up the product of the left elements of a particular index
        // in that index position in left array
        for (int i = 1; i < length; i++) {
            leftArray[i] = inputArray[i - 1] * leftArray[i - 1];
        }
        // basically you are filling up the product of the right elements of a particular index
        // in that index position in right array
        for (int j = length - 2; j >= 0; j--) {
            rightArray[j] = rightArray[j + 1] * inputArray[j + 1];
        }
        // multiply the left product and right product of a particular index element
        for (int k = 0; k < length; k++) {
            product[k] = leftArray[k] * rightArray[k];
        }

        for (int k = 0; k < length; k++) {
            System.out.println("product " + product[k]);
        }
    }

    // 0(n) but extra memory . use one extra array
    public static void rotateArray(int[] inputArray, int rotations) {
        int[] rotatedArray = new int[inputArray.length];
        int filledpositions = 0;
        for (int k = inputArray.length - rotations, j = 0; k < inputArray.length; k++, j++) {
            rotatedArray[j] = inputArray[k];
            filledpositions = j;
        }
        for (int k = 0, j = filledpositions + 1; k < inputArray.length - rotations; k++, j++) {
            rotatedArray[j] = inputArray[k];
        }
        for (int j = 0; j < rotatedArray.length; j++) {
            System.out.println("rotate array elements are " + rotatedArray[j]);
        }
    }


    public static void rotateArray1(int[] inputArray, int rotations) {
        reverseArray(inputArray, 0, inputArray.length - 1);
        reverseArray(inputArray, 0, rotations - 1);
        reverseArray(inputArray, rotations, inputArray.length - 1);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("rotate array elements are " + inputArray[i]);
        }
    }

    public static void reverseArray(int[] inputArray, int start, int end) {
        int temp;
        int i = start;
        int j = end;
        while (i < j) {
            temp = inputArray[i];
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;
            i++;
            j--;
        }
    }

    public static int findMaxConsecutiveOnes(int[] inputArray) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 1) {
                count = count + 1;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static boolean validSudoku(char[][] board) {
        int gridNo;
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != ' ') {
                    gridNo = (i / 3) * 3 + (j / 3);
                    boolean rowPresent = rowSet[i].contains(board[i][j]);
                    boolean colPresent = colSet[j].contains(board[i][j]);
                    boolean gridPresent = gridSet[gridNo].contains(board[i][j]);
                    if (rowPresent || colPresent || gridPresent) {
                        return false;
                    }

                    rowSet[i].add(board[i][j]);
                    colSet[j].add(board[i][j]);
                    gridSet[gridNo].add(board[i][j]);
                }

            }
        }
        return true;
    }

    public static String encodeString(List<String> inputStringList) {
        if (inputStringList.isEmpty())
            return null;
        char escapeSequence = '/';
        char delimiter = ';';
        StringBuilder encodedString = new StringBuilder();
        for (String input : inputStringList) {
            for (int i = 0; i < input.length(); i++) {
                if (!Character.isLetterOrDigit(input.charAt(i))) {
                    encodedString.append(escapeSequence);
                    encodedString.append(input.charAt(i));
                } else {
                    encodedString.append(input.charAt(i));
                }
            }
            encodedString.append(delimiter);
        }
        return encodedString.toString();
    }

    public static List<String> decodeStrings(String inputString) {
        List<String> decodedStringsList = new ArrayList<>();
        char escapeSequence = '/';
        char delimeter = ';';
        StringBuilder decodedSingleString = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == escapeSequence) {
                if (!Character.isLetterOrDigit(inputString.charAt(i + 1))) {
                    decodedSingleString.append(inputString.charAt(i + 1));
                    i++;
                }
            } else if (inputString.charAt(i) == delimeter) {
                decodedStringsList.add(decodedSingleString.toString());
                decodedSingleString = new StringBuilder();
            } else {
                decodedSingleString.append(inputString.charAt(i));
            }
        }
        return decodedStringsList;
    }

    public static void moveZeroestoEnd2(int[] inputArray) {
        int nonZeroIndex = 0;
        int temp;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0) {
                temp = inputArray[nonZeroIndex];
                inputArray[nonZeroIndex] = inputArray[i];
                inputArray[i] = temp;
                nonZeroIndex++;
            }
        }
        System.out.println("Array elements ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(" " + inputArray[i]);
        }
    }


    // put open brackets in a stack when you see them in the string
    // when you see close brackets in a string , check if the matching open bracket is in stack
    public boolean validParenthesis1(String input) {
        boolean valid = false;
        Stack<Character> parenthesisStack = new Stack<>();
        List<Character> openbracketsList = Arrays.asList('(', '{', '[');
        List<Character> closebracketsList = Arrays.asList(')', '}', ']');
        for (int i = 0; i < input.length(); i++) {
            if (openbracketsList.contains(input.charAt(i))) {
                parenthesisStack.push(input.charAt(i));
            } else if (closebracketsList.contains(input.charAt(i))) {
                if (parenthesisStack.isEmpty()) {
                    valid = false;
                    break;
                } else {
                    Character poppedChar = parenthesisStack.pop();
                    if (input.charAt(i) == ')' && poppedChar == '(') {
                        valid = true;
                    } else if (input.charAt(i) == ']' && poppedChar == '[') {
                        valid = true;
                    } else if (input.charAt(i) == '{' && poppedChar == '}') {
                        valid = true;
                    } else {
                        valid = false;
                        break;
                    }
                }
            }
        }
        if (valid) {
            if (parenthesisStack.isEmpty()) {
                valid = true;
            } else {
                valid = false;
            }
        }
        System.out.println("valid parenthesis " + valid);
        return valid;
    }

    // o(n2) time space o(1) space
    public int[] findNextGreaterElement(int[] input) {
        int[] output = new int[input.length];
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            max = input[i];
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] > max) {
                    max = input[j];
                    break;
                }
            }
            if (max == input[i]) {
                max = -1;
            }
            output[i] = max;
        }
        for (int k = 0; k < output.length; k++) {
            System.out.println(output[k] + " ");
        }
        return output;
    }

    // optimized o(n) time complexity
    // o(n) space using stack
    public int[] findNextGreaterElement1(int[] input) {
        Stack<Integer> greatElementStack = new Stack<Integer>();
        int nextGreaterElement = 0;
        int[] output = new int[input.length];
        for (int i = input.length - 1; i >= 0; i--) {
            if (!greatElementStack.isEmpty()) {
                if (greatElementStack.peek() > input[i]) {
                    nextGreaterElement = greatElementStack.peek();
                    greatElementStack.push(input[i]);
                } else {
                    while (!greatElementStack.isEmpty()) {
                        if (greatElementStack.peek() < input[i]) {
                            greatElementStack.pop();
                        } else {
                            break;
                        }
                    }
                    if (greatElementStack.isEmpty()) {
                        nextGreaterElement = -1;
                    } else {
                        nextGreaterElement = greatElementStack.peek();
                    }
                    greatElementStack.push(input[i]);
                }
            } else {
                nextGreaterElement = -1;
                greatElementStack.push(input[i]);
            }
            output[i] = nextGreaterElement;
        }
        for (int k = 0; k < output.length; k++) {
            System.out.println(output[k] + " ");
        }
        return output;
    }
    public int getNextGreatElement(Stack<Integer> greatElementStack, int input) {
        int nextGreaterElement=0;
        if (!greatElementStack.isEmpty()) {
            if (greatElementStack.peek() > input) {
                nextGreaterElement = greatElementStack.peek();
                greatElementStack.push(input);
            } else {
                while (!greatElementStack.isEmpty()) {
                    if (greatElementStack.peek() < input) {
                        greatElementStack.pop();
                    } else {
                        break;
                    }
                }
                if (greatElementStack.isEmpty()) {
                    nextGreaterElement = -1;
                } else {
                    nextGreaterElement = greatElementStack.peek();
                }
                greatElementStack.push(input);
            }
        } else {
            nextGreaterElement = -1;
            greatElementStack.push(input);
        }
       return nextGreaterElement;
    }

    // circular array 0(n2) time space
    // o(1) space
    public int[] findNextGreaterElement2(int[] input) {
        Stack<Integer> greatElementStack = new Stack<Integer>();
        int nextGreaterElement = 0;
        int max = 0;

        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            max = input[i];
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] > max) {
                    max = input[j];
                    break;
                }
            }
            if (max == input[i]) {
                for (int k = 0; k < i; k++) {
                    if (input[k] > max) {
                        max = input[k];
                        break;
                    }
                }
                if (input[i] == max) {
                    max = -1;
                }
            }
            output[i] = max;

        }
        for (int k = 0; k < output.length; k++) {
            System.out.println(output[k] + " ");
        }
        return output;
    }

    // optimized. find next greater element in circular input using stack space
    public int[] findNextGreaterElement3(int[] input) {
        Stack<Integer> greatElementStack = new Stack<Integer>();
        int nextGreaterElement = 0;
        int currentElementPos=0;
        int[] output = new int[input.length];
        for(int i = input.length-1;i>=0;i--){
            if(i == input.length-1){
                currentElementPos = i;
                break;
            }
        }
        for(int j = 0;j<currentElementPos;j++){

        }
        return output;
    }

    //sliding window method useful for any subarray type problems
    //o(n)
    public void sumOfSubArray1(int[] input, int k) {
        int[] outputSum = new int[input.length - k + 1];
        int sum = 0;
        for (int i = 0; i <= input.length - k; i++) {
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    sum = sum + input[j];
                }
            } else {
                sum = sum - input[i - 1] + input[i + k - 1];
            }
            outputSum[i] = sum;
        }
        for (int j = 0; j < outputSum.length; j++) {
            System.out.println("output sum array " + outputSum[j]);
        }
    }

    // o(n). First find the substring without repeating char in the substring
    // slide the window if the substring contains the first char out of the window.
    // if not increment the length
    public int longestSubstringWithoutRepetition(String input) {
        int longestsubstringlength = 1;
        int firstsubstringlength;
        String sub = null;
        for (int i = 1; i < input.length(); ) {
            if (i == 1) {
                if (input.charAt(i) == input.charAt(0)) {
                    break;
                } else {
                    i++;
                    longestsubstringlength++;
                }
            } else {
                sub = input.substring(0, longestsubstringlength);
                if (sub.contains(String.valueOf(input.charAt(i)))) {
                    break;
                } else {
                    longestsubstringlength++;
                    i++;
                }
            }
        }
        System.out.println("first substring without repetition " + longestsubstringlength);
        firstsubstringlength = longestsubstringlength;
        int lastchartoCheckPos = longestsubstringlength;

        for (int i = 0; i < input.length() - firstsubstringlength; ) {
            sub = input.substring(i, i + longestsubstringlength);
            if (sub.contains(String.valueOf(input.charAt(lastchartoCheckPos)))) {
                if (i < input.length() - firstsubstringlength) {
                    i++;
                    if(lastchartoCheckPos<input.length()-1){
                        lastchartoCheckPos = lastchartoCheckPos + 1;
                    }
                }
            } else {
                longestsubstringlength = firstsubstringlength;
                longestsubstringlength++;
                lastchartoCheckPos = longestsubstringlength;
            }
        }
        System.out.println(" substring without repetition " + longestsubstringlength);
        return longestsubstringlength;
    }
    // two pointer method
    public int findLargestArea(int[] input) {
        int rightPointer = input.length-1;
        int leftPointer = 0;
        int width, minHeight,area=1, tempArea;
        while(leftPointer != rightPointer){
            width = rightPointer - leftPointer;
            minHeight = Integer.min(input[leftPointer], input[rightPointer]);
            tempArea = width * minHeight;
            if(area < tempArea){
                area = tempArea;
            }
            if(input[leftPointer] <= input[rightPointer]){
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        System.out.println("area " + area);
        return area;
    }
    // two pointer method
    public boolean isPalindrome(String input){
        int leftPointer, rightPointer;
        StringBuilder newString = new StringBuilder();
        for(int i = 0;i<input.length();i++){
            if(Character.isUpperCase(input.charAt(i))){
                newString.append(Character.toLowerCase(input.charAt(i)));
            } else if(Character.isLetterOrDigit(input.charAt(i))){
                newString.append(input.charAt(i));
            }
        }
        System.out.println("new string " + newString);
        leftPointer =0;
        rightPointer = newString.length()-1;
        while(leftPointer < rightPointer){
            if(newString.charAt(leftPointer) != newString.charAt(rightPointer)){
                return false;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }
        return true;
    }

    // array is sorted. Find indices of 2 numbers whose sum matches tha target sum
    public int[] twoSumTwo(int[] input, int target) {
        int leftPointer = 0;
        int tempSum=0;
        int[] outputIndices = new int[2];
        int sum = 0;
        int rightPointer = input.length - 1;
        while (leftPointer <= rightPointer) {
            tempSum = input[leftPointer] + input[rightPointer];
            if (tempSum == target) {
                outputIndices[0] = leftPointer;
                outputIndices[1] = rightPointer;
                break;
            } else if(tempSum > target){
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        System.out.println("leftpointer" + leftPointer);
        System.out.println("rightpointer" + rightPointer);
        return outputIndices;
    }


}

