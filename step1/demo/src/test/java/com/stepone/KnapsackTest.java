package com.stepone;

import org.junit.Test;
import static org.junit.Assert.*;

public class KnapsackTest {
    @Test
    public void testKnapsack() {
        int maxWeight_to_carry = 5;
        int[] weights_all_items = { 1, 2, 3 };
        int[] values_all_items = { 60, 100, 120 };
        int expected = 220;
        int result = Knapsack.knapsack(maxWeight_to_carry, weights_all_items, values_all_items);
        assertEquals(expected, result);
    }

    @Test
    public void testKnapsack_with_no_valid_items() {
        int maxWeight_to_carry = 1;
        int[] weights_all_items = { 2, 3, 4 };
        int[] values_all_items = { 60, 100, 120 };
        int expected = 0;
        int result = Knapsack.knapsack(maxWeight_to_carry, weights_all_items, values_all_items);
        assertEquals(expected, result);
    }

    @Test
    public void testKnapsack_with_max_weight_0() {
        int maxWeight_to_carry = 0;
        int[] weights_all_items = { 1, 2, 3 };
        int[] values_all_items = { 60, 100, 120 };
        int expected = 0;
        int result = Knapsack.knapsack(maxWeight_to_carry, weights_all_items, values_all_items);
        assertEquals(expected, result);
    }
}
