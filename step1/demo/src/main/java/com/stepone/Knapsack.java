package com.stepone;

public class Knapsack {
    public static int knapsack(int maxWeight_to_carry, int[] weights_all_items, int[] values_all_items) {
        int ind = weights_all_items.length;
        int[][] arr = new int[ind + 1][maxWeight_to_carry + 1];

        for (int i = 1; i <= ind; i++) {
            for (int j = 1; j <= maxWeight_to_carry; j++) {
                if (weights_all_items[i - 1] > j) {
                    arr[i][j] = arr[i - 1][j];
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j],
                            values_all_items[i - 1] + arr[i - 1][j - weights_all_items[i - 1]]);
                }
            }
        }

        return arr[ind][maxWeight_to_carry];
    }

    public static void main(String[] args) {
        int maxWeight_to_carry = 10;
        int[] weights_all_items = new int[] { 3, 6, 8 };
        int[] values_all_items = new int[] { 50, 60, 100 };
        System.out.println(knapsack(maxWeight_to_carry, weights_all_items, values_all_items));
    }

}
