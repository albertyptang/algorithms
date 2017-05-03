package io.github.albertyptang.algorithms.interviewbit.stacks_queues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class MinStackTest {
    @Test
    public void push() throws Exception {
        final MinStack stack = new MinStack();
        assertEquals(-1, stack.top());
        stack.push(1);
        assertEquals(1, stack.top());
    }

    @Test
    public void pop() throws Exception {
        final MinStack stack = new MinStack();
        stack.push(1);
        assertEquals(1, stack.top());
        stack.pop();
        assertEquals(-1, stack.top());
        stack.pop();
        assertEquals(-1, stack.top());
    }

    @Test
    public void getMin() throws Exception {
        final MinStack stack = new MinStack();
        stack.push(2);
        stack.push(3);
        stack.push(1);
        assertEquals(1, stack.getMin());
        stack.pop();
        assertEquals(2, stack.getMin());
        stack.pop();
        stack.pop();
        assertEquals(-1, stack.getMin());
    }
}