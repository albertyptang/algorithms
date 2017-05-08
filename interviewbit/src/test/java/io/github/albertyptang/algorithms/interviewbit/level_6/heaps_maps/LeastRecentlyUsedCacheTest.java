package io.github.albertyptang.algorithms.interviewbit.level_6.heaps_maps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class LeastRecentlyUsedCacheTest {
    @Test
    public void test() throws Exception {
        final LeastRecentlyUsedCache lruCache = new LeastRecentlyUsedCache(2);
        lruCache.set(1, 10);
        lruCache.set(5, 12);
        assertEquals(12, lruCache.get(5));
        assertEquals(10, lruCache.get(1));
        assertEquals(-1, lruCache.get(10));
        lruCache.set(6, 14);
        assertEquals(-1, lruCache.get(5));
    }
}