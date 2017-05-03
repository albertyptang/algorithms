package io.github.albertyptang.algorithms.interviewbit.stacks_queues;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) – Push element x onto stack.
 * pop() – Removes the element on top of the stack.
 * top() – Get the top element.
 * getMin() – Retrieve the minimum element in the stack.
 * Note that all the operations have to be constant time operations.
 *
 * Questions to ask the interviewer :
 *
 * Q: What should getMin() do on empty stack?
 * A: In this case, return -1.
 *
 * Q: What should pop do on empty stack?
 * A: In this case, nothing.
 *
 * Q: What should top() do on empty stack?
 * A: In this case, return -1
 * NOTE : If you are using your own declared global variables, make sure to clear them out in the constructor.
 *
 * @author atang
 */
public class MinStack {

    private final Stack<Integer> array = new Stack<>();
    private Integer min;
    private final Stack<Integer> minSortedArray = new Stack<>();

    public void push(int x) {
        array.push(x);
        if (min == null || x <= min) {
            minSortedArray.push(x);
            min = x;
        }
    }

    public void pop() {
        if (array.size() > 0) {
            final int removed = array.pop();
            if (removed == min) {
                minSortedArray.pop();
                min = minSortedArray.size() > 0 ? minSortedArray.peek() : null;
            }
        }
    }

    public int top() {
        return array.size() > 0 ? array.peek() : -1;
    }

    public int getMin() {
        return min == null ? -1 : min;
    }
}
