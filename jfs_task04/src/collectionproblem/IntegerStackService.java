package collectionproblem;

import java.util.Stack;

// Service class to manage stack operations
public class IntegerStackService {

    private Stack<Integer> stack = new Stack<>();

    // Push element onto stack
    public void pushElement(int value) {
        stack.push(value);
        System.out.println(value + " pushed to stack");
    }

    // Pop element from stack
    public void popElement() {
        if (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        } else {
            System.out.println("Stack is empty. Cannot pop");
        }
    }

    // Check if stack is empty
    public void checkEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
