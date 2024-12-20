import java.util.LinkedList;

public class LinkedListCharStack {
    LinkedList<Character> charStack;
    String input;
    int size;
    StringBuilder stringBuilder;

    public LinkedListCharStack() {
        charStack = new LinkedList< Character>();
    }

    public boolean checkPalindrome(String input) {

        // Since stack is a LIFO, it pops out the characters in reverse order.
        // Store the input without punctuation in a string builder and push the contents to a stack.
        // pop the contents and then store it in a string builder( it will be stored in reverse order)
        StringBuilder stringWithoutPunctuation = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                stringWithoutPunctuation.append(input.charAt(i));
            }
        }
        System.out.println("string without punctuation is " + stringWithoutPunctuation);
        System.out.println("length of a string without punctuation is " + stringWithoutPunctuation.length());
        for (int i = 0; i < stringWithoutPunctuation.length(); i++) {
            System.out.println("character pushed is " + stringWithoutPunctuation.charAt(i));
            charStack.push(stringWithoutPunctuation.charAt(i));
        }
        System.out.println("stack size is " + charStack.size());
        StringBuilder reverseString = new StringBuilder(charStack.size());
        while (!charStack.isEmpty()) {
            reverseString.append(charStack.pop());
        }

        System.out.println("reverse string is " + reverseString);
        for(int i =0;i<stringWithoutPunctuation.length();i++){
            if(stringWithoutPunctuation.charAt(i) != reverseString.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public boolean checkPalindromUsingStackandQueue(String input){
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> charQueue = new LinkedList<Character>();
        for(int i =  0;i<input.length();i++){
            if(Character.isLetter(input.charAt(i))) {
                stack.push(input.charAt(i));
                charQueue.add(input.charAt(i));
            }
        }
        System.out.println("stack length "+ stack.size());
        System.out.println("queue length "+ charQueue.size());
        while(!stack.isEmpty() && !charQueue.isEmpty()){
            if(stack.pop() != charQueue.pollFirst()){
                return false;
            }
        }
        return true;
    }
}

