package io.github.albertyptang.util.collection.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author atang
 */
public class DynamicArrayTest {
    @Test
    public void add() throws Exception {
        final DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
        int counter = 0;
        assertEquals(16, dynamicArray.length()); // initial capacity.
        while (counter != 17) { // greater than initial capacity.
            dynamicArray.add(0);
            counter++;
        }
        assertEquals(32, dynamicArray.length()); // double capacity.
    }
}
