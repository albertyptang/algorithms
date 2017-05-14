package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.List;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Example :
 * <p>
 * Input : [1 2]
 * Return :  1
 *
 * @author atang
 */
public class BestTimeToBuyAndSellStocksI {
    public static int maxProfit(final List<Integer> a) {
        // find largest difference between a min and a max with greater index.
        int max = 0;
        int buy = Integer.MAX_VALUE;
        for (int i = 0; i < a.size(); i++) {
            final int price = a.get(i);
            max = Math.max(price - buy, max);
            buy = Math.min(price, buy);
        }
        return max;
    }
}
