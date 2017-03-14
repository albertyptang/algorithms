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
        assertEquals(dynamicArray.length(), 16); // initial capacity.
        while (counter != 17) { // greater than initial capacity.
            dynamicArray.add(0);
            counter++;
        }
        assertEquals(dynamicArray.length(), 32); // double capacity.
    }
}
