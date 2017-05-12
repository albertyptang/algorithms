package io.github.albertyptang.algorithms.interviewbit.level_7.dynamic_programming;

import java.util.List;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * <p>
 * Example :
 * <p>
 * Input : [1 2 3]
 * Return : 2
 *
 * @author atang
 */
public class BestTimeToBuyAndSellStocksII {

    public static int maxProfit(final List<Integer> a) {
        int maxProfit = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            final int currentPrice = a.get(i);
            final int tomorrowPrice = a.get(i + 1);
            final int profit = tomorrowPrice - currentPrice;
            // sell whenever you can make a profit.
            maxProfit += Math.max(0, profit);
        }
        return maxProfit;
    }
}
