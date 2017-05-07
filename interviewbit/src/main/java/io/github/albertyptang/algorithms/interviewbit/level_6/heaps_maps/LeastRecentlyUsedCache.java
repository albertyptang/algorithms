package io.github.albertyptang.algorithms.interviewbit.level_6.heaps_maps;

import java.util.LinkedHashMap;

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.
 * <p>
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present.
 * When the cache reaches its capacity, it should invalidate the least recently used item before inserting the new item.
 * The LRUCache will be initialized with an integer corresponding to its capacity.
 * Capacity indicates the maximum number of unique keys it can hold at a time.
 * <p>
 * Definition of “least recently used” : An access to an item is defined as a get or a set operation of the item.
 * “Least recently used” item is the one with the oldest access time.
 * <p>
 * NOTE: If you are using any global variables, make sure to clear them in the constructor.
 * <p>
 * Example :
 * <p>
 * Input :
 * capacity = 2
 * set(1, 10)
 * set(5, 12)
 * get(5)        returns 12
 * get(1)        returns 10
 * get(10)       returns -1
 * set(6, 14)    this pushes out key = 5 as LRU is full.
 * get(5)        returns -1
 *
 * @author atang
 */
public class LeastRecentlyUsedCache {

    private final int capacity;
    private int size = 0;

    // used linked hash map to maintain order.
    private LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LeastRecentlyUsedCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        } else {
            final int value = cache.get(key);
            // remove old key and replace it to update its order.
            cache.remove(key);
            cache.put(key, value);
            return value;
        }
    }

    public void set(int key, int value) {
        if (cache.containsKey(key)) {
            // remove old key if it already exists to update its order.
            cache.remove(key);
        } else if (size == capacity) {
            // clean out cache if at capacity.
            final int firstKey = cache.keySet().iterator().next();
            cache.remove(firstKey);
        } else {
            size++;
        }
        cache.put(key, value);
    }
}
